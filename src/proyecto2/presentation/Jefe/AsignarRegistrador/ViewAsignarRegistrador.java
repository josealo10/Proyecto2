package proyecto2.presentation.Jefe.AsignarRegistrador;

import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import proyecto2.logic.Funcionario;

/*
 * @author Alessandro Fazio Pérez / Jose Alonso Alfaro Perez
 */
public class ViewAsignarRegistrador extends javax.swing.JFrame implements Observer {

    private ControllerAsignarRegistrador controller;
    private ModelAsignarRegistrador model;

    public ViewAsignarRegistrador() throws Exception {
        initComponents();
        this.setLocationRelativeTo(null);
        this.jd_bienes.setLocationRelativeTo(null);
        DefaultTableCellRenderer alinear = (DefaultTableCellRenderer) jt_bienes.getCellRenderer(0, 0);
        alinear.setHorizontalAlignment(SwingConstants.CENTER);

        alinear = (DefaultTableCellRenderer) jt_solicitudes.getCellRenderer(0, 0);
        alinear.setHorizontalAlignment(SwingConstants.CENTER);
    }

    public ControllerAsignarRegistrador getController() {
        return controller;
    }

    public void setController(ControllerAsignarRegistrador controller) {
        this.controller = controller;
    }

    public ModelAsignarRegistrador getModel() {
        return model;
    }

    public void setModel(ModelAsignarRegistrador model) {
        this.model = model;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_bienes = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_bienes = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_solicitudes = new javax.swing.JTable();
        jl_solicitudes = new javax.swing.JLabel();
        jl_registradores = new javax.swing.JLabel();
        jcb_registradores = new javax.swing.JComboBox<>();
        jb_asignar = new javax.swing.JButton();
        jb_mostrar = new javax.swing.JButton();
        jmb_menu = new javax.swing.JMenuBar();
        jm_opciones = new javax.swing.JMenu();
        jmi_cerrarSesion = new javax.swing.JMenuItem();

        jd_bienes.setTitle("Bienes");
        jd_bienes.setSize(new java.awt.Dimension(485, 330));

        jt_bienes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Cantidad", "Marca", "Modelo", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jt_bienes);

        javax.swing.GroupLayout jd_bienesLayout = new javax.swing.GroupLayout(jd_bienes.getContentPane());
        jd_bienes.getContentPane().setLayout(jd_bienesLayout);
        jd_bienesLayout.setHorizontalGroup(
            jd_bienesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_bienesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_bienesLayout.setVerticalGroup(
            jd_bienesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_bienesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jefe OCCB");
        setResizable(false);

        jt_solicitudes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Dependencia", "Funcionario", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jt_solicitudes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_solicitudesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_solicitudes);

        jl_solicitudes.setText("Solicitudes");

        jl_registradores.setText("Registradores");

        jcb_registradores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno" }));

        jb_asignar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2/presentation/iconos/agregar.png"))); // NOI18N
        jb_asignar.setText("Asignar registrador");
        jb_asignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_asignarActionPerformed(evt);
            }
        });

        jb_mostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2/presentation/iconos/search.png"))); // NOI18N
        jb_mostrar.setText("Mostrar solicitudes");
        jb_mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_mostrarActionPerformed(evt);
            }
        });

        jm_opciones.setText("Opciones");

        jmi_cerrarSesion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jmi_cerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2/presentation/iconos/exit.png"))); // NOI18N
        jmi_cerrarSesion.setText("Cerrar sesion");
        jmi_cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_cerrarSesionActionPerformed(evt);
            }
        });
        jm_opciones.add(jmi_cerrarSesion);

        jmb_menu.add(jm_opciones);

        setJMenuBar(jmb_menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jb_mostrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jl_solicitudes)
                        .addGap(212, 212, 212))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcb_registradores, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb_asignar))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jl_registradores)
                        .addGap(79, 79, 79))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_registradores)
                    .addComponent(jl_solicitudes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jcb_registradores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_asignar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_mostrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_asignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_asignarActionPerformed
        try {
            this.controller.asignarRegistrador(Integer.parseInt(jt_solicitudes.getValueAt(jt_solicitudes.getSelectedRow(), 0).toString()), jcb_registradores.getSelectedItem().toString().substring(jcb_registradores.getSelectedItem().toString().indexOf("(") + 1, jcb_registradores.getSelectedItem().toString().length() - 1));
            JOptionPane.showMessageDialog(null, "Se asigno registrador correctamente", "Information", JOptionPane.INFORMATION_MESSAGE);
            this.jb_mostrarActionPerformed(evt);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jb_asignarActionPerformed

    private void jb_mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_mostrarActionPerformed
        try {
            this.model.setJf_tableModel((DefaultTableModel) jt_solicitudes.getModel());
            this.model.getJf_tableModel().setRowCount(0);
            this.controller.jf_llenarTabla();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jb_mostrarActionPerformed

    private void jmi_cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_cerrarSesionActionPerformed
        controller.cerrarSesion();
    }//GEN-LAST:event_jmi_cerrarSesionActionPerformed

    private void jt_solicitudesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_solicitudesMouseClicked
        if (evt.getClickCount() == 2) {
            try {
                jd_bienes.setVisible(true);
                this.model.setJd_tableModel((DefaultTableModel) jt_bienes.getModel());
                this.model.getJd_tableModel().setRowCount(0);
                this.controller.jd_llenarTabla(Integer.parseInt(jt_solicitudes.getValueAt(jt_solicitudes.getSelectedRow(), 0).toString()));

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                jd_bienes.setVisible(false);
            }
        }
    }//GEN-LAST:event_jt_solicitudesMouseClicked

    @Override
    public void update(Observable o, Object o1) {
    }

    @Override
    public void setVisible(boolean bln) {
        super.setVisible(bln);    
        try {
            jcb_registradores.removeAllItems();
            for (Funcionario f : this.model.mostrarRegistradores()) {
                jcb_registradores.addItem(f.getNombre() + " (" + f.getId() + ")");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jb_asignar;
    private javax.swing.JButton jb_mostrar;
    private javax.swing.JComboBox<String> jcb_registradores;
    private javax.swing.JDialog jd_bienes;
    private javax.swing.JLabel jl_registradores;
    private javax.swing.JLabel jl_solicitudes;
    private javax.swing.JMenu jm_opciones;
    private javax.swing.JMenuBar jmb_menu;
    private javax.swing.JMenuItem jmi_cerrarSesion;
    private javax.swing.JTable jt_bienes;
    private javax.swing.JTable jt_solicitudes;
    // End of variables declaration//GEN-END:variables
}
