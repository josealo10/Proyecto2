package proyecto2;

import java.sql.SQLException;
import proyecto2.data.Dao;
import proyecto2.logic.Usuario;

/*
 * @author Alessandro Fazio Perez / Jose Alonso Alfaro Perez
 */
public class Application {

    public static void main(String[] args) throws Exception {
        Usuario u = new Usuario("001", "001", "Administrador");
        Dao db = new Dao();
        try {
            db.addUsuario(u);
        } catch (SQLException ex) {
        }
    }
}
