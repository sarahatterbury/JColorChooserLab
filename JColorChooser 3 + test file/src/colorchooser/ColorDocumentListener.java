/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorchooser;

import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
/**
 *
 * @author sarahatterbury
 */
public class ColorDocumentListener implements DocumentListener{
    private final ColorDisplayLabel cdl;
    private final JSlider slider;
    
    public ColorDocumentListener(ColorDisplayLabel cdl, JSlider slider){
        this.cdl = cdl;
        this.slider = slider;
    }

    @Override
    public void insertUpdate(DocumentEvent e) {//when text is inserted
        update(e);
    }

    @Override
    public void removeUpdate(DocumentEvent e) {//when text is removed
        update(e);
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //only for styled docs, not plaindoc
    }
    
    private void update(DocumentEvent e){
        int value = Integer.parseInt(cdl.getText());
        if(cdl.getText().equals("")){
            slider.setValue(0);
        } 
        
        if(value < 0 || value > 255){
            JOptionPane.showMessageDialog(null, "Sorry! Your value is out of range");
            //cdl.setText("");
        } else{
            slider.setValue(value);
        }
    }
}
