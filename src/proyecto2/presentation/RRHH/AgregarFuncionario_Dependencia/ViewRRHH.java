package proyecto2.presentation.RRHH.AgregarFuncionario_Dependencia;

import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;
import proyecto2.logic.Dependencia;

/**
 *
 * @author jaalf
 */
public class ViewRRHH extends javax.swing.JFrame implements Observer {

    private ModelRRHH model;
    private ControllerRRHH controller;

    public ViewRRHH() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public ModelRRHH getModel() {
        return model;
    }

    public void setModel(ModelRRHH model) {
        this.model = model;
    }

    public ControllerRRHH getController() {
        return controller;
    }

    public void setController(ControllerRRHH controller) {
        this.controller = controller;
    }

    public void limpiarCamposFuncionario() {
        jtf_idFuncionario.setText("");
        jtf_claveFuncionario.setText("");
        jtf_nombreFuncionario.setText("");
    }

    public void limpiarCamposDependencia() {
        jtf_idDependencia.setText("");
        jtf_nombreDependencia.setText("");
    }

    public boolean isValidoFuncionario() {
        boolean flag = true;
        jl_idFuncionario.setForeground(Color.getColor("[0,0,0]"));
        jl_claveFuncionario.setForeground(Color.getColor("[0,0,0]"));
        jl_nombreFuncionario.setForeground(Color.getColor("[0,0,0]"));

        if (jtf_idFuncionario.getText().equals("")) {
            flag = false;
            jl_idFuncionario.setForeground(Color.RED);
        }

        if (jtf_claveFuncionario.getText().equals("")) {
            flag = false;
            jl_claveFuncionario.setForeground(Color.RED);
        }

        if (jtf_nombreFuncionario.getText().equals("")) {
            flag = false;
            jl_nombreFuncionario.setForeground(Color.RED);
        }

        return flag;
    }

