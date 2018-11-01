package proyecto2.data;

import java.sql.ResultSet;
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
        String sql = "insert into Bien (marca, modelo, tipo, descripcion, solicitud, cantidad) "
                + "values('%s', '%s', '%s', '%s', %d, %d)";
        sql = String.format(sql, b.getMarca(), b.getModelo(), b.getTipo(), b.getDescripcion(), b.getSolicitud().getCodigo(), b.getCantidad());

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
        String sql = "insert into Solicitud (funcionario, dependencia, estado) values('%s', '%s', '%s')";
        sql = String.format(sql, s.getFuncionario().getId(), s.getDependencia().getId(), s.getEstado());

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
        String sql = "select * from Usuario u where u.id = '%s'";
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
            return new Solicitud(rs.getInt("numero"), rs.getDate("fecha"), this.searchFuncionario(rs.getString("funcionario")),
                    this.searchDependencia(rs.getString("dependencia")), rs.getString("estado"));

        } else {
            throw new Exception("Solicitud no existe");
        }
    }
    public ArrayList<Funcionario> searchAllRegistradores() throws Exception {
        String sql = "select * from Funcionario";
        sql = String.format(sql);
        ResultSet rs = db.executeQuery(sql);
        ArrayList<Funcionario> registradores = new ArrayList<>();
        while(rs.next()){
            
            if(this.searchUsuario(rs.getString("id")).getPermiso().equals("Administrador")){
                registradores.add(new Funcionario(rs.getString("nombre"), rs.getString("id"),
                    this.searchDependencia(rs.getString("dependencia")), this.searchUsuario(rs.getString("puesto"))));
            }
            
        }
        return registradores;
    }
        

    public ArrayList<Solicitud> searchSolicitudes(String objeto, String condicion) throws Exception {
        String sql = "select * from Solicitud where %s = '%s'";
        sql = String.format(sql, objeto, condicion);
        ResultSet rs = db.executeQuery(sql);
        ArrayList<Solicitud> solicitudes = new ArrayList<>();
        
        while (rs.next()) {
            Solicitud s = new Solicitud(rs.getInt("numero"), rs.getDate("fecha"), this.searchFuncionario(rs.getString("funcionario")),
                    this.searchDependencia(rs.getString("dependencia")), rs.getString("estado"));
            solicitudes.add(s);
        }
        
        if (solicitudes.isEmpty()){
            throw new Exception("No existen solicitudes");
        }

        return solicitudes;
    }
public ArrayList<Solicitud> searchSolicitudesAprobadas() throws Exception {
        String sql = "select * from Solicitud where estado = 'Aprobada'";
        ResultSet rs = db.executeQuery(sql);
        ArrayList<Solicitud> solicitudes = new ArrayList<>();
        while (rs.next()) {
            Solicitud s = new Solicitud(rs.getInt("numero"), rs.getDate("fecha"), this.searchFuncionario(rs.getString("funcionario")), this.searchDependencia(rs.getString("dependencia")),rs.getString("estado"));
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
            Bien b = new Bien(rs.getString("marca"), rs.getString("modelo"), rs.getString("tipo"), rs.getString("descripcion"),
                    rs.getInt("codigo"), rs.getInt("cantidad"), this.searchSolicitud(rs.getInt("solicitud")));
            bienes.add(b);
        }

        if (bienes.isEmpty()) {
            throw new Exception("No existen bienes");
        }

        return bienes;
    }

    public ArrayList<Solicitud> searchAllSolicitudes() throws Exception {
        String sql = "select * from Solicitud";
        ResultSet rs = db.executeQuery(sql);
        ArrayList<Solicitud> solicitudes = new ArrayList<>();

        while (rs.next()) {
            Solicitud s = new Solicitud(rs.getInt("numero"), rs.getDate("fecha"), this.searchFuncionario(rs.getString("funcionario")),
                    this.searchDependencia(rs.getString("dependencia")), rs.getString("estado"));
            solicitudes.add(s);
        }

        if (solicitudes.isEmpty()) {
            throw new Exception("No existen solicitudes");
        }

        return solicitudes;
    }

    public void setEstadoSolicitud(int codigo, String estado) throws Exception {
        String sql = "update Solicitud set estado = '%s' where numero = %d";
        sql = String.format(sql, estado, codigo);

        if (db.executeUpdate(sql) == 0) {
            throw new Exception("No se puede actualizar");
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
