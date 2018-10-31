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

    public void mostrarIngresoSolicitud() {
        Application.CONTROLLER_INGRESO_SOLICITUD.getView().setVisible(true);
    }

    public Usuario getUsuario() {
        return Application.CONTROLLER_USUARIO.getModel().getUsuario();
    }

    public void jd_llenarTabla(int codigo) throws Exception {
        this.model.jd_llenarTabla(codigo);
    }

    public void jf_llenarTabla() throws Exception {
        this.model.jf_llenarTabla(this.getUsuario().getId());
    }

    public void cerrarSesion() {
        Application.CONTROLLER_USUARIO.getView().setVisible(true);
    }
}
