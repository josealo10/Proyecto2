/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.presentation.Registrador.Bienes;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import proyecto2.logic.Categoria;
import proyecto2.logic.Funcionario;

/**
 *
 * @author jaalf
 */
public class ViewBienes extends javax.swing.JFrame implements Observer {

    private ControllerBienes controller;
    private ModelBienes model;

    public ViewBienes() {
        initComponents();
        this.setLocationRelativeTo(null);
        DefaultTableCellRenderer alinear = (DefaultTableCellRenderer) jt_bienes.getCellRenderer(0, 0);
        alinear.setHorizontalAlignment(SwingConstants.CENTER);
    }

    public ControllerBienes getController() {
        return controller;
    }

    public void setController(ControllerBienes controller) {
        this.controller = controller;
    }

    public ModelBienes getModel() {
        return model;
    }

    public void setModel(ModelBienes model) {
        this.model = model;
    }

    public void limpiarCampos() {
        jtf_categoria.setText("");
    }

    public boolean isValidoNuevaCategoria() {
        boolean flag = true;
        jl_nombreCategoria.setForeground(Color.getColor("[0,0,0]"));

        if (jtf_categoria.getText().equals("")) {
            flag = false;
            jl_nombreCategoria.setForeground(Color.RED);
        }

        return flag;
    }

    public boolean isValidoCategoria() {
        boolean flag = true;
        jl_categoria.setForeground(Color.getColor("[0,0,0]"));

        if (jcb_categorias.getItemCount() == 0) {
            flag = false;
            jl_categoria.setForeground(Color.RED);
        }

        return flag;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
<<<<<<< Updated upstream
        jt_bienes = new javax.swing.JTable();
        jl_categoria = new javax.swing.JLabel();
        jcb_categorias = new javax.swing.JComboBox<>();
        jb_aplicar = new javax.swing.JButton();
        jb_asignar = new javax.swing.JButton();
        jl_nombreCategoria = new javax.swing.JLabel();
        jtf_categoria = new javax.swing.JTextField();
        jb_agregarCategoria = new javax.swing.JButton();
        jl_categoriaNueva = new javax.swing.JLabel();
        js_separador = new javax.swing.JSeparator();
        jb_auxiliar = new javax.swing.JButton();
=======
        jt_Bienes = new javax.swing.JTable();
        Categoria = new javax.swing.JLabel();
        jcb_Categorias = new javax.swing.JComboBox<>();
        jb_Aplicar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
>>>>>>> Stashed changes

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jt_Bienes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jt_Bienes);

        jl_categoria.setText("Categoria");

        jb_aplicar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2/presentation/iconos/aceptar.png"))); // NOI18N
        jb_aplicar.setText("Aplicar");
        jb_aplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_aplicarActionPerformed(evt);
            }
        });

        jb_asignar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2/presentation/iconos/agregar.png"))); // NOI18N
        jb_asignar.setText("Asignar");
        jb_asignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_asignarActionPerformed(evt);
            }
        });

        jl_nombreCategoria.setText("Nombre");

        jtf_categoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtf_categoriaKeyPressed(evt);
            }
        });

        jb_agregarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2/presentation/iconos/agregar.png"))); // NOI18N
        jb_agregarCategoria.setText("Agregar");
        jb_agregarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_agregarCategoriaActionPerformed(evt);
            }
        });

        jl_categoriaNueva.setText("Categoria Nueva");

        jb_auxiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_auxiliarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
