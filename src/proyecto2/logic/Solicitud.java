package proyecto2.logic;

import java.util.ArrayList;
import java.util.Date;

/*
 * @author Alessandro Fazio Perez / Jose Alonso Alfaro Perez
 */

public class Solicitud {

    private int codigo;
    private ArrayList<Bien> bienes;
    private Date fecha;

    public Solicitud(int codigo) {
        this.codigo = codigo;
        bienes = new ArrayList<>();
        this.fecha = new Date();
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}