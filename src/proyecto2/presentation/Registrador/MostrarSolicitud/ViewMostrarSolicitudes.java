package proyecto2.presentation.Registrador.MostrarSolicitud;

import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/*
 * @author Alessandro Fazio Pérez / Jose Alonso Alfaro Perez
 */
public class ViewMostrarSolicitudes extends javax.swing.JFrame implements Observer {

    private ControllerMostrarSolicitudes controller;
    private ModelMostrarSolicitudes model;

    public ViewMostrarSolicitudes() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.jd_catalogo.setLocationRelativeTo(null);

        DefaultTableCellRenderer alinear = (DefaultTableCellRenderer) jt_solicitudes.getCellRenderer(0, 0);
        alinear.setHorizontalAlignment(SwingConstants.CENTER);

        alinear = (DefaultTableCellRenderer) jt_catalogo.getCellRenderer(0, 0);
        alinear.setHorizontalAlignment(SwingConstants.CENTER);
        
        jt_catalogo.add(new javax.swing.JScrollBar());
    }

    public ControllerMostrarSolicitudes getController() {
        return controller;
    }

    public void setController(ControllerMostrarSolicitudes controller) {
        this.controller = controller;
    }

    public ModelMostrarSolicitudes getModel() {
        return model;
    }

    public void setModel(ModelMostrarSolicitudes model) {
        this.model = model;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_catalogo = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_catalogo = new javax.swing.JTable();
        jl_solicitudes = new javax.swing.JLabel();
        jb_mostrarSolicitudes = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_solicitudes = new javax.swing.JTable();
        jb_catalogo = new javax.swing.JButton();
        jmb_menu = new javax.swing.JMenuBar();
        jm_opciones = new javax.swing.JMenu();
        jmi_cerrarSesion = new javax.swing.JMenuItem();
=======
        jScrollPane1 = new javax.swing.JScrollPane();
        jtm_Solicitudes = new javax.swing.JTable();
        jl_CategoriaNueva = new javax.swing.JLabel();
        jl_Categoria = new javax.swing.JLabel();
        jtf_Categoria = new javax.swing.JTextField();
        jb_AgregarCategoria = new javax.swing.JButton();
        jl_Solicitudes = new javax.swing.JLabel();
        jb_MostrarSolicitudes = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmi_CerrarSesion = new javax.swing.JMenuItem();
>>>>>>> Stashed changes

        jd_catalogo.setTitle("Catalogo");
        jd_catalogo.setResizable(false);
        jd_catalogo.setSize(new java.awt.Dimension(550, 430));

        jt_catalogo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Marca", "Modelo", "Categoria", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jt_catalogo);

        javax.swing.GroupLayout jd_catalogoLayout = new javax.swing.GroupLayout(jd_catalogo.getContentPane());
        jd_catalogo.getContentPane().setLayout(jd_catalogoLayout);
        jd_catalogoLayout.setHorizontalGroup(
            jd_catalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_catalogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_catalogoLayout.setVerticalGroup(
            jd_catalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_catalogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

<<<<<<< Updated upstream
        jl_solicitudes.setText("Solicitudes");

        jb_mostrarSolicitudes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2/presentation/iconos/search.png"))); // NOI18N
        jb_mostrarSolicitudes.setText("Mostrar solicitudes");
        jb_mostrarSolicitudes.addActionListener(new java.awt.event.ActionListener() {
=======
        jtm_Solicitudes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Dependencia", "Funcionario", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtm_Solicitudes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtm_Solicitudes);
        if (jtm_Solicitudes.getColumnModel().getColumnCount() > 0) {
            jtm_Solicitudes.getColumnModel().getColumn(0).setResizable(false);
            jtm_Solicitudes.getColumnModel().getColumn(1).setResizable(false);
            jtm_Solicitudes.getColumnModel().getColumn(2).setResizable(false);
            jtm_Solicitudes.getColumnModel().getColumn(3).setResizable(false);
        }

        jl_CategoriaNueva.setText("Categoria Nueva");

        jl_Categoria.setText("Categoria");

        jtf_Categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_CategoriaActionPerformed(evt);
            }
        });

        jb_catalogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2/presentation/iconos/catalog.png"))); // NOI18N
        jb_catalogo.setText("Catalogo");
        jb_catalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_catalogoActionPerformed(evt);
            }
        });

        jm_opciones.setText("Opciones");

        jl_Solicitudes.setText("Solicitudes");

        jb_MostrarSolicitudes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2/presentation/iconos/search.png"))); // NOI18N
        jb_MostrarSolicitudes.setText("Mostrar solicitudes");
        jb_MostrarSolicitudes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_MostrarSolicitudesActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jmi_CerrarSesion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jmi_CerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2/presentation/iconos/exit.png"))); // NOI18N
        jmi_CerrarSesion.setText("Cerrar sesion");
        jmi_CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_CerrarSesionActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_CerrarSesion);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jb_mostrarSolicitudes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_catalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jl_solicitudes))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
