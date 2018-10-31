package proyecto2.logic;

import java.util.Date;

/*
 * @author Alessandro Fazio Perez / Jose Alonso Alfaro Perez
 */
public class Solicitud {

    private int codigo;
    private Date fecha;
    private Funcionario funcionario;
    private Dependencia dependencia;
    private String estado;

    public Solicitud(int codigo, Date fecha, Funcionario funcionario, Dependencia dependencia, String estado) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.funcionario = funcionario;
        this.dependencia = dependencia;
        this.estado = estado;
    }

    public Solicitud() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Dependencia getDependencia() {
        return dependencia;
    }

    public void setDependencia(Dependencia dependencia) {
        this.dependencia = dependencia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
