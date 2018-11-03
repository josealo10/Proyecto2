/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.presentation.Registrador.MostrarSolicitud;

import java.util.Observable;
import javax.swing.table.DefaultTableModel;
import proyecto2.data.Dao;
import proyecto2.logic.Funcionario;
import proyecto2.logic.Solicitud;

/**
 *
 * @author jaalf
 */
public class ModelMostrarSolicitudes extends Observable  {
    private Dao db;
    private Funcionario registrador;
    private DefaultTableModel jf_tableModel;

    public ModelMostrarSolicitudes() {
        this.db = new Dao();
    }

    
    public Dao getDb() {
        return db;
    }

    public Funcionario getRegistrador() {
        return registrador;
    }

    public void setRegistrador(Funcionario registrador) {
        this.registrador = registrador;
    }

    public DefaultTableModel getJf_tableModel() {
        return jf_tableModel;
    }

    public void setJf_tableModel(DefaultTableModel jf_tableModel) {
        this.jf_tableModel = jf_tableModel;
    }

    void LlenarTabla() throws Exception {
        for (Solicitud s : this.db.searchSolicitudOfRegistrador(this.registrador.getId())) {
            Object[] o = new Object[]{s.getCodigo(), s.getDependencia(),s.getFuncionario(), s.getEstado()};
            jf_tableModel.addRow(o);
        }
    }
    
    
            
    
    
    
    
}
