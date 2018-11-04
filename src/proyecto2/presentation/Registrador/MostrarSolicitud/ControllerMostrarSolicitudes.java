package proyecto2.presentation.Registrador.MostrarSolicitud;

import proyecto2.Application;

/*
 * @author Alessandro Fazio Pérez / Jose Alonso Alfaro Perez
 */
public class ControllerMostrarSolicitudes {
    private ModelMostrarSolicitudes model;
    private ViewMostrarSolicitudes view;

    public ControllerMostrarSolicitudes(ModelMostrarSolicitudes model, ViewMostrarSolicitudes view) {
        this.model = model;
        this.view = view;
        this.view.setController(this);
        this.view.setModel(model);
        this.model.addObserver(view);
    }

    public ModelMostrarSolicitudes getModel() {
        return model;
    }

    public void setModel(ModelMostrarSolicitudes model) {
        this.model = model;
    }

    public ViewMostrarSolicitudes getView() {
        return view;
    }

    public void setView(ViewMostrarSolicitudes view) {
        this.view = view;
    }

    void LlenarTabla() throws Exception {
        this.model.LlenarTabla();    
    }

    void CerrarSesion() {
        this.view.setVisible(false);
        Application.CONTROLLER_USUARIO.getView().setVisible(true);
    }

<<<<<<< Updated upstream
    public void mostrarBienes(int codigo) throws Exception {
        Application.CONTROLLER_BIENES.getView().setVisible(true);
        Application.CONTROLLER_BIENES.llenarTabla(codigo);
        Application.CONTROLLER_BIENES.getModel().setSolicitud(this.model.getDb().searchSolicitud(codigo));
    }

    public void llenarCatalogo() throws Exception {
        this.model.llenarCatalogo();
    }

=======
    public void setFuncionario(Usuario usuario) throws Exception {
        Funcionario registrador = this.model.getDb().searchFuncionario(usuario.getId());
        this.model.setRegistrador(registrador);
    }
    
    
>>>>>>> Stashed changes
}
