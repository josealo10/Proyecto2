package proyecto2.logic;

import java.util.ArrayList;

/*
 * @author Alessandro Fazio Perez / Jose Alonso Alfaro Perez
 */
public class Solicitud {

    private int codigo;
    private ArrayList<Bien> bienes;

    public Solicitud(int codigo, ArrayList<Bien> bienes) {
        this.codigo = codigo;
        this.bienes = bienes;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Bien> getBienes() {
        return bienes;
    }

    public void setBienes(ArrayList<Bien> bienes) {
        this.bienes = bienes;
    }
}