/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorchooser;

import java.awt.Color;

/**
 *
 * @author Jarvis
 */
public class BackgroundColor {
    private Color backgroundColor;
    
    public BackgroundColor(Color color){
        this.backgroundColor = color;
    }
    
    public Color getColor(){
        return this.backgroundColor;
    }
    public void setColor(Color color){
        this.backgroundColor = color;
    }

}
