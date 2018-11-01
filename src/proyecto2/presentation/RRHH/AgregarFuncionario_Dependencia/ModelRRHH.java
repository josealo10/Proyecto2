package proyecto2.presentation.RRHH.AgregarFuncionario_Dependencia;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import proyecto2.data.Dao;
import proyecto2.logic.Dependencia;
import proyecto2.logic.Funcionario;
import proyecto2.logic.Usuario;

/**
 *
 * @author jaalf
 */
public class ModelRRHH extends Observable {

    private Dao db;
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
