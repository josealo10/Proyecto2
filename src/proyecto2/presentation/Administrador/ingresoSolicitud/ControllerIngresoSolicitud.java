package proyecto2.presentation.Administrador.ingresoSolicitud;

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

    public void agregarSolicitud() throws Exception {
        this.model.agregarSolicitud();
    }

    public void agregarBien() throws Exception {
        this.model.agregarBien();
    }
}
