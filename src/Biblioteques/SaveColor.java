/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteques;

import com.sun.istack.internal.logging.Logger; //Import per al Logger
import java.awt.Color;                         //Import per als colors
import java.awt.Component;                     //Import per als components del JFrame
import java.io.BufferedWriter;                 //Import per a escriure un file
import java.io.File;                           //Import per a les files
import java.io.FileWriter;                     //Import per a escriure sobre files
import java.io.IOException;                    //Import per les excepcions
import java.util.logging.Level;                //Import per al level
import javax.swing.JColorChooser;              //Import per al complement dels colors
import javax.swing.JOptionPane;                //Import per al panel de opcions


/**
 * @author Marcos Zaballos, Manu Gallego, Evaldas Casas, Ferran Climent.
 */
public class SaveColor {
    /**
     * Metode per actualitzar el color de fons del programa i guardar-ho en un arxiu
     * @param 
     */
    public static File colorFons = new File("fitxer/colorFons.txt");  //Un public static file per el arxiu del color de fons i la lletra
    public static File lletraPrograma = new File("fitxer/lletraPrograma.txt"); 

    public static void colorFons(Component componente){ //Declarem el metode per triar el color de fons
        JColorChooser nouColor = new JColorChooser();  //Declarem el JColorChooser seguidament el posem visible
        nouColor.setVisible(true);                      
        Color nou = nouColor.showDialog(null, "Tria el color de fons", componente.getBackground()); //Ens mostra el component per seleccionar el boto
        if(nou != null){                    //Guarda el color a null i el asigna al fons
            componente.setBackground(nou);          
            String color = "rgb("+nou.getRed()+","+nou.getGreen()+","+nou.getBlue()+")"; //Guarda el color rgb a "color" i inicia el metode per a guardar-ho al fitxer
            guardarColorFons(color);
        }
    }    
    
    private static void guardarColorFons(String color){     //Metode per guardar el color al arxiu, li passem de variable el color RGB
        if(colorFons.exists()){                             //Si existeix un color de fons, el borra
            colorFons.delete();
        }
     
        try {                                               //Despres de borrar el color antic
        BufferedWriter wr = new BufferedWriter(new FileWriter(colorFons));  //Creem un nou bufferedwriter amb el colorfons de parametre
        FileWriter escriureArxiu = new FileWriter(colorFons, true); //Un nou FileWriter per poder escriure el arxiu
        BufferedWriter buffer = new BufferedWriter(escriureArxiu);      //Amb el bufferedwritter amb el que ens servira per escriure i li pasem el filewriter
        buffer.write(color); //Escrivim el color
        buffer.newLine();  //A una nova line
        buffer.close();        //Tanquem el bufferedwriter
    } catch (IOException ex) {                              //Per si existeix un error, que ens mostre amb una exepcio
        JOptionPane.showMessageDialog(null, "Error: " + ex);
    }
    }
}
