package proyecto2.logic;

import java.util.ArrayList;

/*
 * @author Alessandro Fazio Perez / Jose Alonso Alfaro Perez
 */
public class Funcionario {
    private String nombre, id;
    private ArrayList<Solicitud> solicitudes;
    private Usuario usuario;
    private Dependencia dependencia;

    public Funcionario(String nombre, String id, Usuario usuario, Dependencia dependencia) {
        this.nombre = nombre;
        this.id = id;
        this.solicitudes = new ArrayList<>();
        this.usuario = usuario;
        this.dependencia = dependencia;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Dependencia getDependencia() {
        return dependencia;
    }

    public void setDependencia(Dependencia dependencia) {
        this.dependencia = dependencia;
    }

    public ArrayList<Solicitud> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(ArrayList<Solicitud> solicitudes) {
        this.solicitudes = solicitudes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
}
