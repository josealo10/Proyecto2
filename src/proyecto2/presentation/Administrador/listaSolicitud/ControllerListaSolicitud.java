/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.presentation.Administrador.listaSolicitud;

/**
 *
 * @author jaalf
 */
public class ControllerListaSolicitud {
   private ModelListaSolicitud modelListaSolicitud;
   private ViewListaSolicitud viewListaSolicitud;

    public ControllerListaSolicitud(ModelListaSolicitud modelListaSolicitud, ViewListaSolicitud viewListaSolicitud) {
        this.modelListaSolicitud = modelListaSolicitud;
        this.viewListaSolicitud = viewListaSolicitud;
        this.modelListaSolicitud.addObserver(viewListaSolicitud);
    }

    public ModelListaSolicitud getModelListaSolicitud() {
        return modelListaSolicitud;
    }

    public void setModelListaSolicitud(ModelListaSolicitud modelListaSolicitud) {
        this.modelListaSolicitud = modelListaSolicitud;
    }

    public ViewListaSolicitud getViewListaSolicitud() {
        return viewListaSolicitud;
    }

    public void setViewListaSolicitud(ViewListaSolicitud viewListaSolicitud) {
        this.viewListaSolicitud = viewListaSolicitud;
    }
   
   
   
   
}
