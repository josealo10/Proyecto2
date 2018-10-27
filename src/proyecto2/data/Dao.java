package proyecto2.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
        String sql = "insert into Bien (marca, modelo, solicitud, cantidad) "
                + "values('%s', '%s', %d, %d)";
        sql = String.format(sql, b.getMarca(), b.getModelo(), b.getSolicitud().getCodigo(), b.getCantidad());

        if (db.executeUpdate(sql) == 0) {
            throw new Exception("Bien ya existe");
        }
    }

    public void addDependencia(Dependencia d) throws Exception {
        String sql = "insert into Dependencia (id, nombre) "
                + "values('%s', '%s')";
        sql = String.format(sql, d.getId(), d.getNombre());

        if (db.executeUpdate(sql) == 0) {
            throw new Exception("Dependencia ya existe");
        }
    }

    public void addSolicitud(Solicitud s) throws Exception {
        String sql = "insert into Solicitud (funcionario, dependencia) values('%s', '%s')";
        sql = String.format(sql, s.getFuncionario().getId(), s.getDependencia().getId());

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

    public void deleteSolicitud(int codigo) throws Exception {
        String sql = "delete from Solicitud where numero = %d";
        sql = String.format(sql, codigo);

        if (db.executeUpdate(sql) == 0) {
            throw new Exception("Solicitud no existe");
        }
    }

    public Usuario searchUsuario(String id) throws Exception {
        String sql = "select * from Usuario where id = '%s'";
        sql = String.format(sql, id);
        ResultSet rs = db.executeQuery(sql);

        if (rs.next()) {
            return new Usuario(rs.getString("id"), rs.getString("clave"), rs.getString("permiso"));
        } else {
            throw new Exception("Usuario no existe");
        }
    }

    public Dependencia searchDependencia(String id) throws Exception {
        String sql = "select * from Dependencia where id = '%s'";
        sql = String.format(sql, id);
        ResultSet rs = db.executeQuery(sql);

        if (rs.next()) {
            return new Dependencia(rs.getString("id"), rs.getString("nombre"));
        } else {
            throw new Exception("Dependencia no existe");
        }
    }

    public Funcionario searchFuncionario(String id) throws Exception {
        String sql = "select * from Funcionario where id = '%s'";
        sql = String.format(sql, id);
        ResultSet rs = db.executeQuery(sql);

        if (rs.next()) {
            return new Funcionario(rs.getString("nombre"), rs.getString("id"),
                    this.searchDependencia(rs.getString("dependencia")), this.searchUsuario(rs.getString("puesto")));
        } else {
            throw new Exception("Funcionario no existe");
        }
    }

    public Solicitud searchSolicitud(int codigo) throws Exception {
        String sql = "select * from Solicitud where numero = %d";
        sql = String.format(sql, codigo);
        ResultSet rs = db.executeQuery(sql);

        if (rs.next()) {
            return new Solicitud(rs.getInt("numero"), rs.getDate("fecha"), this.searchFuncionario(rs.getString("funcionario")), this.searchDependencia(rs.getString("dependencia")));
        } else {
            throw new Exception("Solicitud no existe");
        }
    }

    public ArrayList<Solicitud> searchSolicitudes(String id) throws Exception {
        String sql = "select * from Solicitud where funcionario = '%s'";
        sql = String.format(sql, id);
        ResultSet rs = db.executeQuery(sql);
        ArrayList<Solicitud> solicitudes = new ArrayList<>();
        while (rs.next()) {
            Solicitud s = new Solicitud(rs.getInt("numero"), rs.getDate("fecha"), this.searchFuncionario(id), this.searchDependencia(rs.getString("dependencia")));
            solicitudes.add(s);
        }

        if (solicitudes.isEmpty()) {

            throw new Exception("No existen solicitudes");
        }

        return solicitudes;
    }

    public ArrayList<Bien> searchBienes(int codigo) throws Exception {
        String sql = "select * from Bien where solicitud = %d";
        sql = String.format(sql, codigo);
        ResultSet rs = db.executeQuery(sql);
        ArrayList<Bien> bienes = new ArrayList<>();

        while (rs.next()) {
            Bien b = new Bien(rs.getString("marca"), rs.getString("modelo"), rs.getInt("codigo"), rs.getInt("cantidad"), this.searchSolicitud(rs.getInt("solicitud")));
            bienes.add(b);
        }

        if (bienes.isEmpty()) {
            throw new Exception("No existen bienes");
        }

        return bienes;
    }

    public int ultimoBien() throws Exception {
        String sql = "select codigo from Bien where codigo = (select max(codigo) from Bien)";
        ResultSet rs = db.executeQuery(sql);

        if (rs.next()) {
            return rs.getInt("codigo");
        } else {
            throw new Exception("No exiten Bienes");
        }
    }

    public int ultimaSolicitud() throws Exception {
        String sql = "select numero from Solicitud where numero = (select max(numero) from Solicitud)";
        ResultSet rs = db.executeQuery(sql);

        if (rs.next()) {
            return rs.getInt("numero");
        } else {
            return 0;
        }
    }
}
