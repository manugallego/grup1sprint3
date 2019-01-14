/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteques;

import com.sun.istack.internal.logging.Logger;
import java.awt.Color;
import java.awt.Component;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class SaveColor {
    /**
     * Metode per actualitzar el color de fons del programa i guardar-ho en un arxiu
     * @param 
     */
    public static File colorFons = new File("fitxer/colorFons.txt"); 
    public static File lletraPrograma = new File("fitxer/lletraPrograma.txt"); 

    public static void colorFons(Component componente){
        JColorChooser nouColor = new JColorChooser();
        nouColor.setVisible(true);
        Color nou = nouColor.showDialog(null, "Tria el color de fons", componente.getBackground());
        if(nou != null){
            componente.setBackground(nou);
            String color = "rgb("+nou.getRed()+","+nou.getGreen()+","+nou.getBlue()+")";
            guardarColorFons(color);
        }
    }    
    
    private static void guardarColorFons(String color){
        if(colorFons.exists()){
            colorFons.delete();
        }
     
        try {
        BufferedWriter wr = new BufferedWriter(new FileWriter(colorFons));
        FileWriter escriureArxiu = new FileWriter(colorFons, true);
        BufferedWriter buffer = new BufferedWriter(escriureArxiu);
        buffer.write(color);
        buffer.newLine();
        buffer.close();
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Error: " + ex);
    }
    }
}
