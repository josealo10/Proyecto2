package proyecto2.presentation.Registrador.MostrarSolicitud;

import java.util.Observable;
import javax.swing.table.DefaultTableModel;
import proyecto2.Application;
import proyecto2.data.Dao;
import proyecto2.logic.Categoria;
import proyecto2.logic.Solicitud;

/*
 * @author Alessandro Fazio Pérez / Jose Alonso Alfaro Perez
 */
public class ModelMostrarSolicitudes extends Observable {

    private Dao db;
    private DefaultTableModel jf_tableModel;

    public ModelMostrarSolicitudes() {
        this.db = new Dao();
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

}
