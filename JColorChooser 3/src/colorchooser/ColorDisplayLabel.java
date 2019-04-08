/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorchooser;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author sarahatterbury
 */
public class ColorDisplayLabel extends JTextField implements KeyListener{

    
    public ColorDisplayLabel(){
        super();
        setText("0");
        addKeyListener(this);
        
    }
    

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
        String text = getText();
        if(text.matches("^$")){
            return;
        }
        
        if(!text.matches("\\b(1?[0-9]{1,2}|2[0-4][0-9]|25[0-5])\\b")){
            JOptionPane.showMessageDialog(this, "Sorry! Your value must be between 0 and 255 to produce a valid color.");
            setText("0");
        }

    }

}
