/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorchoosertest;
import javax.swing.JButton;
import java.awt.Color;

/**
 *
 * @author sarahatterbury
 */
public class ColorButton extends JButton implements ColorListener{
    @Override
    public void changeColor(ColorEvent ce) {
        setForeground(ce.getColor());
    }
    public ColorButton(){
        super();
        setForeground(java.awt.Color.BLACK);
    }

}