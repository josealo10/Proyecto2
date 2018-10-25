package proyecto2.presentation.Administrador.listaSolicitud;

import proyecto2.Application;
import proyecto2.logic.Usuario;


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

    public void MostrarIngresoSolicitud() {
        Application.CONTROLLER_INGRESO_SOLICITUD.getView().setVisible(true);
    }
   
    public Usuario getUsuario(){
        return Application.CONTROLLER_USUARIO.getModel().getUsuario();
    }
}
