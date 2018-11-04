package proyecto2.presentation.Jefe.AsignarRegistrador;

import java.util.ArrayList;
import java.util.Observable;
import javax.swing.table.DefaultTableModel;
import proyecto2.data.Dao;
import proyecto2.logic.Bien;
import proyecto2.logic.Funcionario;
import proyecto2.logic.Solicitud;

/*
 * @author Alessandro Fazio Pérez / Jose Alonso Alfaro Perez
 */
public class ModelAsignarRegistrador extends Observable {

    private Dao db;
    private DefaultTableModel jf_tableModel;
    private DefaultTableModel jd_tableModel;

    public ModelAsignarRegistrador() {
        this.db = new Dao();
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

    public void jf_llenarTabla() throws Exception {
        for (Solicitud s : this.db.searchSolicitudesAprobadas()) {
            if (s.getRegistrador() == null) {
                Object[] o = new Object[]{s.getCodigo(), s.getDependencia().getNombre() + " (" + s.getDependencia().getId() + ")",
                    s.getFuncionario().getNombre() + " (" + s.getFuncionario().getId() + ")", s.getFecha()};
                jf_tableModel.addRow(o);
            }
        }
        
        if (jf_tableModel.getRowCount() == 0){
            throw new Exception("No existen solicitudes sin registrador");
        }
    }

    public void jd_llenarTabla(int codigo) throws Exception {
        for (Bien b : this.db.searchBienes(codigo)) {
            Object[] o = new Object[]{b.getCodigo(), b.getCantidad(), b.getMarca(), b.getModelo(), "$" + b.getPrecio()};
            jd_tableModel.addRow(o);
        }
    }

    public void asignarRegistrador(int codigo, String registrador) throws Exception {
        this.db.setRegistrador(codigo, registrador);
    }

    public ArrayList<Funcionario> mostrarRegistradores() throws Exception {
        return db.searchAllRegistradores();
    }
}