<<<<<<< Updated upstream
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jb_aplicar)))
=======
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jb_Aplicar)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
>>>>>>> Stashed changes
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jl_categoria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcb_categorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jb_asignar)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jb_auxiliar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jl_nombreCategoria)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jb_agregarCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jtf_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jl_categoriaNueva)
                                        .addGap(24, 24, 24))
                                    .addComponent(js_separador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 20, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_categoria)
                            .addComponent(jcb_categorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_asignar)
                        .addGap(40, 40, 40)
                        .addComponent(js_separador, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl_categoriaNueva)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_nombreCategoria)
                            .addComponent(jtf_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_agregarCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_aplicar)
                    .addComponent(jb_auxiliar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_asignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_asignarActionPerformed
        if (this.isValidoCategoria()) {
            try {
                if (jt_bienes.getSelectedRow() == -1) {
                    throw new Exception("No hay fila seleccionada");
                }

                for (int i = 0; i < Integer.parseInt(jt_bienes.getValueAt(jt_bienes.getSelectedRow(), 1).toString()); i++) {
                    this.model.getActivo().setCategoria(this.model.getDb().searchCategoria(jcb_categorias.getSelectedItem().toString()));
                    this.model.getActivo().setBien(this.model.getDb().searchBien(Integer.parseInt(jt_bienes.getValueAt(jt_bienes.getSelectedRow(), 0).toString())));
                    this.model.getActivo().setCodigo(0);
                    this.model.getActivo().setMarca(jt_bienes.getValueAt(jt_bienes.getSelectedRow(), 2).toString());
                    this.model.getActivo().setModelo(jt_bienes.getValueAt(jt_bienes.getSelectedRow(), 3).toString());
                    this.model.getActivos().add(this.model.getActivo());
                }
                
                this.model.getJf_tableModel().removeRow(jt_bienes.getSelectedRow());
                this.jb_auxiliarActionPerformed(evt);
                JOptionPane.showMessageDialog(null, "Asignada correctamente", "Informacion", JOptionPane.INFORMATION_MESSAGE);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay categorias", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jb_asignarActionPerformed

    private void jtf_categoriaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_categoriaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (this.isValidoNuevaCategoria()) {
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

    private void jb_agregarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_agregarCategoriaActionPerformed
        if (this.isValidoNuevaCategoria()) {
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

    private void jb_aplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_aplicarActionPerformed
        if (jt_bienes.getRowCount() == 0) {
            try {
                this.controller.agregarActivo();
                this.controller.cambiarEstado(this.model.getSolicitud().getCodigo(), "Procesada");
                JOptionPane.showMessageDialog(null, "Solicitud procesada", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                this.setVisible(false);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Faltan bienes por procesar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jb_aplicarActionPerformed

    private void jb_auxiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_auxiliarActionPerformed
        try {
            jcb_categorias.removeAllItems();
            for (Categoria c : this.model.mostrarCategorias()) {
                jcb_categorias.addItem(c.getNombre());
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jb_auxiliarActionPerformed

    @Override
    public void update(Observable o, Object o1) {
    }

    @Override
    public void setVisible(boolean bln) {
        super.setVisible(bln);
        this.model.setJf_tableModel((DefaultTableModel) jt_bienes.getModel());
        this.model.getJf_tableModel().setRowCount(0);
        this.model.getActivos().clear();

        try {
            jcb_categorias.removeAllItems();
            for (Categoria c : this.model.mostrarCategorias()) {
                jcb_categorias.addItem(c.getNombre());
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
<<<<<<< Updated upstream
    private javax.swing.JButton jb_agregarCategoria;
    private javax.swing.JButton jb_aplicar;
    private javax.swing.JButton jb_asignar;
    private javax.swing.JButton jb_auxiliar;
    private javax.swing.JComboBox<String> jcb_categorias;
    private javax.swing.JLabel jl_categoria;
    private javax.swing.JLabel jl_categoriaNueva;
    private javax.swing.JLabel jl_nombreCategoria;
    private javax.swing.JSeparator js_separador;
    private javax.swing.JTable jt_bienes;
    private javax.swing.JTextField jtf_categoria;
=======
    private javax.swing.JButton jb_Aplicar;
    private javax.swing.JComboBox<String> jcb_Categorias;
    private javax.swing.JTable jt_Bienes;
>>>>>>> Stashed changes
    // End of variables declaration//GEN-END:variables
}
