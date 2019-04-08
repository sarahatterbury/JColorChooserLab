/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorchooser;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

//import javax.swing.
/**
 *
 * @author sarahatterbury
 */
public class ColorChooserPanel extends javax.swing.JPanel implements ChangeListener, KeyListener{
    Vector listeners = new Vector();
    
    /**
     * Creates new form ColorChooserPanel
     */
    public ColorChooserPanel() {
        initComponents();
        sldRed.addChangeListener(this);
        sldGreen.addChangeListener(this);
        sldBlue.addChangeListener(this);
        redDisplay.addKeyListener(this);
        greenDisplay.addKeyListener(this);
        blueDisplay.addKeyListener(this);
        listeners = new Vector();
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
        sldRed = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        sldGreen = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        sldBlue = new javax.swing.JSlider();
        redDisplay = new colorchooser.ColorDisplayLabel();
        greenDisplay = new colorchooser.ColorDisplayLabel();
        blueDisplay = new colorchooser.ColorDisplayLabel();

        jLabel1.setText("Red");

        sldRed.setMajorTickSpacing(50);
        sldRed.setMaximum(255);
        sldRed.setMinorTickSpacing(10);
        sldRed.setPaintLabels(true);
        sldRed.setPaintTicks(true);
        sldRed.setToolTipText("");
        sldRed.setValue(0);

        jLabel2.setText("Green");

        sldGreen.setMajorTickSpacing(50);
        sldGreen.setMaximum(255);
        sldGreen.setMinorTickSpacing(10);
        sldGreen.setPaintLabels(true);
        sldGreen.setPaintTicks(true);
        sldGreen.setToolTipText("");
        sldGreen.setValue(0);

        jLabel3.setText("Blue");

        sldBlue.setMajorTickSpacing(50);
        sldBlue.setMaximum(255);
        sldBlue.setMinorTickSpacing(10);
        sldBlue.setPaintLabels(true);
        sldBlue.setPaintTicks(true);
        sldBlue.setToolTipText("");
        sldBlue.setValue(0);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(redDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(blueDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(greenDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sldBlue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sldRed, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sldGreen, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE))
                        .addGap(14, 14, 14))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(redDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(greenDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(blueDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sldRed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sldGreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sldBlue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private colorchooser.ColorDisplayLabel blueDisplay;
    private colorchooser.ColorDisplayLabel greenDisplay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private colorchooser.ColorDisplayLabel redDisplay;
    private javax.swing.JSlider sldBlue;
    private javax.swing.JSlider sldGreen;
    private javax.swing.JSlider sldRed;
    // End of variables declaration//GEN-END:variables
    
    @Override
    public void stateChanged(ChangeEvent ce){
        JSlider slider = (JSlider)ce.getSource();
        
        if(slider.getValueIsAdjusting()){//if the slider is changing
            if(slider == sldRed){
                redDisplay.setText(Integer.toString(sldRed.getValue())); //if the red slider is moving, change the redDisplay text
            } else if(slider == sldGreen){
                greenDisplay.setText(Integer.toString(sldGreen.getValue()));
            } else if(slider == sldBlue){
                blueDisplay.setText(Integer.toString(sldBlue.getValue()));
            }
            
        }

        int r = sldRed.getValue();
        int g = sldGreen.getValue();
        int b = sldBlue.getValue();
        
        Color color = new Color(r, g, b);
        fireColorEvent(new ColorEvent(this, color));
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
        
        if(redDisplay.getText().matches("^$")||greenDisplay.getText().matches("^$")||blueDisplay.getText().matches("^$")){
            return;
        };

        int red = Integer.parseInt(redDisplay.getText());
        sldRed.setValue(red);
        int green = Integer.parseInt(greenDisplay.getText());
        sldGreen.setValue(green);
        int blue = Integer.parseInt(blueDisplay.getText());
        sldBlue.setValue(blue);
        
        int r = sldRed.getValue();
        int g = sldGreen.getValue();
        int b = sldBlue.getValue();
        
        Color color = new Color(r, g, b);
        fireColorEvent(new ColorEvent(this, color));
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

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }


}
