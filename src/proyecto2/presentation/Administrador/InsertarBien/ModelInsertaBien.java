/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.presentation.Administrador.InsertarBien;

import java.util.Observable;
import proyecto2.data.Dao;
import proyecto2.logic.Bien;

/**
 *
 * @author jaalf
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
