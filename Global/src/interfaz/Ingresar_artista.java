package interfaz;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import mvc.Instrumento;
import mvc.Artista;
import mvc.Canario;
import mvc.Gallo;
import mvc.SerCantor;
import javax.swing.JOptionPane;
class Ingresar_artista extends javax.swing.JFrame {
    public Ingresar_artista() {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel8 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        btn_ingresar = new javax.swing.JButton();
        ingreso_TIPO = new javax.swing.JTextField();
        ingreso_NOMBRE = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        ingreso_NOMBRE_INSTRUMENTO = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        ingreso_TIPO_INSTRUMENTO = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        ingreso_LISTA_INSTRUMENTOS = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        _LISTA_TIPO = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        Alegria_si = new javax.swing.JRadioButton();
        Alegria_no = new javax.swing.JRadioButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        ingreso_FECHA = new com.toedter.calendar.JCalendar();
        hora = new javax.swing.JComboBox<>();
        minutos = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel26.setText("NOMBRE:");

        jLabel27.setText("TIPO:        ");

        btn_ingresar.setText("Agregar");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        ingreso_TIPO.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ingreso_TIPO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingreso_TIPOActionPerformed(evt);
            }
        });

        ingreso_NOMBRE.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ingreso_NOMBRE.setToolTipText("");
        ingreso_NOMBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingreso_NOMBREActionPerformed(evt);
            }
        });

        jLabel28.setText("NOMBRE:");

        ingreso_NOMBRE_INSTRUMENTO.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ingreso_NOMBRE_INSTRUMENTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingreso_NOMBRE_INSTRUMENTOActionPerformed(evt);
            }
        });

        jLabel29.setText("TIPO:        ");

        ingreso_TIPO_INSTRUMENTO.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ingreso_TIPO_INSTRUMENTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingreso_TIPO_INSTRUMENTOActionPerformed(evt);
            }
        });

        jLabel31.setText("TOCA ALGUN INSTRUMENTO");

        ingreso_LISTA_INSTRUMENTOS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));
        ingreso_LISTA_INSTRUMENTOS.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ingreso_LISTA_INSTRUMENTOSItemStateChanged(evt);
            }
        });
        ingreso_LISTA_INSTRUMENTOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingreso_LISTA_INSTRUMENTOSActionPerformed(evt);
            }
        });

        jLabel1.setText("INGRESAR CANTOR");

        _LISTA_TIPO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ARTISTA", "GALLO", "CANARIO" }));
        _LISTA_TIPO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _LISTA_TIPOActionPerformed(evt);
            }
        });

        jLabel32.setText("ALEGRIA");

        buttonGroup1.add(Alegria_si);
        Alegria_si.setText("SI");
        Alegria_si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alegria_siActionPerformed(evt);
            }
        });

        buttonGroup1.add(Alegria_no);
        Alegria_no.setText("NO");

        jLabel33.setText("HORA");

        jLabel30.setText("FECHA NACIMIENTO:");

        hora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaActionPerformed(evt);
            }
        });

        minutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        jLabel34.setText("MOMENTO");

        jLabel35.setText("MIN");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(jLabel34))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(jLabel1)))
                .addGap(0, 300, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Alegria_si)
                        .addGap(18, 18, 18)
                        .addComponent(Alegria_no)
                        .addContainerGap(350, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(_LISTA_TIPO, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ingreso_FECHA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addComponent(jLabel31)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ingreso_LISTA_INSTRUMENTOS, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(42, 42, 42))
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                            .addComponent(jLabel27)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(ingreso_TIPO, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                            .addComponent(jLabel26)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(ingreso_NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                            .addComponent(jLabel28)
                                            .addGap(18, 18, 18)
                                            .addComponent(ingreso_NOMBRE_INSTRUMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                            .addComponent(jLabel29)
                                            .addGap(18, 18, 18)
                                            .addComponent(ingreso_TIPO_INSTRUMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addComponent(jLabel33)
                                    .addGap(18, 18, 18)
                                    .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(40, 40, 40)
                                    .addComponent(jLabel35)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(minutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(214, Short.MAX_VALUE))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(_LISTA_TIPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(ingreso_NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(ingreso_TIPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ingreso_FECHA, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel28))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(ingreso_LISTA_INSTRUMENTOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ingreso_NOMBRE_INSTRUMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(ingreso_TIPO_INSTRUMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(Alegria_si)
                    .addComponent(Alegria_no))
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel34)
                .addGap(9, 9, 9)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addGap(49, 49, 49)
                .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        // TODO add your handling code here:
        SerCantor cantante = null;
        if (ingreso_NOMBRE.getText().equals("") || ingreso_TIPO.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Porfavor ingrese el valor faltante.");
            ingreso_NOMBRE.requestFocusInWindow();
        } else if (_LISTA_TIPO.getSelectedItem().equals("ARTISTA")) {
            ArrayList<Instrumento> instrum= new ArrayList();
            var instrumento = new Instrumento();
            instrumento.nombre = ingreso_NOMBRE_INSTRUMENTO.getText();
            instrumento.tipo = ingreso_TIPO_INSTRUMENTO.getText();
            instrum.add(instrumento);
            cantante = new Artista(instrum);                                            //FUNCIONES PARA INGRESAR DATOS
        } else if (_LISTA_TIPO.getSelectedItem().equals("GALLO")) {
            cantante = new Gallo();
        } else if (_LISTA_TIPO.getSelectedItem().equals("CANARIO")) {
            cantante = new Canario();
        }
        cantante.nombre = ingreso_NOMBRE.getText();
        cantante.tipo = ingreso_TIPO.getText();
        Date fecha=ingreso_FECHA.getDate();
        cantante.fecha_de_nacimiento = toCalendar(fecha);
        ingreso_NOMBRE.setText("");
        ingreso_TIPO.setText("");
        ingreso_NOMBRE_INSTRUMENTO.setText("");
        ingreso_TIPO_INSTRUMENTO.setText("");
        Menu.cantores.add(cantante);
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void horaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horaActionPerformed

    private void Alegria_siActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Alegria_siActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Alegria_siActionPerformed

    private void ingreso_TIPO_INSTRUMENTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingreso_TIPO_INSTRUMENTOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingreso_TIPO_INSTRUMENTOActionPerformed

    private void ingreso_NOMBRE_INSTRUMENTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingreso_NOMBRE_INSTRUMENTOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingreso_NOMBRE_INSTRUMENTOActionPerformed

    private void ingreso_LISTA_INSTRUMENTOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingreso_LISTA_INSTRUMENTOSActionPerformed
        // TODO add your handling code here:
        if (ingreso_LISTA_INSTRUMENTOS.getSelectedItem().equals("NO")) {  //User have not entered anything.
            ingreso_NOMBRE_INSTRUMENTO.setEnabled(false);
            ingreso_TIPO_INSTRUMENTO.setEnabled(false);
        } else if (ingreso_LISTA_INSTRUMENTOS.getSelectedItem().equals("SI")) {
            ingreso_NOMBRE_INSTRUMENTO.setEnabled(true);
            ingreso_TIPO_INSTRUMENTO.setEnabled(true);
        }

    }//GEN-LAST:event_ingreso_LISTA_INSTRUMENTOSActionPerformed

    private void ingreso_LISTA_INSTRUMENTOSItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ingreso_LISTA_INSTRUMENTOSItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ingreso_LISTA_INSTRUMENTOSItemStateChanged

    private void ingreso_TIPOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingreso_TIPOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingreso_TIPOActionPerformed

    private void ingreso_NOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingreso_NOMBREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingreso_NOMBREActionPerformed

    private void _LISTA_TIPOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__LISTA_TIPOActionPerformed
        // TODO add your handling code here:

        //capturando datos
        String nombre= ingreso_NOMBRE.getText();
        String tipo = ingreso_TIPO.getText();

        if(_LISTA_TIPO.getSelectedItem().equals("ARTISTA")) {
            ingreso_NOMBRE_INSTRUMENTO.setEnabled(true);
            ingreso_TIPO_INSTRUMENTO.setEnabled(true);
        } else {
            ingreso_NOMBRE_INSTRUMENTO.setEnabled(false);
            ingreso_TIPO_INSTRUMENTO.setEnabled(false);
        }

    }//GEN-LAST:event__LISTA_TIPOActionPerformed
    public static Calendar toCalendar(Date date){ 
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal;
    }    
    private void ingreso_FECHAActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
    }
        private void minutosActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Alegria_no;
    private javax.swing.JRadioButton Alegria_si;
    private javax.swing.JComboBox<String> _LISTA_TIPO;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> hora;
    private com.toedter.calendar.JCalendar ingreso_FECHA;
    private javax.swing.JComboBox<String> ingreso_LISTA_INSTRUMENTOS;
    private javax.swing.JTextField ingreso_NOMBRE;
    private javax.swing.JTextField ingreso_NOMBRE_INSTRUMENTO;
    private javax.swing.JTextField ingreso_TIPO;
    private javax.swing.JTextField ingreso_TIPO_INSTRUMENTO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> minutos;
    // End of variables declaration//GEN-END:variables
}
