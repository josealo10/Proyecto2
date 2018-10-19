/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.presentation.Administrador.listaSolicitud;

import java.util.Observable;
import proyecto2.data.Dao;
import proyecto2.logic.Funcionario;
import proyecto2.logic.Solicitud;

/**
 *
 * @author jaalf
 */
public class ModelListaSolicitud extends Observable{
    private Funcionario funcionario;
    private Solicitud solicitud;
    private Dao db;
    
}
