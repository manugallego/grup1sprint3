/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteques;

import java.awt.Color;                         //Import per als colors
import java.awt.Component;
import java.io.BufferedReader;                  //Import per llegir els buffers
import java.io.BufferedWriter;
import java.io.File;                            //Import per a les files
import java.io.FileNotFoundException;           //Import per si no troba el fitxer
import java.io.FileReader;                      //Import per a llegir sobre files
import java.io.FileWriter;
import java.io.IOException;                     //Import per les excepcions
import java.util.regex.Matcher;                 //Import del matcher
import java.util.regex.Pattern;                 //Import del pattern
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;                 //Import per al panel de opcions

/**
 * @author Marcos Zaballos, Manu Gallego, Evaldas Casas, Ferran Climent.
 */
public class Config {

    public static File arxiuConfig = new File("config/gui.conf"); //Declarem el fitxer per llegir la configuracio

    public static Color llegirColorFons() throws FileNotFoundException, IOException { //Metode per llegir el color amb execpcions per si no troba el fitxer
        String colorCadena = "";        //Variable per guardar la cadena del color
        Color color = null;             //Una variable de tipus color amb null

        if (arxiuConfig.exists()) {  //Si colorfons existeix
            String linea = "";      //Crea una variable line buida

            try {

                FileReader llegirArxiu = new FileReader(arxiuConfig);   //Declarem FileReader per llegir el arxiu
                BufferedReader buffer = new BufferedReader(llegirArxiu);    //Declarem un BuferedReader per llegir el fitxer

                while ((linea = buffer.readLine()) != null) {  //While on guarde iguale la linea amb el que llegeix el fitxer
                    colorCadena += linea;       //Igualem la string a la linea llegida
                }

                color = parseColor(colorCadena);        //Igualem el color a la cadena
                return color;
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex);  //Exepcio si no troba el arxiu
                Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
                
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex);    //Exepcio si es produeix un error
                Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
            }
        }
        return null;
    }

    public static Color parseColor(String color) { //Metode per interpretar el arxiu
        Pattern c = Pattern.compile("rgb *\\(*([0-9]+), *([0-9]+), *([0-9]+) *\\)");   //LLegir el color amb rgb
        Matcher m = c.matcher(color);   //Igualar el matcher al pattern amb el color

        if (m.matches()) {  //Interpretar el color rgb
            return new Color(
                    Integer.valueOf(m.group(1)),//R
                    Integer.valueOf(m.group(2)),//G
                    Integer.valueOf(m.group(3))//B
            );
        }
        return null;
    }
    
    public static void colorFons(Component componente) {
        JColorChooser nouColor = new JColorChooser();
        nouColor.setVisible(true);
        Color nou = nouColor.showDialog(null, "Tria el color de fons", componente.getBackground());
        if (nou != null) {
            componente.setBackground(nou);
            String color = "rgb(" + nou.getRed() + "," + nou.getGreen() + "," + nou.getBlue() + ")";
            guardarColorFons(color);
        }
    }
    
    private static void guardarColorFons(String color) {
        if (arxiuConfig.exists()) {
            arxiuConfig.delete();
        }

        try {
            BufferedWriter wr = new BufferedWriter(new FileWriter(arxiuConfig));
            FileWriter escriureArxiu = new FileWriter(arxiuConfig, true);
            BufferedWriter buffer = new BufferedWriter(escriureArxiu);
            buffer.write(color);
            buffer.newLine();
            buffer.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
    }
    
}
