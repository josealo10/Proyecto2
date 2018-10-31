/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.presentation.Jefe.AsignarRegistrador;

import java.util.ArrayList;
import java.util.Observable;
import javax.swing.table.DefaultTableModel;
import proyecto2.data.Dao;
import proyecto2.logic.Funcionario;
import proyecto2.logic.Solicitud;

/**
 *
 * @author jaalf
 */
public class ModelAsignarRegistrador extends Observable{
    private Dao db;
    private DefaultTableModel jf_tableModel;
    private DefaultTableModel jd_tableModel;

    public ModelAsignarRegistrador() {
        this.db = new Dao();
    }

    public DefaultTableModel getJf_tableModel() {
        return jf_tableModel;
    }

    public void setJf_tableModel(DefaultTableModel jf_tableModel) {
        this.jf_tableModel = jf_tableModel;
    }

    public DefaultTableModel getJd_tableModel() {
        return jd_tableModel;
    }

    public void setJd_tableModel(DefaultTableModel jd_tableModel) {
        this.jd_tableModel = jd_tableModel;
    }

    public void jf_llenarTabla() throws Exception {
        for (Solicitud s : this.db.searchSolicitudesAprobadas()) {
            Object[] o = new Object[]{s.getCodigo(), s.getFecha(), s.getFuncionario().getId(), s.getDependencia().getId()};
            jf_tableModel.addRow(o);
        }
    }

    public ArrayList<Funcionario> mostrarRegistradores() throws Exception {
        ArrayList<Funcionario> registradores = db.searchAllRegistradores();
        return registradores;
    }

    
    
}
