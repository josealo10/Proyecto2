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
<<<<<<< Updated upstream
    
    public ViewMostrarSolicitudes() {
        initComponents();
        this.setLocationRelativeTo(null);
        DefaultTableCellRenderer alinear = (DefaultTableCellRenderer) jt_solicitudes.getCellRenderer(0, 0);
        alinear.setHorizontalAlignment(SwingConstants.CENTER);
    }
    
=======

>>>>>>> Stashed changes
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
    
<<<<<<< Updated upstream
=======
    
    
    public ViewMostrarSolicitudes() {
        initComponents();
        this.setLocationRelativeTo(null);
        DefaultTableCellRenderer alinear = (DefaultTableCellRenderer) jtm_Solicitudes.getCellRenderer(0, 0);
        
    }

>>>>>>> Stashed changes
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

<<<<<<< Updated upstream
        jl_solicitudes = new javax.swing.JLabel();
        jb_mostrarSolicitudes = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_solicitudes = new javax.swing.JTable();
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

        jb_AgregarCategoria.setText("Agregar categoria");
        jb_AgregarCategoria.addActionListener(new java.awt.event.ActionListener() {
>>>>>>> Stashed changes
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_AgregarCategoriaActionPerformed(evt);
            }
        });

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jb_MostrarSolicitudes)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(164, 164, 164)
                            .addComponent(jl_Solicitudes))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_AgregarCategoria)
                    .addGroup(layout.createSequentialGroup()
<<<<<<< Updated upstream
                        .addGap(132, 132, 132)
                        .addComponent(jl_solicitudes))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jb_mostrarSolicitudes)
=======
                        .addComponent(jl_Categoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_CategoriaNueva)
                            .addComponent(jtf_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
>>>>>>> Stashed changes
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_Categoria))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_AgregarCategoria))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
>>>>>>> Stashed changes
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_MostrarSolicitudes)
                .addContainerGap(17, Short.MAX_VALUE))
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
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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
    
=======
            this.controller.LlenarTabla();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jb_MostrarSolicitudesActionPerformed

    private void jmi_CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_CerrarSesionActionPerformed
        this.controller.CerrarSesion();
    }//GEN-LAST:event_jmi_CerrarSesionActionPerformed

>>>>>>> Stashed changes
    @Override
    public void update(Observable o, Object o1) {}




    // Variables declaration - do not modify//GEN-BEGIN:variables
<<<<<<< Updated upstream
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jb_mostrarSolicitudes;
    private javax.swing.JLabel jl_solicitudes;
    private javax.swing.JMenu jm_opciones;
    private javax.swing.JMenuBar jmb_menu;
    private javax.swing.JMenuItem jmi_cerrarSesion;
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
