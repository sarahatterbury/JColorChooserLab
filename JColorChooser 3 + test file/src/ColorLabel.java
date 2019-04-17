/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorchooser;
import javax.swing.JLabel;
/**
 *
 * @author sarahatterbury
 */
public class ColorLabel extends JLabel implements ColorListener{

    @Override
    public void changeColor(ColorEvent ce) {
        String hex = String.format("#%02X%02X%02X", ce.getColor().getRed(), ce.getColor().getGreen(), ce.getColor().getBlue()); 
        
        setText("Hex: " +  hex);
    }
    
    public ColorLabel(){
        super();
        setText("Hex: #000000");
    }
}
