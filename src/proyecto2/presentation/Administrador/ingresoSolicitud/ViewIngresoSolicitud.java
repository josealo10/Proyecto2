package proyecto2.presentation.Administrador.ingresoSolicitud;

import java.util.Observable;
import java.util.Observer;

/*
 * @author Alessandro Fazio Pérez / Jose Alonso Alfaro Perez
 */
public class ViewIngresoSolicitud extends javax.swing.JFrame implements Observer {

    private ModelIngresoSolicitud model;
    private ControllerIngresoSolicitud controller;
    
    public ViewIngresoSolicitud() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void setModel(ModelIngresoSolicitud model) {
        this.model = model;
    }

    public void setController(ControllerIngresoSolicitud controller) {
        this.controller = controller;
    }
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jb_ingresar = new javax.swing.JButton();
        jb_cancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jb_agregarB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jb_ingresar.setText("Ingresar Solicitud");
        jb_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_ingresarActionPerformed(evt);
            }
        });

        jb_cancelar.setText("Cancelar Solicitud");
        jb_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancelarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jb_agregarB.setText("Agregar Bien");
        jb_agregarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_agregarBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jb_agregarB))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jb_ingresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_cancelar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_agregarB)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_ingresar)
                    .addComponent(jb_cancelar))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_cancelarActionPerformed

    private void jb_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_ingresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_ingresarActionPerformed

    private void jb_agregarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_agregarBActionPerformed
        controller.MostrarBien();
    }//GEN-LAST:event_jb_agregarBActionPerformed

    @Override
    public void update(Observable o, Object o1) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jb_agregarB;
    private javax.swing.JButton jb_cancelar;
    private javax.swing.JButton jb_ingresar;
    // End of variables declaration//GEN-END:variables
}
