package proyecto2.presentation.Administrador.InsertarBien;

/*
 * @author Alessandro Fazio Pérez / Jose Alonso Alfaro Perez
 */
public class ControllerInsertaBien {

    private ModelInsertaBien model;
    private ViewInsertaBien view;

    public ControllerInsertaBien(ModelInsertaBien model, ViewInsertaBien view) {
        this.model = model;
        this.view = view;
        this.model.addObserver(view);
        this.view.setModel(model);
        this.view.setController(this);
        
    }

    public ModelInsertaBien getModel() {
        return model;
    }

    public void setModel(ModelInsertaBien model) {
        this.model = model;
    }

    public ViewInsertaBien getView() {
        return view;
    }

    public void setView(ViewInsertaBien view) {
        this.view = view;
    }
}
