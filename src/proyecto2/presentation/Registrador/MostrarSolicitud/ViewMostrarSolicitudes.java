/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.presentation.Registrador.MostrarSolicitud;

import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jaalf
 */
public class ViewMostrarSolicitudes extends javax.swing.JFrame implements Observer {

    private ControllerMostrarSolicitudes controller;
    private ModelMostrarSolicitudes model;

    public ViewMostrarSolicitudes() {
        initComponents();
        this.setLocationRelativeTo(null);
        DefaultTableCellRenderer alinear = (DefaultTableCellRenderer) jt_solicitudes.getCellRenderer(0, 0);
        alinear.setHorizontalAlignment(SwingConstants.CENTER);
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

    public void limpiarCampos() {
        jtf_categoria.setText("");
    }

    public boolean isValido() {
        boolean flag = true;
        jl_nombreCategoria.setForeground(Color.getColor("[0,0,0]"));

        if (jtf_categoria.getText().equals("")) {
            flag = false;
            jl_nombreCategoria.setForeground(Color.RED);
        }

        return flag;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_categoriaNueva = new javax.swing.JLabel();
        jl_nombreCategoria = new javax.swing.JLabel();
        jtf_categoria = new javax.swing.JTextField();
        jb_agregarCategoria = new javax.swing.JButton();
        jl_solicitudes = new javax.swing.JLabel();
        jb_mostrarSolicitudes = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_solicitudes = new javax.swing.JTable();
        jmb_menu = new javax.swing.JMenuBar();
        jm_opciones = new javax.swing.JMenu();
        jmi_cerrarSesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrador");
        setResizable(false);

        jl_categoriaNueva.setText("Categoria Nueva");

        jl_nombreCategoria.setText("Nombre");

        jtf_categoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtf_categoriaKeyPressed(evt);
            }
        });

        jb_agregarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2/presentation/iconos/agregar.png"))); // NOI18N
        jb_agregarCategoria.setText("Agregar categoria");
        jb_agregarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_agregarCategoriaActionPerformed(evt);
            }
        });

        jl_solicitudes.setText("Solicitudes");

        jb_mostrarSolicitudes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2/presentation/iconos/search.png"))); // NOI18N
        jb_mostrarSolicitudes.setText("Mostrar solicitudes");
        jb_mostrarSolicitudes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_mostrarSolicitudesActionPerformed(evt);
            }
        });

        jt_solicitudes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Dependencia", "Funcionario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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
        jScrollPane2.setViewportView(jt_solicitudes);

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jl_solicitudes))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jl_nombreCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtf_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jb_agregarCategoria)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jl_categoriaNueva)
                                .addGap(54, 54, 54))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jb_mostrarSolicitudes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_nombreCategoria))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_agregarCategoria))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_solicitudes)
                            .addComponent(jl_categoriaNueva))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_mostrarSolicitudes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_agregarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_agregarCategoriaActionPerformed
        if (this.isValido()) {
            try {

                this.model.getCategoria().setNombre(jtf_categoria.getText());

                this.controller.agregarCategoria();
                this.limpiarCampos();
                JOptionPane.showMessageDialog(null, "Se agrego correctamente", "Informacion", JOptionPane.INFORMATION_MESSAGE);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Campos sin llenar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jb_agregarCategoriaActionPerformed

    private void jb_mostrarSolicitudesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_mostrarSolicitudesActionPerformed
        try {
            this.model.setJf_tableModel((DefaultTableModel) jt_solicitudes.getModel());
            this.model.getJf_tableModel().setRowCount(0);
            this.controller.llenarTabla();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jb_mostrarSolicitudesActionPerformed

    private void jmi_cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_cerrarSesionActionPerformed
        this.controller.cerrarSesion();
    }//GEN-LAST:event_jmi_cerrarSesionActionPerformed

    private void jt_solicitudesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_solicitudesMouseClicked

    }//GEN-LAST:event_jt_solicitudesMouseClicked

    private void jtf_categoriaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_categoriaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (this.isValido()) {
                try {
                    this.model.getCategoria().setNombre(jtf_categoria.getText());
                    this.controller.agregarCategoria();
                    this.limpiarCampos();
                    JOptionPane.showMessageDialog(null, "Se agrego correctamente", "Informacion", JOptionPane.INFORMATION_MESSAGE);

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Campos sin llenar", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jtf_categoriaKeyPressed

    @Override
    public void update(Observable o, Object o1) {
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jb_agregarCategoria;
    private javax.swing.JButton jb_mostrarSolicitudes;
    private javax.swing.JLabel jl_categoriaNueva;
    private javax.swing.JLabel jl_nombreCategoria;
    private javax.swing.JLabel jl_solicitudes;
    private javax.swing.JMenu jm_opciones;
    private javax.swing.JMenuBar jmb_menu;
    private javax.swing.JMenuItem jmi_cerrarSesion;
    private javax.swing.JTable jt_solicitudes;
    private javax.swing.JTextField jtf_categoria;
    // End of variables declaration//GEN-END:variables
}
