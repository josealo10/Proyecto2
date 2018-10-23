package proyecto2.presentation.ingreso;

import com.sun.glass.events.KeyEvent;
<<<<<<< HEAD
import java.awt.Color;
=======
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
>>>>>>> master
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;
import proyecto2.Application;

/*
 * @author Alessandro Fazio Perez / Jose Alonso Alfaro Perez
 */
public class ViewUsuario extends javax.swing.JFrame implements Observer {

    ModelUsuario model;
    ControllerUsuario controller;

    public ViewUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jl_clave = new javax.swing.JLabel();
        jpf_clave = new javax.swing.JPasswordField();

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

        jtf_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtf_usuarioKeyPressed(evt);
            }
        });

        jl_clave.setText("Clave");

        jpf_clave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jpf_claveKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtf_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(jpf_clave))))
<<<<<<< HEAD
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
=======
                .addContainerGap(52, Short.MAX_VALUE))
>>>>>>> master
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_usuario)
                    .addComponent(jtf_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_clave)
                    .addComponent(jpf_clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_entrar)
                    .addComponent(jb_salir))
<<<<<<< HEAD
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
=======
                .addContainerGap(48, Short.MAX_VALUE))
>>>>>>> master
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jb_salirActionPerformed

    private void jb_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_entrarActionPerformed
        try {
            controller.ingresar(jtf_usuario.getText(), jpf_clave.getText());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jb_entrarActionPerformed

    private void jpf_claveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpf_claveKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                JOptionPane.showMessageDialog(null, "Bienvenido: " + model.getDao().searchFuncionario(jtf_usuario.getText()).getNombre() + " (" + model.getDao().searchUsuario(jtf_usuario.getText()).getPermiso() + ")",
                        "Informacion", JOptionPane.INFORMATION_MESSAGE);
                controller.ingresar(jtf_usuario.getText(), jpf_clave.getText());

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jpf_claveKeyPressed

    private void jtf_usuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_usuarioKeyPressed
        this.jpf_claveKeyPressed(evt);
    }//GEN-LAST:event_jtf_usuarioKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jb_entrar;
    private javax.swing.JButton jb_salir;
    private javax.swing.JLabel jl_clave;
    private javax.swing.JLabel jl_usuario;
    private javax.swing.JPasswordField jpf_clave;
    private javax.swing.JTextField jtf_usuario;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object o1) {
    }
}
