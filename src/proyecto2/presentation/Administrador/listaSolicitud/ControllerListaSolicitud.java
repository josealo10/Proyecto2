/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.presentation.Administrador.listaSolicitud;

import proyecto2.Application;

/**
 *
 * @author jaalf
 */
public class ControllerListaSolicitud {
   private ModelListaSolicitud model;
   private ViewListaSolicitud view;

    public ControllerListaSolicitud(ModelListaSolicitud model, ViewListaSolicitud view) {
        this.model = model;
        this.view = view;
        this.model.addObserver(view);
        view.setModel(model);
        view.setController(this);
    }

    public ModelListaSolicitud getModelListaSolicitud() {
        return model;
    }

    public void setModelListaSolicitud(ModelListaSolicitud model) {
        this.model = model;
    }

    public ViewListaSolicitud getViewListaSolicitud() {
        return view;
    }

    public void setViewListaSolicitud(ViewListaSolicitud view) {
        this.view = view;
    }

    void MostrarIngresoSolicitud() {
        Application.CONTROLLER_INGRESO_SOLICITUD.getView().setVisible(true);
    }
   
   
   
   
}
