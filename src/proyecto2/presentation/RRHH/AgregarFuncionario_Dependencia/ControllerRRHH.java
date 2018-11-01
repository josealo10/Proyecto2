/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.presentation.RRHH.AgregarFuncionario_Dependencia;

import proyecto2.Application;

/**
 *
 * @author jaalf
 */
public class ControllerRRHH {

    private ViewRRHH view;
    private ModelRRHH model;

    public ControllerRRHH(ViewRRHH view, ModelRRHH model) {
        this.view = view;
        this.model = model;
        this.view.setController(this);
        this.view.setModel(model);
    }

    public ViewRRHH getView() {
        return view;
    }

    public void setView(ViewRRHH view) {
        this.view = view;
    }

    public ModelRRHH getModel() {
        return model;
    }

    public void setModel(ModelRRHH model) {
        this.model = model;
    }

    public void cerrarSesion() {
        this.view.setVisible(false);
        Application.CONTROLLER_USUARIO.getView().setVisible(true);
    }

    public void agregarFuncionario() throws Exception {
        this.model.agregarFuncionario();
    }

    public void agregarDependencia() throws Exception {
        this.model.agregarDependencia();
    }

}
