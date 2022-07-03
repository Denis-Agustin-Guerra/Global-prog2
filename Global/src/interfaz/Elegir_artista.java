
package interfaz;
import java.util.ArrayList;
import mvc.Artista;
import mvc.Instrumento;
import mvc.SerCantor;
public class Elegir_artista extends javax.swing.JFrame {
    public Elegir_artista() {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        _FIELD_TIPO = new javax.swing.JTextField();
        _FIELD_INSTRUMENTO_NOMBRE = new javax.swing.JTextField();
        _FIELD_INSTRUMENTO_TIPO = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        _LISTA_DE_ARTISTAS = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        Cargar_info = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        _FIELD_ALEGRE = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        _FIELD_MOMENTO = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        _FIELD_EDAD = new javax.swing.JTextField();
        _FIELD_FECHA_NAC1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setText("INSTRUMENTO");

        jLabel4.setText("NOMBRE:");

        jLabel5.setText("TIPO:");

        _FIELD_TIPO.setEditable(false);
        _FIELD_TIPO.setText("Artista");
        _FIELD_TIPO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _FIELD_TIPOActionPerformed(evt);
            }
        });

        _FIELD_INSTRUMENTO_NOMBRE.setEditable(false);
        _FIELD_INSTRUMENTO_NOMBRE.setText("Guitarra");
        _FIELD_INSTRUMENTO_NOMBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _FIELD_INSTRUMENTO_NOMBREActionPerformed(evt);
            }
        });

        _FIELD_INSTRUMENTO_TIPO.setEditable(false);
        _FIELD_INSTRUMENTO_TIPO.setText("Cuerda");
        _FIELD_INSTRUMENTO_TIPO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _FIELD_INSTRUMENTO_TIPOActionPerformed(evt);
            }
        });

        jLabel1.setText("TIPO:");

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

        jButton1.setText("CANTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Cargar_info.setText("Buscar");
        Cargar_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cargar_infoActionPerformed(evt);
            }
        });

        jLabel7.setText("ES ALEGRE:");

        _FIELD_ALEGRE.setEditable(false);
        _FIELD_ALEGRE.setText("SI");
        _FIELD_ALEGRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _FIELD_ALEGREActionPerformed(evt);
            }
        });

        jLabel8.setText("MOMENTO:");

        _FIELD_MOMENTO.setEditable(false);
        _FIELD_MOMENTO.setText("Tarde");
        _FIELD_MOMENTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _FIELD_MOMENTOActionPerformed(evt);
            }
        });

        jLabel9.setText("FECHA NACIMIENTO:");

        _FIELD_EDAD.setEditable(false);
        _FIELD_EDAD.setText("22");
        _FIELD_EDAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _FIELD_EDADActionPerformed(evt);
            }
        });

        _FIELD_FECHA_NAC1.setEditable(false);
        _FIELD_FECHA_NAC1.setText("02/01/2000");
        _FIELD_FECHA_NAC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _FIELD_FECHA_NAC1ActionPerformed(evt);
            }
        });

        jLabel10.setText("EDAD:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addGap(50, 50, 50))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(_FIELD_INSTRUMENTO_NOMBRE)
                                    .addComponent(_FIELD_INSTRUMENTO_TIPO)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(18, 18, 18)
                                            .addComponent(_FIELD_TIPO))
                                        .addComponent(_LISTA_DE_ARTISTAS, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(_FIELD_FECHA_NAC1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(_FIELD_ALEGRE, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                                .addComponent(_FIELD_MOMENTO)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(89, 89, 89)
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(32, 32, 32)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(83, 83, 83)
                                        .addComponent(_FIELD_EDAD, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(27, 27, 27)))
                .addComponent(Cargar_info)
                .addGap(68, 68, 68))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_LISTA_DE_ARTISTAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cargar_info))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(_FIELD_TIPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(_FIELD_INSTRUMENTO_NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(_FIELD_INSTRUMENTO_TIPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(_FIELD_FECHA_NAC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_FIELD_EDAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(_FIELD_ALEGRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(_FIELD_MOMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jLabel6.setText("ELEGIR ARTISTA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void _LISTA_DE_ARTISTASItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event__LISTA_DE_ARTISTASItemStateChanged

        Menu host = new Menu();
        Artista ar = (Artista)_LISTA_DE_ARTISTAS.getSelectedItem();    
        _FIELD_TIPO.setText(ar.tipo);                                           //FUNCIONES PARA QUE SE MUESTREN LOS DATOS
        _FIELD_INSTRUMENTO_NOMBRE.setText(ar.usa.get(0).nombre);
        _FIELD_INSTRUMENTO_TIPO.setText(ar.usa.get(0).tipo); 
    }//GEN-LAST:event__LISTA_DE_ARTISTASItemStateChanged

    private void _LISTA_DE_ARTISTASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__LISTA_DE_ARTISTASActionPerformed

    }//GEN-LAST:event__LISTA_DE_ARTISTASActionPerformed

    private void _FIELD_INSTRUMENTO_TIPOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__FIELD_INSTRUMENTO_TIPOActionPerformed

    }//GEN-LAST:event__FIELD_INSTRUMENTO_TIPOActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //llamar al metodo cantar
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Cargar_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cargar_infoActionPerformed

        for (int i = 0; i < Menu.cantores.size(); i++) {
            _LISTA_DE_ARTISTAS.addItem(Menu.cantores.get(i));
        }
    }//GEN-LAST:event_Cargar_infoActionPerformed

    private void _FIELD_TIPOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__FIELD_TIPOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__FIELD_TIPOActionPerformed

    private void _FIELD_INSTRUMENTO_NOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__FIELD_INSTRUMENTO_NOMBREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__FIELD_INSTRUMENTO_NOMBREActionPerformed

    private void _FIELD_ALEGREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__FIELD_ALEGREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__FIELD_ALEGREActionPerformed

    private void _FIELD_MOMENTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__FIELD_MOMENTOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__FIELD_MOMENTOActionPerformed

    private void _FIELD_EDADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__FIELD_EDADActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__FIELD_EDADActionPerformed

    private void _FIELD_FECHA_NAC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__FIELD_FECHA_NAC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__FIELD_FECHA_NAC1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cargar_info;
    private javax.swing.JTextField _FIELD_ALEGRE;
    private javax.swing.JTextField _FIELD_EDAD;
    private javax.swing.JTextField _FIELD_FECHA_NAC1;
    private javax.swing.JTextField _FIELD_INSTRUMENTO_NOMBRE;
    private javax.swing.JTextField _FIELD_INSTRUMENTO_TIPO;
    private javax.swing.JTextField _FIELD_MOMENTO;
    private javax.swing.JTextField _FIELD_TIPO;
    public static javax.swing.JComboBox _LISTA_DE_ARTISTAS;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
