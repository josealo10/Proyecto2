package proyecto2.presentation.Secretaria.aprobarSolicitud;

import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/*
 * @author Alessandro Fazio Pérez / Jose Alonso Alfaro Perez
 */
public class ViewAprobarSolicitud extends javax.swing.JFrame implements Observer {

    private ModelAprobarSolicitud model;
    private ControllerAprobarSolicitud controller;

    public ViewAprobarSolicitud() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.jd_bienes.setLocationRelativeTo(null);
        DefaultTableCellRenderer alinear = (DefaultTableCellRenderer) jt_bienes.getCellRenderer(0, 0);
        alinear.setHorizontalAlignment(SwingConstants.CENTER);

        alinear = (DefaultTableCellRenderer) jt_solicitudes.getCellRenderer(0, 0);
        alinear.setHorizontalAlignment(SwingConstants.CENTER);
    }

    public void setModel(ModelAprobarSolicitud model) {
        this.model = model;
        model.addObserver(this);
    }

    public void setController(ControllerAprobarSolicitud controller) {
        this.controller = controller;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_bienes = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_bienes = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_solicitudes = new javax.swing.JTable();
        jb_aprobar = new javax.swing.JButton();
        jb_rechazar = new javax.swing.JButton();
        jl_solicitudes = new javax.swing.JLabel();
        jb_mostrar = new javax.swing.JButton();
        jmb_menu = new javax.swing.JMenuBar();
        jm_opciones = new javax.swing.JMenu();
        jmi_cerrarSesion = new javax.swing.JMenuItem();

        jd_bienes.setTitle("Bienes");
        jd_bienes.setLocation(new java.awt.Point(0, 0));
        jd_bienes.setPreferredSize(new java.awt.Dimension(395, 333));
        jd_bienes.setResizable(false);
        jd_bienes.setSize(new java.awt.Dimension(405, 330));

        jt_bienes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Cantidad", "Marca", "Modelo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jt_bienes);

        javax.swing.GroupLayout jd_bienesLayout = new javax.swing.GroupLayout(jd_bienes.getContentPane());
        jd_bienes.getContentPane().setLayout(jd_bienesLayout);
        jd_bienesLayout.setHorizontalGroup(
            jd_bienesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_bienesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_bienesLayout.setVerticalGroup(
            jd_bienesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_bienesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Secretaria");
        setResizable(false);

        jt_solicitudes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Dependencia", "Funcionario", "Fecha", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jt_solicitudes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_solicitudesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_solicitudes);

        jb_aprobar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2/presentation/iconos/aceptar.png"))); // NOI18N
        jb_aprobar.setText("Aprobar");
        jb_aprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_aprobarActionPerformed(evt);
            }
        });

        jb_rechazar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2/presentation/iconos/rechazar.png"))); // NOI18N
        jb_rechazar.setText("Rechazar");
        jb_rechazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_rechazarActionPerformed(evt);
            }
        });

        jl_solicitudes.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jl_solicitudes.setText("Solicitudes");

        jb_mostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2/presentation/iconos/search.png"))); // NOI18N
        jb_mostrar.setText("Mostrar solicitudes");
        jb_mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_mostrarActionPerformed(evt);
            }
        });

        jm_opciones.setText("Opciones");

        jmi_cerrarSesion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jmi_cerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2/presentation/iconos/exit.png"))); // NOI18N
        jmi_cerrarSesion.setText("Cerrar sesión");
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
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(jl_solicitudes)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_aprobar)
                .addGap(16, 16, 16)
                .addComponent(jb_mostrar)
                .addGap(18, 18, 18)
                .addComponent(jb_rechazar)
                .addGap(124, 124, 124))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_solicitudes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_aprobar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_mostrar)
                    .addComponent(jb_rechazar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_mostrarActionPerformed
        try {
            this.model.setJf_tableModel((DefaultTableModel) jt_solicitudes.getModel());
            this.model.getJf_tableModel().setRowCount(0);
            this.controller.jf_llenarTabla();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + " en estado de espera", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jb_mostrarActionPerformed

    private void jmi_cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_cerrarSesionActionPerformed
        this.controller.cerrarSesion();
    }//GEN-LAST:event_jmi_cerrarSesionActionPerformed

    private void jb_aprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_aprobarActionPerformed
        try {
            if (jt_solicitudes.getSelectedRow() == -1) {
                throw new Exception("No hay fila seleccionada");
            }

            this.controller.cambiarEstado(Integer.parseInt(jt_solicitudes.getValueAt(jt_solicitudes.getSelectedRow(), 0).toString()), "Aprobada");
            JOptionPane.showMessageDialog(null, "Solicitud aprobada", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            this.jb_mostrarActionPerformed(evt);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jb_aprobarActionPerformed

    private void jb_rechazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_rechazarActionPerformed
        try {
            if (jt_solicitudes.getSelectedRow() == -1) {
                throw new Exception("No hay fila seleccionada");
            }

            this.controller.cambiarEstado(Integer.parseInt(jt_solicitudes.getValueAt(jt_solicitudes.getSelectedRow(), 0).toString()), "Rechazada");
            JOptionPane.showMessageDialog(null, "Solicitud rechazada", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            this.jb_mostrarActionPerformed(evt);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jb_rechazarActionPerformed

    private void jt_solicitudesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_solicitudesMouseClicked
        if (evt.getClickCount() == 2) {
            try {
                jd_bienes.setVisible(true);
                this.model.setJd_tableModel((DefaultTableModel) jt_bienes.getModel());
                this.model.getJd_tableModel().setRowCount(0);
                this.controller.jd_llenarTabla(Integer.parseInt(jt_solicitudes.getValueAt(jt_solicitudes.getSelectedRow(), 0).toString()));

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                jd_bienes.setVisible(false);
            }
        }
    }//GEN-LAST:event_jt_solicitudesMouseClicked

    @Override
    public void update(Observable o, Object o1) {
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jb_aprobar;
    private javax.swing.JButton jb_mostrar;
    private javax.swing.JButton jb_rechazar;
    private javax.swing.JDialog jd_bienes;
    private javax.swing.JLabel jl_solicitudes;
    private javax.swing.JMenu jm_opciones;
    private javax.swing.JMenuBar jmb_menu;
    private javax.swing.JMenuItem jmi_cerrarSesion;
    private javax.swing.JTable jt_bienes;
    private javax.swing.JTable jt_solicitudes;
    // End of variables declaration//GEN-END:variables
}
