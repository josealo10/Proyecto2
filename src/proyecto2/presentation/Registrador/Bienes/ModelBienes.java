/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.presentation.Registrador.Bienes;

import java.util.Observable;
import javax.swing.table.DefaultTableModel;
import proyecto2.data.Dao;

/**
 *
 * @author jaalf
 */
public class ModelBienes extends Observable{
    private Dao db;
    private DefaultTableModel jf_tableModel;

    public Dao getDb() {
        return db;
    }

    public DefaultTableModel getJf_tableModel() {
        return jf_tableModel;
    }

    public void setJf_tableModel(DefaultTableModel jf_tableModel) {
        this.jf_tableModel = jf_tableModel;
    }
    
    
}
