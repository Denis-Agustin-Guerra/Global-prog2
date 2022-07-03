
package interfaz;

import java.util.ArrayList;
import mvc.SerCantor;
import javax.swing.JOptionPane;
import mvc.Artista;
import mvc.Instrumento;

public class Modificar_artista extends javax.swing.JFrame {

    public Modificar_artista() {
        initComponents();
                setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        modificacion_NOMBRE_INSTRUMENTO = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        modificacion_TIPO_INSTRUMENTO = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        modificacion_LISTA_INSTRUMENTOS = new javax.swing.JComboBox<>();
        btn_modificacion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        modificacion_TIPO = new javax.swing.JTextField();
        _LISTA_DE_ARTISTAS = new javax.swing.JComboBox();
        btn_cargar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel28.setText("NOMBRE:");

        modificacion_NOMBRE_INSTRUMENTO.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        modificacion_NOMBRE_INSTRUMENTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificacion_NOMBRE_INSTRUMENTOActionPerformed(evt);
            }
        });

        jLabel29.setText("TIPO:        ");

        modificacion_TIPO_INSTRUMENTO.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        modificacion_TIPO_INSTRUMENTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificacion_TIPO_INSTRUMENTOActionPerformed(evt);
            }
        });

        jLabel26.setText("NOMBRE:");

        jLabel31.setText("TOCA ALGUN INSTRUMENTO");

        jLabel27.setText("TIPO:        ");

        modificacion_LISTA_INSTRUMENTOS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));
        modificacion_LISTA_INSTRUMENTOS.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                modificacion_LISTA_INSTRUMENTOSItemStateChanged(evt);
            }
        });
        modificacion_LISTA_INSTRUMENTOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificacion_LISTA_INSTRUMENTOSActionPerformed(evt);
            }
        });

        btn_modificacion.setText("Modificar");
        btn_modificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificacionActionPerformed(evt);
            }
        });

        jLabel1.setText("MODIFICAR ARTISTA");

        modificacion_TIPO.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        modificacion_TIPO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificacion_TIPOActionPerformed(evt);
            }
        });

        _LISTA_DE_ARTISTAS.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        _LISTA_DE_ARTISTAS.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                _LISTA_DE_ARTISTASItemStateChanged(evt);
            }
        });
        _LISTA_DE_ARTISTAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _LISTA_DE_ARTISTASActionPerformed(evt);
            }
        });

        btn_cargar.setText("Cargar");
        btn_cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel26)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(_LISTA_DE_ARTISTAS, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel27)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(modificacion_TIPO, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel31)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(modificacion_LISTA_INSTRUMENTOS, 0, 1, Short.MAX_VALUE)))
                            .addComponent(btn_modificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modificacion_NOMBRE_INSTRUMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modificacion_TIPO_INSTRUMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(btn_cargar)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(btn_cargar)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(_LISTA_DE_ARTISTAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(modificacion_TIPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(modificacion_LISTA_INSTRUMENTOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(modificacion_NOMBRE_INSTRUMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(modificacion_TIPO_INSTRUMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(btn_modificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modificacion_NOMBRE_INSTRUMENTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificacion_NOMBRE_INSTRUMENTOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificacion_NOMBRE_INSTRUMENTOActionPerformed

    private void modificacion_TIPO_INSTRUMENTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificacion_TIPO_INSTRUMENTOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificacion_TIPO_INSTRUMENTOActionPerformed

    private void modificacion_LISTA_INSTRUMENTOSItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_modificacion_LISTA_INSTRUMENTOSItemStateChanged
        // TODO add your handling code here:

        String value = (String) modificacion_LISTA_INSTRUMENTOS.getSelectedItem();

        if (value.equals("NO")) {  //User have not entered anything.
            modificacion_NOMBRE_INSTRUMENTO.setEditable(false);
            modificacion_TIPO_INSTRUMENTO.setEditable(false);
        } else if (value.equals("SI")) {
            modificacion_NOMBRE_INSTRUMENTO.setEditable(true);
            modificacion_TIPO_INSTRUMENTO.setEditable(true);
        }
    }//GEN-LAST:event_modificacion_LISTA_INSTRUMENTOSItemStateChanged

    private void modificacion_LISTA_INSTRUMENTOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificacion_LISTA_INSTRUMENTOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificacion_LISTA_INSTRUMENTOSActionPerformed

    private void btn_modificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificacionActionPerformed
        // TODO add your handling code here:
       
        
        Menu host = new Menu();
        
        Artista ar1 =(Artista) _LISTA_DE_ARTISTAS.getSelectedItem();
        ar1.tipo = modificacion_TIPO.getText();
        ar1.usa.get(0).nombre = modificacion_NOMBRE_INSTRUMENTO.getText();
        ar1.usa.get(0).tipo = modificacion_TIPO_INSTRUMENTO.getText();
        
    }//GEN-LAST:event_btn_modificacionActionPerformed

    private void modificacion_TIPOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificacion_TIPOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificacion_TIPOActionPerformed

    private void _LISTA_DE_ARTISTASItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event__LISTA_DE_ARTISTASItemStateChanged
        // TODO add your handling code here:
      
    }//GEN-LAST:event__LISTA_DE_ARTISTASItemStateChanged

    private void _LISTA_DE_ARTISTASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__LISTA_DE_ARTISTASActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__LISTA_DE_ARTISTASActionPerformed

    private void btn_cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cargarActionPerformed
        // TODO add your handling code here:

        for (int i = 0; i < Menu.cantores.size(); i++) {
            _LISTA_DE_ARTISTAS.addItem(Menu.cantores.get(i));
        }
    }//GEN-LAST:event_btn_cargarActionPerformed

 


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox _LISTA_DE_ARTISTAS;
    private javax.swing.JToggleButton btn_cargar;
    private javax.swing.JButton btn_modificacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> modificacion_LISTA_INSTRUMENTOS;
    private javax.swing.JTextField modificacion_NOMBRE_INSTRUMENTO;
    private javax.swing.JTextField modificacion_TIPO;
    private javax.swing.JTextField modificacion_TIPO_INSTRUMENTO;
    // End of variables declaration//GEN-END:variables
}
