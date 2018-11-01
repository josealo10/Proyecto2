/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.presentation.Jefe.AsignarRegistrador;

import proyecto2.Application;

/**
 *
 * @author jaalf
 */
public class ControllerAsignarRegistrador {
    private ModelAsignarRegistrador model;
    private ViewAsignarRegistrador view;

    public ControllerAsignarRegistrador(ModelAsignarRegistrador model, ViewAsignarRegistrador view) {
        this.model = model;
        this.view = view;
        this.model.addObserver(view);
        this.view.setController(this);
        this.view.setModel(model);
    }

    public ModelAsignarRegistrador getModel() {
        return model;
    }

    public void setModel(ModelAsignarRegistrador model) {
        this.model = model;
    }

    public ViewAsignarRegistrador getView() {
        return view;
    }

    public void setView(ViewAsignarRegistrador view) {
        this.view = view;
    }

    void jf_llenarTabla() throws Exception {
        this.model.jf_llenarTabla();
    }

    void CerrarSesion() {
        this.view.setVisible(false);
        Application.CONTROLLER_USUARIO.getView().setVisible(true);
    }
    
    
}
