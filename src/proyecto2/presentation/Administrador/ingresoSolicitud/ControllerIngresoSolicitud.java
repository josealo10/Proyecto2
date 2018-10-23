package proyecto2.presentation.Administrador.ingresoSolicitud;

import proyecto2.Application;

/*
 * @author Alessandro Fazio Pérez / Jose Alonso Alfaro Perez
 */
public class ControllerIngresoSolicitud {

    private ModelIngresoSolicitud model;
    private ViewIngresoSolicitud view;

    public ControllerIngresoSolicitud(ModelIngresoSolicitud model, ViewIngresoSolicitud view) {
        this.model = model;
        this.view = view;
        this.model.addObserver(view);
        view.setModel(model);
        view.setController(this);
    }

    public ModelIngresoSolicitud getModel() {
        return model;
    }

    public void setModel(ModelIngresoSolicitud model) {
        this.model = model;
    }

    public ViewIngresoSolicitud getView() {
        return view;
    }

    public void setView(ViewIngresoSolicitud view) {
        this.view = view;
    }

    void MostrarBien() {
        Application.CONTROLLER_INSERTA_BIEN.getView().setVisible(true);
    }

}