<<<<<<< Updated upstream
                .addComponent(jl_solicitudes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
=======
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_CategoriaNueva)
                    .addComponent(jl_Solicitudes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_mostrarSolicitudes)
                    .addComponent(jb_catalogo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

<<<<<<< Updated upstream
    private void jb_mostrarSolicitudesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_mostrarSolicitudesActionPerformed
=======
    private void jtf_CategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_CategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_CategoriaActionPerformed

    private void jb_AgregarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_AgregarCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_AgregarCategoriaActionPerformed

    private void jb_MostrarSolicitudesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_MostrarSolicitudesActionPerformed
>>>>>>> Stashed changes
        try {
            this.model.setJf_tableModel((DefaultTableModel) jtm_Solicitudes.getModel());
            this.model.getJf_tableModel().setRowCount(0);
<<<<<<< Updated upstream
            this.controller.llenarTabla();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + " asignadas", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jb_mostrarSolicitudesActionPerformed

    private void jmi_cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_cerrarSesionActionPerformed
        this.controller.cerrarSesion();
    }//GEN-LAST:event_jmi_cerrarSesionActionPerformed

    private void jt_solicitudesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_solicitudesMouseClicked
        if (evt.getClickCount() == 2) {
            try {
                this.controller.mostrarBienes(Integer.parseInt(jt_solicitudes.getValueAt(jt_solicitudes.getSelectedRow(), 0).toString()));

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jt_solicitudesMouseClicked

    private void jb_catalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_catalogoActionPerformed
        try {
            jd_catalogo.setVisible(true);
            this.model.setJd_tableModel((DefaultTableModel) jt_catalogo.getModel());
            this.model.getJd_tableModel().setRowCount(0);
            this.controller.llenarCatalogo();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            jd_catalogo.setVisible(false);
        }
    }//GEN-LAST:event_jb_catalogoActionPerformed

    @Override
    public void update(Observable o, Object o1) {}




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jb_catalogo;
    private javax.swing.JButton jb_mostrarSolicitudes;
    private javax.swing.JDialog jd_catalogo;
    private javax.swing.JLabel jl_solicitudes;
    private javax.swing.JMenu jm_opciones;
    private javax.swing.JMenuBar jmb_menu;
    private javax.swing.JMenuItem jmi_cerrarSesion;
    private javax.swing.JTable jt_catalogo;
    private javax.swing.JTable jt_solicitudes;
=======
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_AgregarCategoria;
    private javax.swing.JButton jb_MostrarSolicitudes;
    private javax.swing.JLabel jl_Categoria;
    private javax.swing.JLabel jl_CategoriaNueva;
    private javax.swing.JLabel jl_Solicitudes;
    private javax.swing.JMenuItem jmi_CerrarSesion;
    private javax.swing.JTextField jtf_Categoria;
    private javax.swing.JTable jtm_Solicitudes;
>>>>>>> Stashed changes
    // End of variables declaration//GEN-END:variables
}
