package proyecto2.presentation.RRHH.AgregarFuncionario_Dependencia;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javax.swing.table.DefaultTableModel;
import proyecto2.data.Dao;
import proyecto2.logic.Dependencia;
import proyecto2.logic.Funcionario;
import proyecto2.logic.Usuario;

/*
 * @author Alessandro Fazio Pérez / Jose Alonso Alfaro Perez
 */
public class ModelRRHH extends Observable {

    private Dao db;
    private DefaultTableModel tableModelFuncionarios;
    private DefaultTableModel tableModelDependencias;
    private Funcionario funcionario;
    private Dependencia dependencia;
    private Usuario usuario;

    public ModelRRHH() {
        this.db = new Dao();
        this.funcionario = new Funcionario();
        this.dependencia = new Dependencia();
        this.usuario = new Usuario();
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

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Dependencia getDependencia() {
        return dependencia;
    }

    public void setDependencia(Dependencia dependencia) {
        this.dependencia = dependencia;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public DefaultTableModel getTableModelFuncionarios() {
        return tableModelFuncionarios;
    }

    public void setTableModelFuncionarios(DefaultTableModel tableModelFuncionarios) {
        this.tableModelFuncionarios = tableModelFuncionarios;
    }

    public DefaultTableModel getTableModelDependencias() {
        return tableModelDependencias;
    }

    public void setTableModelDependencias(DefaultTableModel tableModelDependencias) {
        this.tableModelDependencias = tableModelDependencias;
    }

    public void llenarTablaDependencias() throws Exception {
        for (Dependencia d : this.db.searchAllDependencias()) {
            Object[] o = new Object[]{d.getId(), d.getNombre()};
            tableModelDependencias.addRow(o);
        }
    }

    public void llenarTablaFuncionarios() throws Exception {
        for (Funcionario f : this.db.searchAllFuncionarios()) {
            Object[] o = new Object[]{f.getId(), f.getNombre(), f.getDependencia().getNombre() + " (" + f.getDependencia().getId() + ")", f.getUsuario().getPermiso()};
            tableModelFuncionarios.addRow(o);
        }
    }

    public void llenarTablaFuncionariosDependencia(String id) throws Exception {
        for (Funcionario f : this.db.searchAllFuncionariosDependencia(id)) {
            Object[] o = new Object[]{f.getId(), f.getNombre(), f.getDependencia().getNombre() + " (" + f.getDependencia().getId() + ")", f.getUsuario().getPermiso()};
            tableModelFuncionarios.addRow(o);
        }
    }

    public void agregarDependencia() throws Exception {
        this.db.addDependencia(this.dependencia);
    }

    public void agregarFuncionario() throws Exception {
        this.db.addUsuario(this.usuario);
        this.db.addFuncionario(this.funcionario);
    }

    public ArrayList<Dependencia> mostrarDependencias() throws Exception {
        return this.db.searchAllDependencias();
    }

}
