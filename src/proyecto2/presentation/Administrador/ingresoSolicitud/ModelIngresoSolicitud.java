package proyecto2.presentation.Administrador.ingresoSolicitud;

import java.util.Observable;
import java.util.Observer;
import proyecto2.data.Dao;

/*
 * @author Alessandro Fazio Pérez / Jose Alonso Alfaro Perez
 */
public class ModelIngresoSolicitud extends Observable {

    private TableSolicitud table;
    private Dao db;

    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
        this.setChanged();
        this.notifyObservers(null);
    }

    public TableSolicitud getTable() {
        return table;
    }

    public void setTable(TableSolicitud table) {
        this.table = table;
    }

    public Dao getDb() {
        return db;
    }
    
    

}
