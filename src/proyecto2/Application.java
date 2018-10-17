package proyecto2;


import proyecto2.data.Dao;
import proyecto2.logic.Usuario;
import proyecto2.presentation.ingreso.ViewUsuario;

/*
 * @author Alessandro Fazio Perez / Jose Alonso Alfaro Perez
 */
public class Application {

    public static void main(String[] args) throws Exception {
        Dao d = new Dao();
        System.out.println(d.searchUsuario("001").getId());
    }
}
