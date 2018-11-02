/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.presentation.Registrador.MostrarSolicitud;

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
    
    
}
