package proyecto2.presentation.ingreso;

/*
 * @author Alessandro Fazio Perez / Jose Alonso Alfaro Perez
 */
public class ControllerUsuario {

    ModelUsuario model;
    ViewUsuario view;

    public ControllerUsuario(ModelUsuario model, ViewUsuario view) {
        this.model = model;
        this.view = view;
        view.setModel(model);
        view.setController(this);
    }
}