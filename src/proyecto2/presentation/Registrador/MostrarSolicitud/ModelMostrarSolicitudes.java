package proyecto2.presentation.Registrador.MostrarSolicitud;

import java.util.Observable;
import java.util.Observer;
import javax.swing.table.DefaultTableModel;
import proyecto2.Application;
import proyecto2.data.Dao;
import proyecto2.logic.Activo;
import proyecto2.logic.Solicitud;

/*
 * @author Alessandro Fazio Pérez / Jose Alonso Alfaro Perez
 */
public class ModelMostrarSolicitudes extends Observable {

    private Dao db;
    private DefaultTableModel jf_tableModel;
    private DefaultTableModel jd_tableModel;

    public ModelMostrarSolicitudes() {
        this.db = new Dao();
    }

    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
        this.setChanged();
        this.notifyObservers(null);
    }

    public Dao getDb() {
        return db;
    }

    public DefaultTableModel getJf_tableModel() {
        return jf_tableModel;
    }

    public void setJf_tableModel(DefaultTableModel jf_tableModel) {
        this.jf_tableModel = jf_tableModel;
    }

    public DefaultTableModel getJd_tableModel() {
        return jd_tableModel;
    }

    public void setJd_tableModel(DefaultTableModel jd_tableModel) {
        this.jd_tableModel = jd_tableModel;
    }

    public void llenarTabla() throws Exception {
        for (Solicitud s : this.db.searchSolicitudes("registrador", this.db.searchUsuario(Application.CONTROLLER_USUARIO.getModel().getUsuario().getId()).getId())) {
            if (s.getEstado().equals("Aprobada")) {
                Object[] o = new Object[]{s.getCodigo(), s.getDependencia().getNombre() + " (" + s.getDependencia().getId() + ")",
                    s.getFuncionario().getNombre() + " (" + s.getFuncionario().getId() + ")"};
                jf_tableModel.addRow(o);
            }
        }

        if (jf_tableModel.getRowCount() == 0) {
            throw new Exception("No existen solicitudes por procesar");
        }
    }

    public void cambiarEstado(int codigo, String estado) throws Exception {
        this.db.setEstadoSolicitud(codigo, estado);
    }
    
    public void llenarCatalogo() throws Exception {
        for (Activo a: this.db.searchAllActivo()){
            Object[] o = new Object[]{a.getCodigo(), a.getMarca(), a.getModelo(), a.getCategoria().getNombre(), "$" + a.getPrecio()};
            jd_tableModel.addRow(o);
        }
    }
    
}
