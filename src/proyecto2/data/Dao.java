package proyecto2.data;

import java.sql.ResultSet;
import proyecto2.logic.Activo;
import proyecto2.logic.Bien;
import proyecto2.logic.Dependencia;
import proyecto2.logic.Funcionario;
import proyecto2.logic.Solicitud;
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

    public void addSolicitud(Solicitud s, Funcionario f) throws Exception {
        String sql = "insert into Solicitud (funcionario) values('%s')";
        sql = String.format(sql, f.getId());

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

    public Usuario searchUsuario(String id) throws Exception {
        String sql = "select * from Usuario where id = '%s'";
        sql = String.format(sql, id);
        ResultSet rs = db.executeQuery(sql);

        if (rs.next()) {
            Usuario u = new Usuario();
            u.setId(rs.getString("id"));
            u.setClave(rs.getString("clave"));
            u.setPermiso(rs.getString("permiso"));
            return u;
        } else {
            throw new Exception("Usuario no existe");
        }
    }

    public Dependencia searchDependencia(String nombre) throws Exception {
        String sql = "select * from Dependencia where nombre = '%s'";
        sql = String.format(sql, nombre);
        ResultSet rs = db.executeQuery(sql);

        if (rs.next()) {
            Dependencia d = new Dependencia(rs.getString("nombre"));
            return d;
        } else {
            throw new Exception("Dependencia no existe");
        }
    }

    public Funcionario searchFuncionario(String id) throws Exception {
        String sql = "select * from Funcionario where id = '%s'";
        sql = String.format(sql, id);
        ResultSet rs = db.executeQuery(sql);

        if (rs.next()) {
            Funcionario f = new Funcionario(rs.getString("nombre"), rs.getString("id"),
                    this.searchDependencia(rs.getString("dependencia")), this.searchUsuario(rs.getString("puesto")));
            return f;
        } else {
            throw new Exception("Funcionario no existe");
        }
    }

    public void searchSolicitudes(Funcionario f) throws Exception {
        String sql = "select * from Solicitud where funcionario.id = '%s'";
        sql = String.format(sql, f.getId());
        ResultSet rs = db.executeQuery(sql);
        while (rs.next()) {
            Solicitud s = new Solicitud(rs.getInt("numero"), rs.getDate("fecha"), f);
            f.getSolicitudes().add(s);
        }
    }
}
