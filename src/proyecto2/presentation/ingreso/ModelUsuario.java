package proyecto2.presentation.ingreso;

import java.util.Observable;
import java.util.Observer;
import proyecto2.logic.Usuario;

/*
 * @author Alessandro Fazio Perez / Jose Alonso Alfaro Perez
 */
public class ModelUsuario extends Observable {

    Usuario usuario;

    public ModelUsuario() {
        usuario = new Usuario();
    }

    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
        this.setChanged();
        this.notifyObservers(null);
    }
}