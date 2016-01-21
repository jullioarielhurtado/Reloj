/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reloj.framework.presentacion;
import reloj.framework.command.CommandReloj;
import reloj.framework.observer.Observable;
import reloj.framework.modelo.Reloj;

/**
 *
 * @author pmage
 */
public class RelojDigitalGrafico extends javax.swing.JFrame implements DespliegueReloj{
    private Reloj relojito;
    private CommandReloj arrancarCommand;
    private CommandReloj detenerCommand;
    /**
     * Creates new form RelojBasicoDisplay
     */
    public RelojDigitalGrafico(Reloj relojito) {
        initComponents();
        this.relojito = relojito;
        arrancarCommand = new reloj.app.cronometro.EncenderRelojCommand(relojito);
        detenerCommand = new reloj.app.cronometro.DetenerRelojCommand(relojito);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelHora = new javax.swing.JLabel();
        jButtonArrancar = new javax.swing.JButton();
        jButtonDetener = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelHora.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabelHora.setText("12:36:34");

        jButtonArrancar.setText("Arrancar");
        jButtonArrancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonArrancarActionPerformed(evt);
            }
        });

        jButtonDetener.setText("Detener");
        jButtonDetener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDetenerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonDetener)
                    .addComponent(jButtonArrancar)
                    .addComponent(jLabelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(255, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonArrancar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDetener)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonArrancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonArrancarActionPerformed
        // TODO add your handling code here:
        arrancarCommand.ejecutarOrden();
        
    }//GEN-LAST:event_jButtonArrancarActionPerformed

    private void jButtonDetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDetenerActionPerformed
        // TODO add your handling code here:
        detenerCommand.ejecutarOrden();
    }//GEN-LAST:event_jButtonDetenerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonArrancar;
    private javax.swing.JButton jButtonDetener;
    private javax.swing.JLabel jLabelHora;
    // End of variables declaration//GEN-END:variables

    @Override
    public void upDate(Observable o) {
        jLabelHora.setText(relojito.obtenerHora());
        jLabelHora.paintImmediately(jLabelHora.getVisibleRect());
    }
}