    public boolean isValidoDependencia() {
        boolean flag = true;
        jl_idDependencia.setForeground(Color.getColor("[0,0,0]"));
        jl_nombreDependencia.setForeground(Color.getColor("[0,0,0]"));

        if (jtf_idDependencia.getText().equals("")) {
            flag = false;
            jl_idDependencia.setForeground(Color.RED);
        }

        if (jtf_nombreDependencia.getText().equals("")) {
            flag = false;
            jl_nombreDependencia.setForeground(Color.RED);
        }

        return flag;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_funcionario = new javax.swing.JLabel();
        jl_idFuncionario = new javax.swing.JLabel();
        jl_claveFuncionario = new javax.swing.JLabel();
        jl_nombreFuncionario = new javax.swing.JLabel();
        jl_dependenciaFuncionario = new javax.swing.JLabel();
        jb_agregarFuncionario = new javax.swing.JButton();
        jl_puestoFuncionario = new javax.swing.JLabel();
        jb_cancelarFuncionario = new javax.swing.JButton();
        jtf_idFuncionario = new javax.swing.JTextField();
        jtf_claveFuncionario = new javax.swing.JTextField();
        jtf_nombreFuncionario = new javax.swing.JTextField();
        jl_dependencia = new javax.swing.JLabel();
        jl_nombreDependencia = new javax.swing.JLabel();
        jl_idDependencia = new javax.swing.JLabel();
        jtf_nombreDependencia = new javax.swing.JTextField();
        jtf_idDependencia = new javax.swing.JTextField();
        jb_agregarDependencia = new javax.swing.JButton();
        jb_cancelarDependencia = new javax.swing.JButton();
        jcb_puestoFuncionario = new javax.swing.JComboBox<>();
        jcb_depdenciaFuncionario = new javax.swing.JComboBox<>();
        js_separador = new javax.swing.JSeparator();
        jmb_menu = new javax.swing.JMenuBar();
        jm_opciones = new javax.swing.JMenu();
        jmi_cerrarSesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jefe RRHH");

        jl_funcionario.setText("Funcionario");

        jl_idFuncionario.setText("Id");

        jl_claveFuncionario.setText("Clave");

        jl_nombreFuncionario.setText("Nombre");

        jl_dependenciaFuncionario.setText("Dependencia");

        jb_agregarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2/presentation/iconos/agregar.png"))); // NOI18N
        jb_agregarFuncionario.setText("Agregar");
        jb_agregarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_agregarFuncionarioActionPerformed(evt);
            }
        });

        jl_puestoFuncionario.setText("Puesto");

        jb_cancelarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2/presentation/iconos/cancelar.png"))); // NOI18N
        jb_cancelarFuncionario.setText("Cancelar");
        jb_cancelarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancelarFuncionarioActionPerformed(evt);
            }
        });

        jtf_idFuncionario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtf_idFuncionarioKeyPressed(evt);
            }
        });

        jtf_claveFuncionario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtf_claveFuncionarioKeyPressed(evt);
            }
        });

        jtf_nombreFuncionario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtf_nombreFuncionarioKeyPressed(evt);
            }
        });

        jl_dependencia.setText("Dependencia");

        jl_nombreDependencia.setText("Nombre");

        jl_idDependencia.setText("Id");

        jtf_nombreDependencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtf_nombreDependenciaKeyPressed(evt);
            }
        });

        jtf_idDependencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtf_idDependenciaKeyPressed(evt);
            }
        });

        jb_agregarDependencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2/presentation/iconos/agregar.png"))); // NOI18N
        jb_agregarDependencia.setText("Agregar");
        jb_agregarDependencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_agregarDependenciaActionPerformed(evt);
            }
        });

        jb_cancelarDependencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2/presentation/iconos/cancelar.png"))); // NOI18N
        jb_cancelarDependencia.setText("Cancelar");
        jb_cancelarDependencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancelarDependenciaActionPerformed(evt);
            }
        });

        jcb_puestoFuncionario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Secretaria", "Registrador", "Jefe OCCB", "Jefe RRHH" }));
        jcb_puestoFuncionario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jcb_puestoFuncionarioKeyPressed(evt);
            }
        });

        jcb_depdenciaFuncionario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jcb_depdenciaFuncionarioKeyPressed(evt);
            }
        });

        js_separador.setOrientation(javax.swing.SwingConstants.VERTICAL);

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
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_claveFuncionario)
                            .addComponent(jl_nombreFuncionario)
                            .addComponent(jl_idFuncionario))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_claveFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_nombreFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_idFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_puestoFuncionario)
                            .addComponent(jl_dependenciaFuncionario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcb_depdenciaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcb_puestoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jl_funcionario))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jb_agregarFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb_cancelarFuncionario)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(js_separador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jl_nombreDependencia)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jl_dependencia)
                                        .addContainerGap(90, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtf_idDependencia, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtf_nombreDependencia, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap(82, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jl_idDependencia)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb_agregarDependencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_cancelarDependencia)
                        .addContainerGap(21, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_dependencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_idDependencia)
                            .addComponent(jtf_idDependencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_nombreDependencia)
                            .addComponent(jtf_nombreDependencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jb_agregarDependencia)
                            .addComponent(jb_cancelarDependencia)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_funcionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_idFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_idFuncionario)
                            .addComponent(jl_puestoFuncionario)
                            .addComponent(jcb_puestoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_claveFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_claveFuncionario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_nombreFuncionario)
                            .addComponent(jtf_nombreFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_dependenciaFuncionario)
                            .addComponent(jcb_depdenciaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jb_agregarFuncionario)
                            .addComponent(jb_cancelarFuncionario)))
                    .addComponent(js_separador, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_cerrarSesionActionPerformed
        this.controller.cerrarSesion();
    }//GEN-LAST:event_jmi_cerrarSesionActionPerformed

    private void jb_agregarDependenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_agregarDependenciaActionPerformed
        if (this.isValidoDependencia()) {
            try {
                this.model.getDependencia().setId(jtf_idDependencia.getText());
                this.model.getDependencia().setNombre(jtf_nombreDependencia.getText());
                this.controller.agregarDependencia();

                JOptionPane.showMessageDialog(null, "Se agrego correctamente", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                this.limpiarCamposDependencia();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Campos sin llenar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jb_agregarDependenciaActionPerformed

    private void jtf_idDependenciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_idDependenciaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (this.isValidoDependencia()) {
                try {
                    this.model.getDependencia().setId(jtf_idDependencia.getText());
                    this.model.getDependencia().setNombre(jtf_nombreDependencia.getText());
                    this.controller.agregarDependencia();

                    JOptionPane.showMessageDialog(null, "Se agrego correctamente", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                    this.limpiarCamposDependencia();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Campos sin llenar", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jtf_idDependenciaKeyPressed

    private void jtf_nombreDependenciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_nombreDependenciaKeyPressed
        this.jtf_idDependenciaKeyPressed(evt);
    }//GEN-LAST:event_jtf_nombreDependenciaKeyPressed

    private void jb_cancelarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelarFuncionarioActionPerformed
        this.limpiarCamposFuncionario();
    }//GEN-LAST:event_jb_cancelarFuncionarioActionPerformed

    private void jb_cancelarDependenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelarDependenciaActionPerformed
        this.limpiarCamposDependencia();
    }//GEN-LAST:event_jb_cancelarDependenciaActionPerformed

    private void jb_agregarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_agregarFuncionarioActionPerformed
        if (this.isValidoFuncionario()) {
            try {
                this.model.getUsuario().setId(jtf_idFuncionario.getText());
                this.model.getUsuario().setClave(jtf_claveFuncionario.getText());
                this.model.getUsuario().setPermiso(jcb_puestoFuncionario.getSelectedItem().toString());

                this.model.getFuncionario().setId(jtf_idFuncionario.getText());
                this.model.getFuncionario().setNombre(jtf_nombreFuncionario.getText());
                this.model.getFuncionario().setDependencia(this.model.getDb().searchDependencia(jcb_depdenciaFuncionario.getSelectedItem().toString().substring(jcb_depdenciaFuncionario.getSelectedItem().toString().indexOf("(") + 1, jcb_depdenciaFuncionario.getSelectedItem().toString().length() - 1)));
                this.model.getFuncionario().setUsuario(this.model.getDb().searchUsuario(jtf_idFuncionario.getText()));
                this.controller.agregarFuncionario();

                JOptionPane.showMessageDialog(null, "Se agrego correctamente", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                this.limpiarCamposFuncionario();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Campos sin llenar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jb_agregarFuncionarioActionPerformed

    private void jtf_idFuncionarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_idFuncionarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (this.isValidoFuncionario()) {
                try {
                    this.model.getUsuario().setId(jtf_idFuncionario.getText());
                    this.model.getUsuario().setClave(jtf_claveFuncionario.getText());
                    this.model.getUsuario().setPermiso(jcb_puestoFuncionario.getSelectedItem().toString());

                    this.model.getFuncionario().setId(jtf_idFuncionario.getText());
                    this.model.getFuncionario().setNombre(jtf_nombreFuncionario.getText());
                    this.model.getFuncionario().setDependencia(this.model.getDb().searchDependencia(jcb_depdenciaFuncionario.getSelectedItem().toString().substring(jcb_depdenciaFuncionario.getSelectedItem().toString().indexOf("(") + 1, jcb_depdenciaFuncionario.getSelectedItem().toString().length() - 1)));
                    this.model.getFuncionario().setUsuario(this.model.getUsuario());
                    this.controller.agregarFuncionario();

                    JOptionPane.showMessageDialog(null, "Se agrego correctamente", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                    this.limpiarCamposFuncionario();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Campos sin llenar", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jtf_idFuncionarioKeyPressed

    private void jtf_claveFuncionarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_claveFuncionarioKeyPressed
        this.jtf_idFuncionarioKeyPressed(evt);
    }//GEN-LAST:event_jtf_claveFuncionarioKeyPressed

    private void jtf_nombreFuncionarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_nombreFuncionarioKeyPressed
        this.jtf_idFuncionarioKeyPressed(evt);
    }//GEN-LAST:event_jtf_nombreFuncionarioKeyPressed

    private void jcb_puestoFuncionarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcb_puestoFuncionarioKeyPressed
        this.jtf_idFuncionarioKeyPressed(evt);
    }//GEN-LAST:event_jcb_puestoFuncionarioKeyPressed

    private void jcb_depdenciaFuncionarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcb_depdenciaFuncionarioKeyPressed
        this.jtf_idFuncionarioKeyPressed(evt);
    }//GEN-LAST:event_jcb_depdenciaFuncionarioKeyPressed

    @Override
    public void update(Observable o, Object o1) {
    }

    @Override
    public void setVisible(boolean bln) {
        super.setVisible(bln);
        try {
            jcb_depdenciaFuncionario.removeAllItems();
            for (Dependencia d : this.model.mostrarDependencias()) {
                jcb_depdenciaFuncionario.addItem(d.getNombre() + " (" + d.getId() + ")");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jb_agregarDependencia;
    private javax.swing.JButton jb_agregarFuncionario;
    private javax.swing.JButton jb_cancelarDependencia;
    private javax.swing.JButton jb_cancelarFuncionario;
    private javax.swing.JComboBox<String> jcb_depdenciaFuncionario;
    private javax.swing.JComboBox<String> jcb_puestoFuncionario;
    private javax.swing.JLabel jl_claveFuncionario;
    private javax.swing.JLabel jl_dependencia;
    private javax.swing.JLabel jl_dependenciaFuncionario;
    private javax.swing.JLabel jl_funcionario;
    private javax.swing.JLabel jl_idDependencia;
    private javax.swing.JLabel jl_idFuncionario;
    private javax.swing.JLabel jl_nombreDependencia;
    private javax.swing.JLabel jl_nombreFuncionario;
    private javax.swing.JLabel jl_puestoFuncionario;
    private javax.swing.JMenu jm_opciones;
    private javax.swing.JMenuBar jmb_menu;
    private javax.swing.JMenuItem jmi_cerrarSesion;
    private javax.swing.JSeparator js_separador;
    private javax.swing.JTextField jtf_claveFuncionario;
    private javax.swing.JTextField jtf_idDependencia;
    private javax.swing.JTextField jtf_idFuncionario;
    private javax.swing.JTextField jtf_nombreDependencia;
    private javax.swing.JTextField jtf_nombreFuncionario;
    // End of variables declaration//GEN-END:variables
}
