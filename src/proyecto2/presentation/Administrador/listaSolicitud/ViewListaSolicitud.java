package proyecto2.presentation.Administrador.listaSolicitud;

import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import proyecto2.logic.Bien;
import proyecto2.logic.Solicitud;

/*
 * @author Alessandro Fazio Pérez / Jose Alonso Alfaro Perez
 */
public class ViewListaSolicitud extends javax.swing.JFrame implements Observer {

    private ModelListaSolicitud model;
    private ControllerListaSolicitud controller;

    public ViewListaSolicitud() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.jd_bienes.setLocationRelativeTo(null);
        DefaultTableCellRenderer alinear = (DefaultTableCellRenderer) jt_bienes.getCellRenderer(0, 0);
        alinear.setHorizontalAlignment(SwingConstants.CENTER);

        alinear = (DefaultTableCellRenderer) jt_solicitudes.getCellRenderer(0, 0);
        alinear.setHorizontalAlignment(SwingConstants.CENTER);
    }

    public void setModel(ModelListaSolicitud model) {
        this.model = model;
        model.addObserver(this);
    }

    public void setController(ControllerListaSolicitud controller) {
        this.controller = controller;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_bienes = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_bienes = new javax.swing.JTable();
        jl_solicitudes = new javax.swing.JLabel();
        jb_agregarS = new javax.swing.JButton();
        jb_salir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_solicitudes = new javax.swing.JTable();
        jb_mostrar = new javax.swing.JButton();

        jd_bienes.setTitle("Bienes");
        jd_bienes.setSize(new java.awt.Dimension(415, 370));

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
                .addContainerGap(47, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jl_solicitudes.setText("Mis solicitudes");

        jb_agregarS.setText("Nueva Solicitud");
        jb_agregarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_agregarSActionPerformed(evt);
            }
        });

        jb_salir.setText("Salir");
        jb_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_salirActionPerformed(evt);
            }
        });

        jt_solicitudes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Fecha", "Funcionario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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

        jb_mostrar.setText("Mostrar Solicitudes");
        jb_mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_mostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jl_solicitudes)
                .addGap(161, 161, 161))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jb_agregarS)
                        .addGap(18, 18, 18)
                        .addComponent(jb_mostrar)
                        .addGap(18, 18, 18)
                        .addComponent(jb_salir)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jl_solicitudes, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_agregarS)
                    .addComponent(jb_salir)
                    .addComponent(jb_mostrar))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_agregarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_agregarSActionPerformed
        controller.MostrarIngresoSolicitud();
    }//GEN-LAST:event_jb_agregarSActionPerformed

    private void jb_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jb_salirActionPerformed

    private void jb_mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_mostrarActionPerformed
        try {
            this.model.setJf_tableModel((DefaultTableModel) jt_solicitudes.getModel());
            this.model.getJf_tableModel().setRowCount(0);
            this.controller.jf_llenarTabla();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jb_mostrarActionPerformed

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
    private javax.swing.JButton jb_agregarS;
    private javax.swing.JButton jb_mostrar;
    private javax.swing.JButton jb_salir;
    private javax.swing.JDialog jd_bienes;
    private javax.swing.JLabel jl_solicitudes;
    private javax.swing.JTable jt_bienes;
    private javax.swing.JTable jt_solicitudes;
    // End of variables declaration//GEN-END:variables
}
