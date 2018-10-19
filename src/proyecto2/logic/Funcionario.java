package proyecto2.logic;

import java.util.ArrayList;

/*
 * @author Alessandro Fazio Perez / Jose Alonso Alfaro Perez
 */
public class Funcionario {
    private String nombre, cedula;
    ArrayList<Solicitud> solicitudes;

    public Funcionario(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
        solicitudes = new ArrayList<>();
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    
}
