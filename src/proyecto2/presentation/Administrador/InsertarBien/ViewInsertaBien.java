package proyecto2.presentation.Administrador.InsertarBien;

import java.util.Observable;
import java.util.Observer;

/*
 * @author Alessandro Fazio Pérez / Jose Alonso Alfaro Perez
 */
public class ViewInsertaBien extends javax.swing.JFrame implements Observer {

    public ViewInsertaBien() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcb_bien = new javax.swing.JComboBox<>();
        jtf_cantidad = new javax.swing.JTextField();
        jl_tipo = new javax.swing.JLabel();
        jl_cantidad = new javax.swing.JLabel();
        jb_cancelar = new javax.swing.JButton();
        jl_precioU = new javax.swing.JLabel();
        jtf_precioU = new javax.swing.JTextField();
        jl_modelo = new javax.swing.JLabel();
        jcb_modelo = new javax.swing.JComboBox<>();
        jl_marca = new javax.swing.JLabel();
        jcb_marca = new javax.swing.JComboBox<>();
        jb_agregar = new javax.swing.JButton();
        jl_descripcion = new javax.swing.JLabel();
        jtf_descripcion = new javax.swing.JTextField();
        jl_precioT = new javax.swing.JLabel();
        jtf_precioT = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jcb_bien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jl_tipo.setText("Tipo de bien");

        jl_cantidad.setText("Cantidad");

        jb_cancelar.setText("Cancelar");
        jb_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancelarActionPerformed(evt);
            }
        });

        jl_precioU.setText("Precio unitario");

        jl_modelo.setText("Modelo");

        jcb_modelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jl_marca.setText("Marca");

        jcb_marca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jb_agregar.setText("Agregar bien");

        jl_descripcion.setText("Descripcion");

        jl_precioT.setText("Precio Total");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_tipo)
                    .addComponent(jl_modelo)
                    .addComponent(jl_marca)
                    .addComponent(jl_cantidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jcb_marca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcb_bien, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jtf_cantidad)
                            .addGap(6, 6, 6)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jcb_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jl_precioT)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jb_agregar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jb_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtf_precioT))
                        .addGap(206, 206, 206))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jl_precioU)
                                .addGap(38, 38, 38)
                                .addComponent(jtf_precioU, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jl_descripcion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcb_bien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_tipo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_marca)
                            .addComponent(jcb_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_modelo)
                            .addComponent(jcb_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jl_descripcion)
                                .addGap(86, 86, 86))
                            .addComponent(jtf_descripcion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jl_cantidad)
                        .addComponent(jtf_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jl_precioU))
                    .addComponent(jtf_precioU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_precioT)
                    .addComponent(jtf_precioT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_cancelar)
                    .addComponent(jb_agregar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_cancelarActionPerformed



    @Override
    public void update(Observable o, Object o1) {
     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jb_agregar;
    private javax.swing.JButton jb_cancelar;
    private javax.swing.JComboBox<String> jcb_bien;
    private javax.swing.JComboBox<String> jcb_marca;
    private javax.swing.JComboBox<String> jcb_modelo;
    private javax.swing.JLabel jl_cantidad;
    private javax.swing.JLabel jl_descripcion;
    private javax.swing.JLabel jl_marca;
    private javax.swing.JLabel jl_modelo;
    private javax.swing.JLabel jl_precioT;
    private javax.swing.JLabel jl_precioU;
    private javax.swing.JLabel jl_tipo;
    private javax.swing.JTextField jtf_cantidad;
    private javax.swing.JTextField jtf_descripcion;
    private javax.swing.JTextField jtf_precioT;
    private javax.swing.JTextField jtf_precioU;
    // End of variables declaration//GEN-END:variables
}
