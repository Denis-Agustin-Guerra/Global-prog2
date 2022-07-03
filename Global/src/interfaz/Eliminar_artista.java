
package interfaz;

import mvc.SerCantor;
import static interfaz.Elegir_artista._LISTA_DE_ARTISTAS;
import javax.swing.JOptionPane;
public class Eliminar_artista extends javax.swing.JFrame {
    public Eliminar_artista() {
        initComponents();
                setLocationRelativeTo(null);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        _ELIMINAR_ = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_cargar = new javax.swing.JToggleButton();
        _LISTA_DE_ARTISTAS = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        _ELIMINAR_.setText("Eliminarlo");
        _ELIMINAR_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _ELIMINAR_ActionPerformed(evt);
            }
        });

        jLabel1.setText("ELIMINAR ARTISTA");

        btn_cargar.setText("Cargar");
        btn_cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(_ELIMINAR_, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(151, 151, 151))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_cargar)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_cargar)
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                .addComponent(_ELIMINAR_)
                .addGap(103, 103, 103))
        );

        _LISTA_DE_ARTISTAS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(_LISTA_DE_ARTISTAS, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(_LISTA_DE_ARTISTAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(281, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void _LISTA_DE_ARTISTASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__LISTA_DE_ARTISTASActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__LISTA_DE_ARTISTASActionPerformed

    private void _LISTA_DE_ARTISTASItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event__LISTA_DE_ARTISTASItemStateChanged
        // TODO add your handling code here:
        String value = (String) _LISTA_DE_ARTISTAS.getSelectedItem();
    }//GEN-LAST:event__LISTA_DE_ARTISTASItemStateChanged

    private void _ELIMINAR_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__ELIMINAR_ActionPerformed
        // TODO add your handling code here:
        _LISTA_DE_ARTISTAS.addItem(Menu.cantores.get(Menu.cantores.size() - 1).nombre);
        int n = JOptionPane.showConfirmDialog(
                null,
                "Seguro que quieres borrar el artista",
                "",
                JOptionPane.YES_NO_OPTION);
        if (n == JOptionPane.YES_OPTION) {
            String value = (String) _LISTA_DE_ARTISTAS.getSelectedItem();
            Menu host = new Menu();
            for (int j = 0; j < Menu.cantores.size(); j++) {                                //FUNCIONES PARA ELIMINAR DATOS
                if (value.equals(Menu.cantores.get(host.POSICION_LISTA(value)).nombre)) {
                    Menu.cantores.remove(host.POSICION_LISTA(value));
                    _LISTA_DE_ARTISTAS.removeItem(value);
                }
            }
            JOptionPane.showMessageDialog(null, "Artista borrado");
        } else {
            JOptionPane.showMessageDialog(null, "El Artista no fue borrado");
        }
    }//GEN-LAST:event__ELIMINAR_ActionPerformed

    private void btn_cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cargarActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < Menu.cantores.size(); i++) {
            _LISTA_DE_ARTISTAS.addItem(Menu.cantores.get(i).nombre);
        }
    }//GEN-LAST:event_btn_cargarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton _ELIMINAR_;
    private javax.swing.JComboBox<String> _LISTA_DE_ARTISTAS;
    private javax.swing.JToggleButton btn_cargar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
