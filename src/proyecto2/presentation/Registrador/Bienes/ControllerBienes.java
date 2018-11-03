/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.presentation.Registrador.Bienes;

import proyecto2.Application;

/**
 *
 * @author jaalf
 */
public class ControllerBienes {

    private ModelBienes model;
    private ViewBienes view;

    public ControllerBienes(ModelBienes model, ViewBienes view) {
        this.model = model;
        this.view = view;
        this.view.setController(this);
        this.view.setModel(model);
        this.model.addObserver(view);
    }

    public ModelBienes getModel() {
        return model;
    }

    public void setModel(ModelBienes model) {
        this.model = model;
    }

    public ViewBienes getView() {
        return view;
    }

    public void setView(ViewBienes view) {
        this.view = view;
    }

    public void agregarCategoria() throws Exception {
        this.model.agregarCategoria();
    }

    public void llenarTabla(int codigo) throws Exception {
        this.model.llenarTabla(codigo);
    }

    public void agregarActivo() throws Exception {
        this.model.agregarActivo();

    }

    public void cambiarEstado(int codigo, String estado) throws Exception {
        this.model.cambiarEstado(codigo, estado);
    }
}
