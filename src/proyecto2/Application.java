package proyecto2;

import java.util.Date;
import proyecto2.data.Dao;
import proyecto2.logic.Dependencia;
import proyecto2.logic.Funcionario;
import proyecto2.logic.Solicitud;
import proyecto2.logic.Usuario;
import proyecto2.presentation.Administrador.InsertarBien.ControllerInsertaBien;
import proyecto2.presentation.Administrador.InsertarBien.ModelInsertaBien;
import proyecto2.presentation.Administrador.InsertarBien.ViewInsertaBien;
import proyecto2.presentation.Administrador.listaSolicitud.ControllerListaSolicitud;
import proyecto2.presentation.Administrador.listaSolicitud.ModelListaSolicitud;
import proyecto2.presentation.Administrador.listaSolicitud.ViewListaSolicitud;
import proyecto2.presentation.ingreso.ControllerUsuario;
import proyecto2.presentation.ingreso.ModelUsuario;
import proyecto2.presentation.ingreso.ViewUsuario;

/*
 * @author Alessandro Fazio Perez / Jose Alonso Alfaro Perez
 */
public class Application {

    public static ControllerInsertaBien CONTROLLER_INSERTA_BIEN;
    public static ControllerListaSolicitud CONTROLLER_LISTA_SOLICITUD;

    public static void main(String[] args) throws Exception {
        ModelUsuario mu = new ModelUsuario();
        ViewUsuario vu = new ViewUsuario();
        ControllerUsuario cu = new ControllerUsuario(mu, vu);

        ModelInsertaBien mib = new ModelInsertaBien();
        ViewInsertaBien vib = new ViewInsertaBien();
        ControllerInsertaBien cib = new ControllerInsertaBien(mib, vib);
        CONTROLLER_INSERTA_BIEN = cib;

        ModelListaSolicitud mls = new ModelListaSolicitud();
        ViewListaSolicitud vls = new ViewListaSolicitud();
        ControllerListaSolicitud cls = new ControllerListaSolicitud(mls, vls);
        CONTROLLER_LISTA_SOLICITUD = cls;

        vu.setVisible(true);
    }
}
