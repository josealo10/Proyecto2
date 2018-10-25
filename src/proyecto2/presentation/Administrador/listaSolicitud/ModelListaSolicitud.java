package proyecto2.presentation.Administrador.listaSolicitud;

import java.util.Observable;
import java.util.Observer;
import proyecto2.data.Dao;

/**
 *
 * @author jaalf
 */
public class ModelListaSolicitud extends Observable {
    
    private Dao db;

    public ModelListaSolicitud() {
        this.db = new Dao();
    }

    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
        this.setChanged();
        this.notifyObservers(null);
    }

    public Dao getDao() {
        return db;
    }
}
