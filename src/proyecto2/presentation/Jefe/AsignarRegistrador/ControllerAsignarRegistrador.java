package proyecto2.presentation.Jefe.AsignarRegistrador;

import proyecto2.Application;

/*
 * @author Alessandro Fazio Pérez / Jose Alonso Alfaro Perez
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

    public void jf_llenarTabla() throws Exception {
        this.model.jf_llenarTabla();
    }

    public void jd_llenarTabla(int codigo) throws Exception {
        this.model.jd_llenarTabla(codigo);
    }

    public void asignarRegistrador(int codigo, String registrador) throws Exception {
        this.model.asignarRegistrador(codigo, registrador);
    }

    public void cerrarSesion() {
        this.view.setVisible(false);
        Application.CONTROLLER_USUARIO.getView().setVisible(true);
    }
}
