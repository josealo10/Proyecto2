/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.presentation.Administrador.InsertarBien;

/**
 *
 * @author jaalf
 */
public class ControllerInsertaBien {
    private ModelInsertaBien modelInsertaBien;
    private ViewInsertaBien viewInsertaBien;

    public ControllerInsertaBien(ModelInsertaBien modelInsertaBien, ViewInsertaBien viewInsertaBien) {
        this.modelInsertaBien = modelInsertaBien;
        this.viewInsertaBien = viewInsertaBien;
        this.modelInsertaBien.addObserver(viewInsertaBien);
    }

    public ModelInsertaBien getModelInsertaBien() {
        return modelInsertaBien;
    }

    public void setModelInsertaBien(ModelInsertaBien modelInsertaBien) {
        this.modelInsertaBien = modelInsertaBien;
    }

    public ViewInsertaBien getViewInsertaBien() {
        return viewInsertaBien;
    }

    public void setViewInsertaBien(ViewInsertaBien viewInsertaBien) {
        this.viewInsertaBien = viewInsertaBien;
    }

    
    
}
