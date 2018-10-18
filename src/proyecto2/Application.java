package proyecto2;

import proyecto2.presentation.ingreso.ControllerUsuario;
import proyecto2.presentation.ingreso.ModelUsuario;
import proyecto2.presentation.ingreso.ViewUsuario;

/*
 * @author Alessandro Fazio Perez / Jose Alonso Alfaro Perez
 */
public class Application {

    public static void main(String[] args) throws Exception {
        ModelUsuario mu = new ModelUsuario();
        ViewUsuario vu = new ViewUsuario();
        ControllerUsuario cu = new ControllerUsuario(mu, vu);
        
        vu.setVisible(true);
    }
}
