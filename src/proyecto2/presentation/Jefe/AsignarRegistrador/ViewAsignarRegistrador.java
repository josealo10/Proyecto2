package proyecto2.presentation.Jefe.AsignarRegistrador;

import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import proyecto2.logic.Funcionario;

/**
 *
 * @author jaalf
 */
public class ViewAsignarRegistrador extends javax.swing.JFrame implements Observer {

    private ControllerAsignarRegistrador controller;
    private ModelAsignarRegistrador model;

    public ViewAsignarRegistrador() throws Exception {
        initComponents();
        this.setLocationRelativeTo(null);
        DefaultTableCellRenderer alinear = (DefaultTableCellRenderer) jt_solicitudes.getCellRenderer(0, 0);
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jl_solicitudes)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcb_registradores, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb_asignar))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(jl_registradores)
                        .addGap(114, 114, 114))))
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
        // TODO add your handling code here:
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
    private javax.swing.JButton jb_asignar;
    private javax.swing.JButton jb_mostrar;
    private javax.swing.JComboBox<String> jcb_registradores;
    private javax.swing.JLabel jl_registradores;
    private javax.swing.JLabel jl_solicitudes;
    private javax.swing.JMenu jm_opciones;
    private javax.swing.JMenuBar jmb_menu;
    private javax.swing.JMenuItem jmi_cerrarSesion;
    private javax.swing.JTable jt_solicitudes;
    // End of variables declaration//GEN-END:variables
}
