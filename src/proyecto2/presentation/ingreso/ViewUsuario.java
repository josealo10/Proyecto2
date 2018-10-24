package proyecto2.presentation.ingreso;

import java.awt.event.KeyEvent;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;

/*
 * @author Alessandro Fazio Perez / Jose Alonso Alfaro Perez
 */
public class ViewUsuario extends javax.swing.JFrame implements Observer {

    private ModelUsuario model;
    private ControllerUsuario controller;

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

        jl_id = new javax.swing.JLabel();
        jl_clave = new javax.swing.JLabel();
        jtf_id = new javax.swing.JTextField();
        jpf_clave = new javax.swing.JPasswordField();
        jb_entrar = new javax.swing.JButton();
        jb_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingreso");

        jl_id.setText("Id");

        jl_clave.setText("Clave");

        jtf_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtf_idKeyPressed(evt);
            }
        });

        jpf_clave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jpf_claveKeyPressed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jl_clave)
                            .addComponent(jl_id))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtf_id, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(jpf_clave)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jb_entrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_id)
                    .addComponent(jtf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_clave)
                    .addComponent(jpf_clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_entrar)
                    .addComponent(jb_salir))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jb_salirActionPerformed

    private void jb_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_entrarActionPerformed
        try {
            controller.ingresar(jtf_id.getText(), jpf_clave.getText());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jb_entrarActionPerformed

    private void jtf_idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_idKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                JOptionPane.showMessageDialog(null, "Bienvenido: " + model.getDao().searchFuncionario(jtf_id.getText()).getNombre() + " (" + model.getDao().searchUsuario(jtf_id.getText()).getPermiso() + ")",
                        "Informacion", JOptionPane.INFORMATION_MESSAGE);
                controller.ingresar(jtf_id.getText(), jpf_clave.getText());

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jtf_idKeyPressed

    private void jpf_claveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpf_claveKeyPressed
        this.jtf_idKeyPressed(evt);
    }//GEN-LAST:event_jpf_claveKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jb_entrar;
    private javax.swing.JButton jb_salir;
    private javax.swing.JLabel jl_clave;
    private javax.swing.JLabel jl_id;
    private javax.swing.JPasswordField jpf_clave;
    private javax.swing.JTextField jtf_id;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object o1) {
    }
}
