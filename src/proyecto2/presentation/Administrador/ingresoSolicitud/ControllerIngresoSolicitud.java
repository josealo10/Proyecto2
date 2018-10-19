package proyecto2.presentation.Administrador.ingresoSolicitud;

/*
 * @author Alessandro Fazio Pérez / Jose Alonso Alfaro Perez
 */
public class ControllerIngresoSolicitud {

    private ModelIngresoSolicitud modelIngresoSolicitud;
    private ViewIngresoSolicitud viewIngresoSolicitud;

    public ControllerIngresoSolicitud(ModelIngresoSolicitud modelIngresoSolicitud, ViewIngresoSolicitud viewIngresoSolicitud) {
        this.modelIngresoSolicitud = modelIngresoSolicitud;
        this.viewIngresoSolicitud = viewIngresoSolicitud;
        this.modelIngresoSolicitud.addObserver(viewIngresoSolicitud);
    }

}
