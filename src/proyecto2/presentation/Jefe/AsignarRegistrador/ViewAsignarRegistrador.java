/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.presentation.Jefe.AsignarRegistrador;

import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jaalf
 */
public class ViewAsignarRegistrador extends javax.swing.JFrame implements Observer {

    private ControllerAsignarRegistrador controller;
    private ModelAsignarRegistrador model;

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
    
    public ViewAsignarRegistrador() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jt_solicitudes = new javax.swing.JTable();
        jl_solicitudes = new javax.swing.JLabel();
        jl_registradores = new javax.swing.JLabel();
        jcb_registradores = new javax.swing.JComboBox<>();
        jb_Asignar = new javax.swing.JButton();
        jb_mostrarS = new javax.swing.JButton();

        jt_solicitudes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jt_solicitudes);

        jl_solicitudes.setText("Solicitudess");

        jl_registradores.setText("Registradores");

        jcb_registradores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno" }));
        jcb_registradores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_registradoresActionPerformed(evt);
            }
        });

        jb_Asignar.setText("Agignar registrador");
        jb_Asignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_AsignarActionPerformed(evt);
            }
        });

        jb_mostrarS.setText("Mostrar soicitudes");
        jb_mostrarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_mostrarSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jl_solicitudes)
                        .addGap(189, 189, 189)
                        .addComponent(jl_registradores))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jb_mostrarS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jb_Asignar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcb_registradores, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_registradores)
                    .addComponent(jl_solicitudes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcb_registradores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_mostrarS)
                    .addComponent(jb_Asignar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcb_registradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_registradoresActionPerformed

    }//GEN-LAST:event_jcb_registradoresActionPerformed

    private void jb_AsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_AsignarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_AsignarActionPerformed

    private void jb_mostrarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_mostrarSActionPerformed
         try {
            this.model.setJf_tableModel((DefaultTableModel) jt_solicitudes.getModel());
            this.model.getJf_tableModel().setRowCount(0);
            this.controller.jf_llenarTabla();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jb_mostrarSActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_Asignar;
    private javax.swing.JButton jb_mostrarS;
    private javax.swing.JComboBox<String> jcb_registradores;
    private javax.swing.JLabel jl_registradores;
    private javax.swing.JLabel jl_solicitudes;
    private javax.swing.JTable jt_solicitudes;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object o1) {
        
    }
}
