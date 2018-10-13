package proyecto2.logic;

/*
 * @author Alessandro Fazio Perez / Jose Alonso Alfaro Perez
 */
public class Bien {

    private String marca, modelo;
    private int codigo;

    public Bien(String marca, String modelo, int codigo) {
        this.marca = marca;
        this.modelo = modelo;
        this.codigo = codigo;
    }

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
}
