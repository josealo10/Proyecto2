package proyecto2.presentation.Administrador.InsertarBien;

/*
 * @author Alessandro Fazio Pérez / Jose Alonso Alfaro Perez
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
