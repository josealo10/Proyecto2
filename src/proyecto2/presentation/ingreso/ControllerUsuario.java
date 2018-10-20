package proyecto2.presentation.ingreso;

import proyecto2.Application;

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

    public void ingresar(String id, String clave) throws Exception {
        if (model.ingresar(id, clave)) {
            this.view.setVisible(false);

            if (model.getUsuario().getPermiso().equals("Administrador")) {
                Application.CONTROLLER_LISTA_SOLICITUD.getViewListaSolicitud().setVisible(true);
            }

            if (model.getUsuario().getPermiso().equals("Jefe OCCB")) {

            }
            
            if (model.getUsuario().getPermiso().equals("Secretaria")) {

            }
            
            if (model.getUsuario().getPermiso().equals("Registrador")) {

            }
            
            if (model.getUsuario().getPermiso().equals("Jefe RH")) {

            }

        }
    }
}
