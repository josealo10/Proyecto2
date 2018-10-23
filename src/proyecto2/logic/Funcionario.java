package proyecto2.logic;

import java.util.ArrayList;

/*
 * @author Alessandro Fazio Perez / Jose Alonso Alfaro Perez
 */
public class Funcionario {
    private String nombre, id;
    ArrayList<Solicitud> solicitudes;
    private Dependencia dependencia;
    private Usuario usuario;

    public Funcionario(String nombre, String id, Dependencia dependencia, Usuario usuario) {
        this.nombre = nombre;
        this.id = id;
        this.solicitudes = new ArrayList<>();
        this.dependencia = dependencia;
        this.usuario = usuario;
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
