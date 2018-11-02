/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.presentation.Registrador.MostrarSolicitud;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author jaalf
 */
public class ViewMostrarSolicitudes extends javax.swing.JFrame implements Observer {

    private ControllerMostrarSolicitudes controller;
    private ModelMostrarSolicitudes model;

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
    
    
    
    public ViewMostrarSolicitudes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtm_Solicitudes = new javax.swing.JTable();
        jl_CategoriaNueva = new javax.swing.JLabel();
        jl_Categoria = new javax.swing.JLabel();
        jl_Solicitudes = new javax.swing.JLabel();
        jtf_Categoria = new javax.swing.JTextField();
        jb_AgregarCategoria = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtm_Solicitudes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtm_Solicitudes);

        jl_CategoriaNueva.setText("Categoria Nueva");

        jl_Categoria.setText("Categoria");

        jl_Solicitudes.setText("Solicitudes");

        jtf_Categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_CategoriaActionPerformed(evt);
            }
        });

        jb_AgregarCategoria.setText("Agregar categoria");
        jb_AgregarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_AgregarCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_Categoria)
                    .addComponent(jb_AgregarCategoria)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jl_Solicitudes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtf_Categoria)
                    .addComponent(jl_CategoriaNueva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(123, 123, 123))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_CategoriaNueva)
                    .addComponent(jl_Solicitudes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_Categoria)
                            .addComponent(jtf_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_AgregarCategoria))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_CategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_CategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_CategoriaActionPerformed

    private void jb_AgregarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_AgregarCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_AgregarCategoriaActionPerformed

    @Override
    public void update(Observable o, Object o1) {}



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_AgregarCategoria;
    private javax.swing.JLabel jl_Categoria;
    private javax.swing.JLabel jl_CategoriaNueva;
    private javax.swing.JLabel jl_Solicitudes;
    private javax.swing.JTextField jtf_Categoria;
    private javax.swing.JTable jtm_Solicitudes;
    // End of variables declaration//GEN-END:variables
}
