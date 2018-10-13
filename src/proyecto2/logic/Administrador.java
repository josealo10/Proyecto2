package proyecto2.logic;

/*
 * @author Alessandro Fazio Perez / Jose Alonso Alfaro Perez
 */
public class Administrador {
    private String nombre, cedula;

    public Administrador(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
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
