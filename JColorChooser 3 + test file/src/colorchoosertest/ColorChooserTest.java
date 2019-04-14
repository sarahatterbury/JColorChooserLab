/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorchoosertest;

import java.awt.Color;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jarvis
 */
public class ColorChooserTest extends javax.swing.JFrame {
    Vector listeners = new Vector();
    Color importedColor;
    /**
     * Creates new form ColorChooserTest
     */
    public ColorChooserTest() {
        initComponents();
        listeners = new Vector();
        addColorListener(colorButton1);
        addColorListener(colorButton2);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        colorButton1 = new colorchoosertest.ColorButton();
        colorButton2 = new colorchoosertest.ColorButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        colorButton1.setText("Choose Text Color");
        colorButton1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        colorButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorButton1ActionPerformed(evt);
            }
        });

        colorButton2.setText("Change Text Color");
        colorButton2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        colorButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(colorButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(colorButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(colorButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(colorButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void colorButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorButton1ActionPerformed
            CC.setVisible(true);
            CC.setDefaultCloseOperation(CC.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_colorButton1ActionPerformed

    private void colorButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorButton2ActionPerformed
        this.importedColor = CC.BC.getColor();
        fireColorEvent(new ColorEvent(this, importedColor));        

    }//GEN-LAST:event_colorButton2ActionPerformed
public colorchooser.JColorChooser CC = new colorchooser.JColorChooser();
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ColorChooserTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ColorChooserTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ColorChooserTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ColorChooserTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ColorChooserTest().setVisible(true);
            }
        });
    }
    public void addColorListener(ColorListener colorListener){
        listeners.addElement(colorListener);
    }
    
    public void removeColorListener(ColorListener colorListener){
        listeners.removeElement(colorListener);
    }
    
    public void fireColorEvent(ColorEvent colorEvent){
        Vector v;
        
        synchronized(this){
            v = (Vector)listeners.clone();
        }
        
        int size = v.size();
        for(int i = 0; i < size; i++){
            ColorListener colorListener = (ColorListener)v.elementAt(i);
            colorListener.changeColor(colorEvent);
        }
    }
    public void setImportedColor(Color color){
        this.importedColor = color;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private colorchoosertest.ColorButton colorButton1;
    private colorchoosertest.ColorButton colorButton2;
    // End of variables declaration//GEN-END:variables
}
