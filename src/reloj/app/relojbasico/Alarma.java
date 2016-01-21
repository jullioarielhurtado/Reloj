/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reloj.app.relojbasico;

import reloj.framework.observer.Observable;
import reloj.framework.observer.Observer;
import reloj.framework.modelo.Reloj;

/**
 *
 * @author pmage
 */
public class Alarma extends javax.swing.JFrame implements Observer{
    String hora;
    Reloj relojito;
    String mensaje;

    /**
     * Creates new form Alarma
     * @param hora
     */
    public Alarma(String hora, Reloj reloj, String mensaje) {
        this.hora = hora;
        this.relojito=reloj;
        this.mensaje = mensaje;
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri Light", 0, 36)); // NOI18N
        jLabel1.setText("¡DESPIERTA!");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void upDate(Observable o) {
       if(relojito.obtenerHora().equals(hora)) 
             this.setVisible(true);
             jLabel1.setText(mensaje);
             jLabel1.paintImmediately(jLabel1.getVisibleRect());;
    }
}
