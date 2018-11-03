package proyecto2.logic;

/*
 * @author Alessandro Fazio Perez / Jose Alonso Alfaro Perez
 */
public class Activo {

    private String marca, modelo;
    private int codigo;
    private Bien bien;
    private Categoria categoria;

    public Activo(String marca, String modelo, int codigo, Bien bien, Categoria categoria) {
        this.marca = marca;
        this.modelo = modelo;
        this.codigo = codigo;
        this.bien = bien;
        this.categoria = categoria;
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

    public Bien getBien() {
        return bien;
    }

    public void setBien(Bien bien) {
        this.bien = bien;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

}
