/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatureapp;

/**
 *
 * @author davidromero
 */
public class Colors {

    int globalColors[] = {252, 202, 62};

    public Colors() { 
        int defaultColors[] = {252, 202, 62};
        this.setColors(defaultColors);
    }
    
    public void setColors(int newColors[]){
        globalColors[0] = newColors[0];
        globalColors[1] = newColors[1];
        globalColors[2] = newColors[2];
    }
    
    public int[] getColors(){
        return globalColors;
    } 
    
}
