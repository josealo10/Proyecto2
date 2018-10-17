package proyecto2.presentation.ingreso;

import java.util.Observable;
import java.util.Observer;

/*
 * @author Alessandro Fazio Perez / Jose Alonso Alfaro Perez
 */
public class ViewUsuario extends javax.swing.JFrame implements Observer {

    ModelUsuario model;
    ControllerUsuario controller;

    public ViewUsuario() {
        initComponents();
    }

    public void setModel(ModelUsuario model) {
        this.model = model;
        model.addObserver(this);
    }

    public void setController(ControllerUsuario controller) {
        this.controller = controller;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_usuario = new javax.swing.JLabel();
        jb_entrar = new javax.swing.JButton();
        jb_salir = new javax.swing.JButton();
        jtf_usuario = new javax.swing.JTextField();
        jtf_clave = new javax.swing.JTextField();
        jl_clave = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingreso");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jl_usuario.setText("Usuario");

        jb_entrar.setText("Entrar");
        jb_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_entrarActionPerformed(evt);
            }
        });

        jb_salir.setText("Salir");
        jb_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_salirActionPerformed(evt);
            }
        });

        jl_clave.setText("Clave");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jb_entrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_salir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_usuario)
                            .addComponent(jl_clave))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_clave, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_usuario)
                    .addComponent(jtf_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_clave)
                    .addComponent(jtf_clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_entrar)
                    .addComponent(jb_salir))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jb_salirActionPerformed

    private void jb_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_entrarActionPerformed
        
    }//GEN-LAST:event_jb_entrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jb_entrar;
    private javax.swing.JButton jb_salir;
    private javax.swing.JLabel jl_clave;
    private javax.swing.JLabel jl_usuario;
    private javax.swing.JTextField jtf_clave;
    private javax.swing.JTextField jtf_usuario;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object o1) {
    }
}