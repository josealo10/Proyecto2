package proyecto2.presentation.Administrador.ingresoSolicitud;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/*
 * @author Alessandro Fazio Pérez / Jose Alonso Alfaro Perez
 */
public class ViewIngresoSolicitud extends javax.swing.JFrame implements Observer {

    private ModelIngresoSolicitud model;
    private ControllerIngresoSolicitud controller;

    public ViewIngresoSolicitud() {
        initComponents();
        this.setLocationRelativeTo(null);
        DefaultTableCellRenderer alinear = (DefaultTableCellRenderer) jt_bienes.getCellRenderer(0, 0);
        alinear.setHorizontalAlignment(SwingConstants.CENTER);
    }

    public void setModel(ModelIngresoSolicitud model) {
        this.model = model;
        model.addObserver(this);
    }

    public void setController(ControllerIngresoSolicitud controller) {
        this.controller = controller;
    }

    public void limpiarCampos() {
        jtf_cantidad.setText("");
        jtf_descripcion.setText("");
        jtf_marca.setText("");
        jtf_modelo.setText("");
        jtf_precioT.setText("");
        jtf_precioU.setText("");
    }

    public boolean valido() {
        boolean flag = true;
        jl_cantidad.setForeground(Color.getColor("[0,0,0]"));
        jl_descripcion.setForeground(Color.getColor("[0,0,0]"));
        jl_marca.setForeground(Color.getColor("[0,0,0]"));
        jl_modelo.setForeground(Color.getColor("[0,0,0]"));
        jl_precioT.setForeground(Color.getColor("[0,0,0]"));
        jl_precioU.setForeground(Color.getColor("[0,0,0]"));

        if ((jtf_cantidad.getText()).equals("")) {
            flag = false;
            jl_cantidad.setForeground(Color.RED);
        }

        if ((jtf_descripcion.getText()).equals("")) {
            flag = false;
            jl_descripcion.setForeground(Color.RED);
        }

        if ((jtf_marca.getText()).equals("")) {
            flag = false;
            jl_marca.setForeground(Color.RED);
        }

        if ((jtf_modelo.getText()).equals("")) {
            flag = false;
            jl_modelo.setForeground(Color.RED);
        }

        if ((jtf_precioT.getText()).equals("")) {
            flag = false;
            jl_precioT.setForeground(Color.RED);
        }

        if ((jtf_precioU.getText()).equals("")) {
            flag = false;
            jl_precioU.setForeground(Color.RED);
        }

        return flag;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jb_agregarSolicitud = new javax.swing.JButton();
        jb_cancelarSolicitud = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_bienes = new javax.swing.JTable();
        jl_marca = new javax.swing.JLabel();
        jcb_tipo = new javax.swing.JComboBox<>();
        jb_agregarBien = new javax.swing.JButton();
        jtf_cantidad = new javax.swing.JTextField();
        jl_descripcion = new javax.swing.JLabel();
        jl_tipo = new javax.swing.JLabel();
        jl_precioT = new javax.swing.JLabel();
        jl_cantidad = new javax.swing.JLabel();
        jtf_precioT = new javax.swing.JTextField();
        jb_cancelarBien = new javax.swing.JButton();
        jtf_descripcion = new javax.swing.JTextField();
        jl_precioU = new javax.swing.JLabel();
        jtf_precioU = new javax.swing.JTextField();
        jl_modelo = new javax.swing.JLabel();
        jtf_marca = new javax.swing.JTextField();
        jtf_modelo = new javax.swing.JTextField();
        js_separador = new javax.swing.JSeparator();

        setTitle("Bienes");

        jb_agregarSolicitud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2/presentation/iconos/agregar.png"))); // NOI18N
        jb_agregarSolicitud.setText("Agregar  solicitud");
        jb_agregarSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_agregarSolicitudActionPerformed(evt);
            }
        });

        jb_cancelarSolicitud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2/presentation/iconos/cancelar.png"))); // NOI18N
        jb_cancelarSolicitud.setText("Cancelar solicitud");
        jb_cancelarSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancelarSolicitudActionPerformed(evt);
            }
        });

        jt_bienes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cantidad", "Codigo", "Marca", "Modelo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jt_bienes);

        jl_marca.setText("Marca");

        jcb_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Compra", "Donativo" }));

        jb_agregarBien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2/presentation/iconos/agregar.png"))); // NOI18N
        jb_agregarBien.setText("Agregar bien");
        jb_agregarBien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_agregarBienActionPerformed(evt);
            }
        });

        jtf_cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtf_cantidadKeyReleased(evt);
            }
        });

        jl_descripcion.setText("Descripcion");

        jl_tipo.setText("Tipo");

        jl_precioT.setText("Precio total           $");

        jl_cantidad.setText("Cantidad");

        jtf_precioT.setEditable(false);

        jb_cancelarBien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2/presentation/iconos/cancelar.png"))); // NOI18N
        jb_cancelarBien.setText("Cancelar bien");
        jb_cancelarBien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancelarBienActionPerformed(evt);
            }
        });

        jl_precioU.setText("Precio unitario      $");

        jtf_precioU.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtf_precioUKeyReleased(evt);
            }
        });

        jl_modelo.setText("Modelo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jl_modelo)
                                            .addComponent(jl_marca)
                                            .addComponent(jl_tipo))
                                        .addGap(13, 13, 13))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jl_cantidad)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcb_tipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtf_marca)
                                    .addComponent(jtf_modelo)
                                    .addComponent(jtf_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jb_agregarBien)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jb_cancelarBien))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jl_descripcion)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jl_precioU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jl_precioT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGap(15, 15, 15)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtf_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jtf_precioT, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jtf_precioU, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jb_agregarSolicitud)
                                .addGap(69, 69, 69)
                                .addComponent(jb_cancelarSolicitud)
                                .addGap(57, 57, 57)))
                        .addGap(17, 17, 17))
                    .addComponent(js_separador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_tipo)
                    .addComponent(jl_descripcion)
                    .addComponent(jtf_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_marca)
                    .addComponent(jl_precioU)
                    .addComponent(jtf_precioU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_modelo)
                    .addComponent(jl_precioT)
                    .addComponent(jtf_precioT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jb_cancelarBien)
                        .addComponent(jb_agregarBien))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtf_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jl_cantidad)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(js_separador, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_cancelarSolicitud)
                    .addComponent(jb_agregarSolicitud))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_cancelarSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelarSolicitudActionPerformed
        try {
            if (this.model.getTableModel() != null) {
                this.model.getTableModel().setRowCount(0);
            }
            
            this.model.setSolicitud(null);
            this.setVisible(false);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jb_cancelarSolicitudActionPerformed

    private void jb_agregarSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_agregarSolicitudActionPerformed
        try {
            this.controller.agregarSolicitud();
            JOptionPane.showMessageDialog(null, "Se agrego correctamente", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            this.model.setSolicitud(null);
            this.model.getTableModel().setRowCount(0);
            this.setVisible(false);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jb_agregarSolicitudActionPerformed

    private void jtf_precioUKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_precioUKeyReleased
        if (jtf_precioU.getText().matches("[0-9]+") && jtf_cantidad.getText().matches("[0-9]+")) {
            jtf_precioT.setText("" + Double.parseDouble(jtf_precioU.getText()) * Double.parseDouble(jtf_cantidad.getText()));
        } else {
            jtf_precioT.setText("");
        }
    }//GEN-LAST:event_jtf_precioUKeyReleased

    private void jtf_cantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_cantidadKeyReleased
        this.jtf_precioUKeyReleased(evt);
    }//GEN-LAST:event_jtf_cantidadKeyReleased

    private void jb_cancelarBienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelarBienActionPerformed
        this.limpiarCampos();
    }//GEN-LAST:event_jb_cancelarBienActionPerformed

    private void jb_agregarBienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_agregarBienActionPerformed
        if (this.valido()) {
            try {
                this.model.setTableModel((DefaultTableModel) jt_bienes.getModel());
                this.model.getBien().setMarca(jtf_marca.getText());
                this.model.getBien().setCantidad(Integer.parseInt(jtf_cantidad.getText()));
                this.model.getBien().setModelo(jtf_modelo.getText());
                this.model.getBien().setTipo(jcb_tipo.getSelectedItem().toString());
                this.model.getBien().setDescripcion(jtf_descripcion.getText());
                this.controller.agregarBien();

                JOptionPane.showMessageDialog(null, "Se agrego correctamente", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                this.limpiarCampos();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                this.limpiarCampos();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Campos sin llenar", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jb_agregarBienActionPerformed

    @Override
    public void update(Observable o, Object o1) {
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_agregarBien;
    private javax.swing.JButton jb_agregarSolicitud;
    private javax.swing.JButton jb_cancelarBien;
    private javax.swing.JButton jb_cancelarSolicitud;
    private javax.swing.JComboBox<String> jcb_tipo;
    private javax.swing.JLabel jl_cantidad;
    private javax.swing.JLabel jl_descripcion;
    private javax.swing.JLabel jl_marca;
    private javax.swing.JLabel jl_modelo;
    private javax.swing.JLabel jl_precioT;
    private javax.swing.JLabel jl_precioU;
    private javax.swing.JLabel jl_tipo;
    private javax.swing.JSeparator js_separador;
    private javax.swing.JTable jt_bienes;
    private javax.swing.JTextField jtf_cantidad;
    private javax.swing.JTextField jtf_descripcion;
    private javax.swing.JTextField jtf_marca;
    private javax.swing.JTextField jtf_modelo;
    private javax.swing.JTextField jtf_precioT;
    private javax.swing.JTextField jtf_precioU;
    // End of variables declaration//GEN-END:variables
}
