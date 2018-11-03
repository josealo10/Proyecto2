/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.presentation.Registrador.MostrarSolicitud;

import proyecto2.Application;
import proyecto2.logic.Funcionario;
import proyecto2.logic.Usuario;

/**
 *
 * @author jaalf
 */
public class ControllerMostrarSolicitudes {
    private ModelMostrarSolicitudes model;
    private ViewMostrarSolicitudes view;

    public ControllerMostrarSolicitudes(ModelMostrarSolicitudes model, ViewMostrarSolicitudes view) {
        this.model = model;
        this.view = view;
        this.view.setController(this);
        this.view.setModel(model);
        this.model.addObserver(view);
    }

    public ModelMostrarSolicitudes getModel() {
        return model;
    }

    public void setModel(ModelMostrarSolicitudes model) {
        this.model = model;
    }

    public ViewMostrarSolicitudes getView() {
        return view;
    }

    public void setView(ViewMostrarSolicitudes view) {
        this.view = view;
    }

    void LlenarTabla() throws Exception {
        this.model.LlenarTabla();    
    }

    void CerrarSesion() {
        this.view.setVisible(false);
        Application.CONTROLLER_USUARIO.getView().setVisible(true);
    }

    public void setFuncionario(Usuario usuario) throws Exception {
        Funcionario registrador = this.model.getDb().searchFuncionario(usuario.getId());
        this.model.setRegistrador(registrador);
    }
    
    
}
