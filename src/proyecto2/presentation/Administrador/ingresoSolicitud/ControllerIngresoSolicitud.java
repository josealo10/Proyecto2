/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.presentation.Administrador.ingresoSolicitud;

/**
 *
 * @author jaalf
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
