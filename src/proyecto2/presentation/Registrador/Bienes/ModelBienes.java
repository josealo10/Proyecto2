package proyecto2.presentation.Registrador.Bienes;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javax.swing.table.DefaultTableModel;
import proyecto2.data.Dao;
import proyecto2.logic.Activo;
import proyecto2.logic.Bien;
import proyecto2.logic.Categoria;
import proyecto2.logic.Solicitud;

/*
 * @author Alessandro Fazio Pérez / Jose Alonso Alfaro Perez
 */
public class ModelBienes extends Observable {

    private Dao db;
    private DefaultTableModel jf_tableModel;
    private Categoria categoria;
    private Activo activo;
    private ArrayList<Activo> activos;
    private Solicitud solicitud;

    public ModelBienes() {
        this.db = new Dao();
        this.categoria = new Categoria();
        this.activo = new Activo();
        this.activos = new ArrayList<>();
    }

    @Override
    public synchronized void addObserver(Observer o) {

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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Activo getActivo() {
        return activo;
    }

    public void setActivo(Activo activo) {
        this.activo = activo;
    }

    public ArrayList<Activo> getActivos() {
        return activos;
    }

    public void setActivos(ArrayList<Activo> activos) {
        this.activos = activos;
    }

    public Solicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }

    public void llenarTabla(int codigo) throws Exception {
        for (Bien b : this.db.searchBienes(codigo)) {
            Object[] o = new Object[]{b.getCodigo(), b.getCantidad(), b.getMarca(), b.getModelo(), "$" + b.getPrecio(), b.getDescripcion()};
            jf_tableModel.addRow(o);
        }
    }

    public void agregarCategoria() throws Exception {
        this.db.addCategoria(this.categoria);
    }

    public ArrayList<Categoria> mostrarCategorias() throws Exception {
        return this.db.searchAllCategorias();
    }

    public void agregarActivo() throws Exception {
        for (int i = 0; i < this.activos.size(); i++) {
            this.db.addActivo(this.activo);
        }
    }

    public void cambiarEstado(int codigo, String estado) throws Exception {
        this.db.setEstadoSolicitud(codigo, estado);
    }

}
