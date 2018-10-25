package proyecto2.presentation.Administrador.ingresoSolicitud;

import java.util.Date;
import java.util.Observable;
import java.util.Observer;
import javax.swing.table.DefaultTableModel;
import proyecto2.Application;
import proyecto2.data.Dao;
import proyecto2.logic.Bien;
import proyecto2.logic.Solicitud;

/*
 * @author Alessandro Fazio Pérez / Jose Alonso Alfaro Perez
 */
public class ModelIngresoSolicitud extends Observable {

    private Bien bien;
    private Solicitud solicitud;
    private DefaultTableModel tableModel;
    private Dao db;

    public ModelIngresoSolicitud() throws Exception {
        this.db = new Dao();
        this.bien = new Bien();
    }

    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
        this.setChanged();
        this.notifyObservers(null);
    }

    public Bien getBien() {
        return bien;
    }

    public void setBien(Bien bien) {
        this.bien = bien;
    }

    public Dao getDb() {
        return db;
    }

    public Solicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }

    public DefaultTableModel getTableModel() {
        return tableModel;
    }

    public void setTableModel(DefaultTableModel tableModel) {
        this.tableModel = tableModel;
    }

    public void agregarSolicitud() throws Exception {
        this.db.addSolicitud(solicitud, this.db.searchFuncionario(Application.CONTROLLER_USUARIO.getModel().getUsuario().getId()));
    }

    public void agregarBien() throws Exception {
        if (this.solicitud == null) {
            this.solicitud = new Solicitud(this.db.ultimaSolicitud() + 1, new Date(), this.db.searchFuncionario(Application.CONTROLLER_USUARIO.getModel().getUsuario().getId()));
        }
        
        this.bien.setSolicitud(this.solicitud);
        Object[] o = new Object[]{this.bien.getCantidad(), this.db.ultimoBien() + 1, this.bien.getMarca(), this.bien.getModelo()};
        this.tableModel.addRow(o);
        this.db.addBien(bien);
    }
}
