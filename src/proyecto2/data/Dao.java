package proyecto2.data;

import proyecto2.logic.Activo;
import proyecto2.logic.Bien;
import proyecto2.logic.Dependencia;
import proyecto2.logic.Usuario;

/*
 * @author Alessandro Fazio Pérez / Jose Alonso Alfaro Perez
 */
public class Dao {

    private RelDatabase db;

    public Dao() {
        db = new RelDatabase();
    }

    public void addUsuario(Usuario u) throws Exception {
        String sql = "insert into Usuario (id, clave, permiso) "
                + "values('%s', '%s', '%s')";
        sql = String.format(sql, u.getId(), u.getClave(), u.getPermiso());

        if (db.executeUpdate(sql) == 0) {
            throw new Exception("Usuario ya existe");
        }
    }

    public void addBien(Bien b) throws Exception {
        String sql = "insert into Bien (codigo, marca, modelo, solicitud, cantidad) "
                + "values('%s', '%s', %d, %d)";
        sql = String.format(sql, b.getMarca(), b.getModelo(), b.getSolicitud().getCodigo(), b.getCantidad());

        if (db.executeUpdate(sql) == 0) {
            throw new Exception("Bien ya existe");
        }
    }

    public void addDependencia(Dependencia d) throws Exception {
        String sql = "insert into Dependencia (nombre) "
                + "values('%s')";
        sql = String.format(sql, d.getNombre());

        if (db.executeUpdate(sql) == 0) {
            throw new Exception("Dependencia ya existe");
        }
    }

    public void addSolicitud() throws Exception {
        String sql = "insert into Solicitud (numero) values(0)";

        if (db.executeUpdate(sql) == 0) {
            throw new Exception("Solicitud ya existe");
        }
    }

    public void addActivo(Activo a) throws Exception {
        String sql = "insert into Activo (marca, modelo, bien) "
                + "values('%s', '%s', %d)";
        sql = String.format(sql, a.getMarca(), a.getModelo(), a.getBien().getCodigo());

        if (db.executeUpdate(sql) == 0) {
            throw new Exception("Activo ya existe");
        }
    }
}