/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.presentation.Registrador.Bienes;

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

    
    
    
}
