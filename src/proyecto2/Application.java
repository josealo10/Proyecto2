package proyecto2;

import proyecto2.presentation.Administrador.InsertarBien.ControllerInsertaBien;
import proyecto2.presentation.Administrador.InsertarBien.ModelInsertaBien;
import proyecto2.presentation.Administrador.InsertarBien.ViewInsertaBien;
import proyecto2.presentation.ingreso.ControllerUsuario;
import proyecto2.presentation.ingreso.ModelUsuario;
import proyecto2.presentation.ingreso.ViewUsuario;

/*
 * @author Alessandro Fazio Perez / Jose Alonso Alfaro Perez
 */
public class Application {
    public static ControllerInsertaBien CONTROLLER_INSERTA_BIEN;
    
    public static void main(String[] args) throws Exception {
        ModelUsuario mu = new ModelUsuario();
        ViewUsuario vu = new ViewUsuario();
        ControllerUsuario cu = new ControllerUsuario(mu, vu);
        
        ModelInsertaBien mib = new ModelInsertaBien();
        ViewInsertaBien vib = new ViewInsertaBien();
        ControllerInsertaBien cib = new ControllerInsertaBien(mib, vib);
        CONTROLLER_INSERTA_BIEN = cib;
        
        vu.setVisible(true);
    }
}
