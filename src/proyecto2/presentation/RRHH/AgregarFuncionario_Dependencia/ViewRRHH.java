package proyecto2.presentation.RRHH.AgregarFuncionario_Dependencia;

import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import proyecto2.logic.Dependencia;

/*
 * @author Alessandro Fazio Pérez / Jose Alonso Alfaro Perez
 */
public class ViewRRHH extends javax.swing.JFrame implements Observer {

    private ModelRRHH model;
    private ControllerRRHH controller;

    public ViewRRHH() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.jd_dependencias.setLocationRelativeTo(null);
        this.jd_funcionarios.setLocationRelativeTo(null);

        DefaultTableCellRenderer alinear = (DefaultTableCellRenderer) jt_dependencias.getCellRenderer(0, 0);
        alinear.setHorizontalAlignment(SwingConstants.CENTER);

        alinear = (DefaultTableCellRenderer) jt_funcionarios.getCellRenderer(0, 0);
        alinear.setHorizontalAlignment(SwingConstants.CENTER);
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

        jd_funcionarios = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_funcionarios = new javax.swing.JTable();
        jd_dependencias = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_dependencias = new javax.swing.JTable();
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
        jb_mostrarFuncionarios = new javax.swing.JButton();
        jb_mostrarDependencias = new javax.swing.JButton();
        jmb_menu = new javax.swing.JMenuBar();
        jm_opciones = new javax.swing.JMenu();
        jmi_cerrarSesion = new javax.swing.JMenuItem();

        jd_funcionarios.setTitle("Funcionarios");
        jd_funcionarios.setSize(new java.awt.Dimension(462, 340));

        jt_funcionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Dependencia", "Puesto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jt_funcionarios);

        javax.swing.GroupLayout jd_funcionariosLayout = new javax.swing.GroupLayout(jd_funcionarios.getContentPane());
        jd_funcionarios.getContentPane().setLayout(jd_funcionariosLayout);
        jd_funcionariosLayout.setHorizontalGroup(
            jd_funcionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_funcionariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                .addContainerGap())
        );
        jd_funcionariosLayout.setVerticalGroup(
            jd_funcionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_funcionariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jd_dependencias.setTitle("Dependencias");
        jd_dependencias.setSize(new java.awt.Dimension(340, 350));

        jt_dependencias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jt_dependencias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_dependenciasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jt_dependencias);

        javax.swing.GroupLayout jd_dependenciasLayout = new javax.swing.GroupLayout(jd_dependencias.getContentPane());
        jd_dependencias.getContentPane().setLayout(jd_dependenciasLayout);
        jd_dependenciasLayout.setHorizontalGroup(
            jd_dependenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_dependenciasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_dependenciasLayout.setVerticalGroup(
            jd_dependenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_dependenciasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jefe RRHH");
        setResizable(false);

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

        jb_mostrarFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2/presentation/iconos/search.png"))); // NOI18N
        jb_mostrarFuncionarios.setText("Mostrar");
        jb_mostrarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_mostrarFuncionariosActionPerformed(evt);
            }
        });

        jb_mostrarDependencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2/presentation/iconos/search.png"))); // NOI18N
        jb_mostrarDependencias.setText("Mostrar");
        jb_mostrarDependencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_mostrarDependenciasActionPerformed(evt);
            }
        });

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
                        .addContainerGap()
                        .addComponent(jb_agregarFuncionario)
                        .addGap(18, 18, 18)
                        .addComponent(jb_mostrarFuncionarios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb_cancelarFuncionario)))
                .addGap(18, 18, 18)
                .addComponent(js_separador, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jb_agregarDependencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb_mostrarDependencias))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_nombreDependencia)
                            .addComponent(jl_idDependencia))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jl_dependencia)
                                .addGap(8, 8, 8))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtf_idDependencia, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtf_nombreDependencia))))))
                .addGap(18, 18, 18)
                .addComponent(jb_cancelarDependencia)
                .addGap(0, 12, Short.MAX_VALUE))
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
                            .addComponent(jtf_idDependencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_idDependencia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_nombreDependencia)
                            .addComponent(jtf_nombreDependencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jb_cancelarDependencia, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jb_agregarDependencia)
                                .addComponent(jb_mostrarDependencias))))
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
                            .addComponent(jb_cancelarFuncionario)
                            .addComponent(jb_mostrarFuncionarios)))
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
                this.setVisible(true);

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
                    this.setVisible(true);

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
                if (!this.model.getDb().isSearchUsuario(jtf_idFuncionario.getText())) {
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
                    JOptionPane.showMessageDialog(null, "Usuario ya existe", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Campos sin llenar", "Error", JOptionPane.ERROR_MESSAGE);
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

    private void jb_mostrarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_mostrarFuncionariosActionPerformed
        try {
            jd_funcionarios.setVisible(true);
            this.model.setTableModelFuncionarios((DefaultTableModel) jt_funcionarios.getModel());
            this.model.getTableModelFuncionarios().setRowCount(0);
            this.controller.llenarTablaFuncionarios();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            jd_funcionarios.setVisible(false);
        }
    }//GEN-LAST:event_jb_mostrarFuncionariosActionPerformed

    private void jb_mostrarDependenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_mostrarDependenciasActionPerformed
        try {
            jd_dependencias.setVisible(true);
            this.model.setTableModelDependencias((DefaultTableModel) jt_dependencias.getModel());
            this.model.getTableModelDependencias().setRowCount(0);
            this.controller.llenarTablaDependencias();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            jd_dependencias.setVisible(false);
        }
    }//GEN-LAST:event_jb_mostrarDependenciasActionPerformed

    private void jt_dependenciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_dependenciasMouseClicked
        if (evt.getClickCount() == 2) {
            try {
                jd_funcionarios.setVisible(true);
                this.model.setTableModelFuncionarios((DefaultTableModel) jt_funcionarios.getModel());
                this.model.getTableModelFuncionarios().setRowCount(0);
                this.controller.llenarTablaFuncionariosDependencia(jt_dependencias.getValueAt(jt_dependencias.getSelectedRow(), 0).toString());

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage() + " de " + jt_dependencias.getValueAt(jt_dependencias.getSelectedRow(), 1).toString() + " (" + jt_dependencias.getValueAt(jt_dependencias.getSelectedRow(), 0).toString() + ")", "Error", JOptionPane.ERROR_MESSAGE);
                jd_funcionarios.setVisible(false);
            }
        }
    }//GEN-LAST:event_jt_dependenciasMouseClicked

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jb_agregarDependencia;
    private javax.swing.JButton jb_agregarFuncionario;
    private javax.swing.JButton jb_cancelarDependencia;
    private javax.swing.JButton jb_cancelarFuncionario;
    private javax.swing.JButton jb_mostrarDependencias;
    private javax.swing.JButton jb_mostrarFuncionarios;
    private javax.swing.JComboBox<String> jcb_depdenciaFuncionario;
    private javax.swing.JComboBox<String> jcb_puestoFuncionario;
    private javax.swing.JDialog jd_dependencias;
    private javax.swing.JDialog jd_funcionarios;
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
    private javax.swing.JTable jt_dependencias;
    private javax.swing.JTable jt_funcionarios;
    private javax.swing.JTextField jtf_claveFuncionario;
    private javax.swing.JTextField jtf_idDependencia;
    private javax.swing.JTextField jtf_idFuncionario;
    private javax.swing.JTextField jtf_nombreDependencia;
    private javax.swing.JTextField jtf_nombreFuncionario;
    // End of variables declaration//GEN-END:variables
}
