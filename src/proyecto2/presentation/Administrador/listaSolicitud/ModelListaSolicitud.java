package proyecto2.presentation.Administrador.listaSolicitud;

import java.util.Observable;
import java.util.Observer;
import javax.swing.table.DefaultTableModel;
import proyecto2.data.Dao;
import proyecto2.logic.Bien;
import proyecto2.logic.Solicitud;

/**
 *
 * @author jaalf
 */
public class ModelListaSolicitud extends Observable {

    private Dao db;
    private DefaultTableModel jf_tableModel;
    private DefaultTableModel jd_tableModel;

    public ModelListaSolicitud() {
        this.db = new Dao();
    }

    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
        this.setChanged();
        this.notifyObservers(null);
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

    public void setJd_tableModel(DefaultTableModel Jd_tableModel) {
        this.jd_tableModel = Jd_tableModel;
    }

    public Dao getDao() {
        return db;
    }

    public void jf_llenarTabla(String id) throws Exception {
        for (Solicitud s : this.db.searchSolicitudes(id)) {
            Object[] o = new Object[]{s.getCodigo(), s.getFecha(), s.getFuncionario().getId()};
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
