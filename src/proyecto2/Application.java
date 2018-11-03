package proyecto2;

import proyecto2.presentation.Administrador.ingresoSolicitud.ControllerIngresoSolicitud;
import proyecto2.presentation.Administrador.ingresoSolicitud.ModelIngresoSolicitud;
import proyecto2.presentation.Administrador.ingresoSolicitud.ViewIngresoSolicitud;
import proyecto2.presentation.Administrador.listaSolicitud.ControllerListaSolicitud;
import proyecto2.presentation.Administrador.listaSolicitud.ModelListaSolicitud;
import proyecto2.presentation.Administrador.listaSolicitud.ViewListaSolicitud;
import proyecto2.presentation.Jefe.AsignarRegistrador.ControllerAsignarRegistrador;
import proyecto2.presentation.Jefe.AsignarRegistrador.ModelAsignarRegistrador;
import proyecto2.presentation.Jefe.AsignarRegistrador.ViewAsignarRegistrador;
import proyecto2.presentation.RRHH.AgregarFuncionario_Dependencia.ControllerRRHH;
import proyecto2.presentation.RRHH.AgregarFuncionario_Dependencia.ModelRRHH;
import proyecto2.presentation.RRHH.AgregarFuncionario_Dependencia.ViewRRHH;
import proyecto2.presentation.Registrador.Bienes.ControllerBienes;
import proyecto2.presentation.Registrador.Bienes.ModelBienes;
import proyecto2.presentation.Registrador.Bienes.ViewBienes;
import proyecto2.presentation.Registrador.MostrarSolicitud.ControllerMostrarSolicitudes;
import proyecto2.presentation.Registrador.MostrarSolicitud.ModelMostrarSolicitudes;
import proyecto2.presentation.Registrador.MostrarSolicitud.ViewMostrarSolicitudes;
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
    public static ControllerAsignarRegistrador CONTROLLER_ASIGNAR_REGISTRADOR;
    public static ControllerRRHH CONTROLLER_RRHH;
    public static ControllerMostrarSolicitudes CONTROLLER_MOSTRAR_SOLICITUDES;
    public static ControllerBienes CONTROLLER_BIENES;

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

        ModelAsignarRegistrador mar = new ModelAsignarRegistrador();
        ViewAsignarRegistrador var = new ViewAsignarRegistrador();
        ControllerAsignarRegistrador car = new ControllerAsignarRegistrador(mar, var);
        CONTROLLER_ASIGNAR_REGISTRADOR = car;

        ModelRRHH mrh = new ModelRRHH();
        ViewRRHH vrh = new ViewRRHH();
        ControllerRRHH crh = new ControllerRRHH(vrh, mrh);
        CONTROLLER_RRHH = crh;

        ModelMostrarSolicitudes mms = new ModelMostrarSolicitudes();
        ViewMostrarSolicitudes vms = new ViewMostrarSolicitudes();
        ControllerMostrarSolicitudes cms = new ControllerMostrarSolicitudes(mms, vms);
        CONTROLLER_MOSTRAR_SOLICITUDES = cms;
        
        ModelBienes mb = new ModelBienes();
        ViewBienes vb = new ViewBienes();
        ControllerBienes cb = new ControllerBienes(mb, vb);
        CONTROLLER_BIENES = cb;

        vu.setVisible(true);
    }
}
