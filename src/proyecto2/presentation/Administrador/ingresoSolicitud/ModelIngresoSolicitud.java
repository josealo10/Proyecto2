package proyecto2.presentation.Administrador.ingresoSolicitud;

import java.util.ArrayList;
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

    private ArrayList<Bien> bienes;
    private Bien bien;
    private Solicitud solicitud;
    private DefaultTableModel tableModel;
    private Dao db;

    public ModelIngresoSolicitud() throws Exception {
        this.bienes = new ArrayList<>();
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
        if (!bienes.isEmpty()) {
            this.db.addSolicitud(solicitud);
            this.solicitud.setCodigo(this.db.ultimaSolicitud());

            for (Bien b : bienes) {
                this.db.addBien(b);
            }
        } else {
            throw new Exception("No hay bienes registrados");
        }
    }

    public void agregarBien() throws Exception {
        if (this.solicitud == null) {
            this.solicitud = new Solicitud(0, new Date(),
                    this.db.searchFuncionario(Application.CONTROLLER_USUARIO.getModel().getUsuario().getId()),
                    this.db.searchDependencia(this.db.searchFuncionario(Application.CONTROLLER_USUARIO.getModel().getUsuario().getId()).getDependencia().getId()));
        }

        this.bien.setSolicitud(this.solicitud);
        Object[] o = new Object[]{this.bien.getCantidad(), this.bienes.size() + 1, this.bien.getMarca(), this.bien.getModelo()};
        this.tableModel.addRow(o);
        this.bienes.add(bien);
    }
}
