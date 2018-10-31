package proyecto2.presentation.Secretaria.aprobarSolicitud;

import java.util.Observable;
import java.util.Observer;
import javax.swing.table.DefaultTableModel;
import proyecto2.data.Dao;
import proyecto2.logic.Bien;
import proyecto2.logic.Solicitud;

/*
 * @author Alessandro Fazio Pérez / Jose Alonso Alfaro Perez
 */
public class ModelAprobarSolicitud extends Observable {

    private Dao db;
    private DefaultTableModel jf_tableModel;
    private DefaultTableModel jd_tableModel;

    public ModelAprobarSolicitud() {
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

    public void jf_llenarTabla() throws Exception {
        for (Solicitud s : this.db.searchAllSolicitudes()) {
            Object[] o = new Object[]{s.getCodigo(), s.getDependencia().getId(),  s.getFuncionario().getId(), s.getFecha(), s.getEstado()};
            jf_tableModel.addRow(o);
        }
    }

    public void jd_llenarTabla(int codigo) throws Exception {
        for (Bien b : this.db.searchBienes(codigo)) {
            Object[] o = new Object[]{b.getCodigo(), b.getCantidad(), b.getMarca(), b.getModelo()};
            jd_tableModel.addRow(o);
        }
    }

}
