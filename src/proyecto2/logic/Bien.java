package proyecto2.logic;

/*
 * @author Alessandro Fazio Perez / Jose Alonso Alfaro Perez
 */

public class Bien {

    private String marca, modelo;
    private int codigo, cantidad;
    private Solicitud solicitud;

    public Bien(String marca, String modelo, int codigo, int cantidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.codigo = codigo;
        this.cantidad = cantidad;
    }

    public Bien() {}

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Solicitud getSolicitud() {
        return solicitud;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }
}
