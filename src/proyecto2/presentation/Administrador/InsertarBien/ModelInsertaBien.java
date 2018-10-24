package proyecto2.presentation.Administrador.InsertarBien;

import java.util.Observable;
import proyecto2.data.Dao;
import proyecto2.logic.Bien;

/*
 * @author Alessandro Fazio Pérez / Jose Alonso Alfaro Perez
 */
public class ModelInsertaBien extends Observable {
    private Bien bien;
    private Dao db;

    public ModelInsertaBien() {
        this.bien = new Bien();
        this.db = new Dao();
    }

    
    
    public Bien getBien() {
        return bien;
    }

    public void setBien(Bien bien) {
        this.bien = bien;
    }

    public Dao getDb() {
        return db;
    }
    
}
