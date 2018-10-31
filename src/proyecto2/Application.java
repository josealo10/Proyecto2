package proyecto2;

import proyecto2.presentation.Administrador.ingresoSolicitud.ControllerIngresoSolicitud;
import proyecto2.presentation.Administrador.ingresoSolicitud.ModelIngresoSolicitud;
import proyecto2.presentation.Administrador.ingresoSolicitud.ViewIngresoSolicitud;
import proyecto2.presentation.Administrador.listaSolicitud.ControllerListaSolicitud;
import proyecto2.presentation.Administrador.listaSolicitud.ModelListaSolicitud;
import proyecto2.presentation.Administrador.listaSolicitud.ViewListaSolicitud;
import proyecto2.presentation.Secretaria.aprobarSolicitud.ControllerAprobarSolicitud;
import proyecto2.presentation.Secretaria.aprobarSolicitud.ModelAprobarSolicitud;
import proyecto2.presentation.Secretaria.aprobarSolicitud.ViewAprobarSolicitud;
import proyecto2.presentation.ingreso.ControllerUsuario;
import proyecto2.presentation.ingreso.ModelUsuario;
import proyecto2.presentation.ingreso.ViewUsuario;

/*
 * @author Alessandro Fazio Perez / Jose Alonso Alfaro Perez
 */
public class Application {

    public static ControllerListaSolicitud CONTROLLER_LISTA_SOLICITUD;
    public static ControllerAprobarSolicitud CONTROLLER_APROBAR_SOLICITUD;
    public static ControllerIngresoSolicitud CONTROLLER_INGRESO_SOLICITUD;
    public static ControllerUsuario CONTROLLER_USUARIO;

    public static void main(String[] args) throws Exception {
        ModelUsuario mu = new ModelUsuario();
        ViewUsuario vu = new ViewUsuario();
        ControllerUsuario cu = new ControllerUsuario(mu, vu);
        CONTROLLER_USUARIO = cu;

        ModelListaSolicitud mls = new ModelListaSolicitud();
        ViewListaSolicitud vls = new ViewListaSolicitud();
        ControllerListaSolicitud cls = new ControllerListaSolicitud(mls, vls);
        CONTROLLER_LISTA_SOLICITUD = cls;

        ModelIngresoSolicitud mis = new ModelIngresoSolicitud();
        ViewIngresoSolicitud vis = new ViewIngresoSolicitud();
        ControllerIngresoSolicitud cis = new ControllerIngresoSolicitud(mis, vis);
        CONTROLLER_INGRESO_SOLICITUD = cis;

        ModelAprobarSolicitud mas = new ModelAprobarSolicitud();
        ViewAprobarSolicitud vas = new ViewAprobarSolicitud();
        ControllerAprobarSolicitud cas = new ControllerAprobarSolicitud(mas, vas);
        CONTROLLER_APROBAR_SOLICITUD = cas;

        vu.setVisible(true);
    }
}
