package proyecto2.presentation.ingreso;

import java.util.Observable;
import java.util.Observer;
import proyecto2.data.Dao;
import proyecto2.logic.Usuario;

/*
 * @author Alessandro Fazio Perez / Jose Alonso Alfaro Perez
 */
public class ModelUsuario extends Observable {

    Usuario usuario;
    Dao db;

    public ModelUsuario() {
        usuario = new Usuario();
        db = new Dao();
    }

    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
        this.setChanged();
        this.notifyObservers(null);
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void ingresar(String id, String clave) throws Exception {
        if (db.searchUsuario(id).getId().equals(id) && db.searchUsuario(id).getClave().equals(clave)) {
            this.setUsuario(db.searchUsuario(id));
        } else {
            throw new Exception("Usuario o clave incorrecta");
        }
    }
}
