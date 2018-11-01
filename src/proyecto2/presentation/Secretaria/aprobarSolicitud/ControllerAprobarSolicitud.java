package proyecto2.presentation.Secretaria.aprobarSolicitud;

import proyecto2.Application;

/*
 * @author Alessandro Fazio Pérez / Jose Alonso Alfaro Perez
 */
public class ControllerAprobarSolicitud {

    private ModelAprobarSolicitud model;
    private ViewAprobarSolicitud view;

    public ControllerAprobarSolicitud(ModelAprobarSolicitud model, ViewAprobarSolicitud view) {
        this.model = model;
        this.view = view;
        this.model.addObserver(view);
        view.setModel(model);
        view.setController(this);
    }

    public ModelAprobarSolicitud getModelAprobarSolicitud() {
        return model;
    }

    public void setModelAprobarSolicitud(ModelAprobarSolicitud model) {
        this.model = model;
    }

    public ViewAprobarSolicitud getViewAprobarSolicitud() {
        return view;
    }

    public void setViewAprobarSolicitud(ViewAprobarSolicitud view) {
        this.view = view;
    }

    public void jd_llenarTabla(int codigo) throws Exception {
        this.model.jd_llenarTabla(codigo);
    }

    public void jf_llenarTabla() throws Exception {
        this.model.jf_llenarTabla();
    }

    public void cerrarSesion() {
        this.view.setVisible(false);
        Application.CONTROLLER_USUARIO.getView().setVisible(true);
    }

    public void cambiarEstado(int codigo, String estado) throws Exception {
        this.model.cambiarEstado(codigo, estado);
    }
}
