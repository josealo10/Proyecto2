package proyecto2.logic;

/*
 * @author Alessandro Fazio Perez / Jose Alonso Alfaro Perez
 */

public class Bien {

    private String marca, modelo, tipo, descripcion;
    private int codigo, cantidad;
    private Solicitud solicitud;

    public Bien(String marca, String modelo, String tipo, String descripcion, int codigo, int cantidad, Solicitud solicitud) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.solicitud = solicitud;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public int getCodigo() {
        return codigo;
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
