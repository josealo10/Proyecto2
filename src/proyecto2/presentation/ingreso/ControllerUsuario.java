package proyecto2.presentation.ingreso;

import proyecto2.Application;

/*
 * @author Alessandro Fazio Perez / Jose Alonso Alfaro Perez
 */
public class ControllerUsuario {

    private ModelUsuario model;
    private ViewUsuario view;

    public ControllerUsuario(ModelUsuario model, ViewUsuario view) {
        this.model = model;
        this.view = view;
        view.setModel(model);
        view.setController(this);
    }

    public ModelUsuario getModel() {
        return model;
    }

    public ViewUsuario getView() {
        return view;
    }

    public void ingresar(String id, String clave) throws Exception {
        if (model.ingresar(id, clave)) {
            this.view.setVisible(false);

            if (model.getUsuario().getPermiso().equals("Administrador")) {
                Application.CONTROLLER_LISTA_SOLICITUD.getViewListaSolicitud().setVisible(true);
            }

            if (model.getUsuario().getPermiso().equals("Jefe OCCB")) {
                Application.CONTROLLER_ASIGNAR_REGISTRADOR.getView().setVisible(true);
            }
            
            if (model.getUsuario().getPermiso().equals("Secretaria")) {
                Application.CONTROLLER_APROBAR_SOLICITUD.getViewAprobarSolicitud().setVisible(true);
            }
            
            if (model.getUsuario().getPermiso().equals("Registrador")) {
                Application.CONTROLLER_MOSTRAR_SOLICITUDES.getView().setVisible(true);
            }
            
            if (model.getUsuario().getPermiso().equals("Jefe RRHH")) {
                Application.CONTROLLER_RRHH.getView().setVisible(true);
            }

        }
    }
}
