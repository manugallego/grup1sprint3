/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteques;

import Public.Public;
import java.awt.Color;                         //Import per als colors
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.io.BufferedReader;                  //Import per llegir els buffers
import java.io.BufferedWriter;
import java.io.File;                            //Import per a les files
import java.io.FileNotFoundException;           //Import per si no troba el fitxer
import java.io.FileReader;                      //Import per a llegir sobre files
import java.io.FileWriter;
import java.io.IOException;                     //Import per les excepcions
import java.io.PrintStream;
import java.util.regex.Matcher;                 //Import del matcher
import java.util.regex.Pattern;                 //Import del pattern
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;                 //Import per al panel de opcions

/**
 * @author Marcos Zaballos, Manu Gallego, Evaldas Casas, Ferran Climent.
 */
public class Config {
    
    public static File arxiuConfig = new File("config/gui.conf"); //Declarem el fitxer per llegir la configuracio

    /*public static Color llegirColorFons() throws FileNotFoundException, IOException { //Metode per llegir el color amb execpcions per si no troba el fitxer
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

                color = parseColor();        //Igualem el color a la cadena
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
    }*/

    public static Color parseColor() { //Metode per interpretar el arxiu
        Pattern c = Pattern.compile("rgb *\\(*([0-9]+), *([0-9]+), *([0-9]+) *\\)");   //LLegir el color amb rgb
        Matcher m = c.matcher(Public.dadesConfig[0]);   //Igualar el matcher al pattern amb el color

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
            Public.dadesConfig[0] = "rgb(" + nou.getRed() + "," + nou.getGreen() + "," + nou.getBlue() + ")";
            guardarConfig();
        }
    }

    /*private static void guardarColorFons() {
        if (arxiuConfig.exists()) {
            arxiuConfig.delete();
        }

        try {
            BufferedWriter wr = new BufferedWriter(new FileWriter(arxiuConfig));
            FileWriter escriureArxiu = new FileWriter(arxiuConfig, true);
            BufferedWriter buffer = new BufferedWriter(escriureArxiu);

            buffer.write(dadesConfig[0]);
            buffer.newLine();
            buffer.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
    }*/

    /**
     * Llegim el fitxer de configuracio per agafar el tipus de lletra que es va
     * establir l'ultima vegada
     *
     * @param component
     */
    /*public static void aplicarFont(Component component) {

        try {
            BufferedReader lectura = new BufferedReader(new FileReader("font.txt"));

            Public.dadesConfig[0] = lectura.readLine();
            Public.dadesConfig[1] = lectura.readLine();
            Public.dadesConfig[2] = lectura.readLine();
            Public.dadesConfig[3] = lectura.readLine();


            Font fuente = new Font(Public.dadesConfig[1], Integer.parseInt(Public.dadesConfig[2]), Integer.parseInt(Public.dadesConfig[3]));                         //Variable per a emmagatzemar les dades de la font
            canviarFont(component, fuente);
        } catch (FileNotFoundException ex) {
            Auxiliar.escriure_error("Error: " + ex);
        } catch (IOException ex) {
            Auxiliar.escriure_error("Error: " + ex);
        }
    }*/

    /**
     * Metode per canviar la font: Si el component te 'fills' es torna a cridar
     * a la funcio, per a que es canvie la font de tots
     *
     * @param component
     * @param font
     */
    public static void canviarFont(Component component) {
        try {
            Font fuente = new Font(Public.dadesConfig[1], Integer.parseInt(Public.dadesConfig[2]), Integer.parseInt(Public.dadesConfig[3]));                         //Variable per a emmagatzemar les dades de la font
            component.setFont(fuente);
        } catch (Exception e) {
            Auxiliar.escriure_error("Error: " + e);
        }

        if (component instanceof Container) {
            for (Component child : ((Container) component).getComponents()) {
                canviarFont(child);
            }
        }
    }

    /**
     * Metode per a escriure en un fitxer les dades de la font
     *
     * @param font
     * @param tipus
     * @param mida
     */
    public static void guardarConfig() {
        File fitxer_sortida = new File("config/gui.conf");
        
        try {
            PrintStream escriptor = new PrintStream(fitxer_sortida);

            for (int i = 0; i < Public.dadesConfig.length; ++i) {
                escriptor.println(Public.dadesConfig[i]);
            }

        } catch (FileNotFoundException e) {

        }
    }
    
    public static void lecturaConfig(){
        try {
            BufferedReader lectura = new BufferedReader(new FileReader(arxiuConfig));

            Public.dadesConfig[0] = lectura.readLine();
            Public.dadesConfig[1] = lectura.readLine();
            Public.dadesConfig[2] = lectura.readLine();
            Public.dadesConfig[3] = lectura.readLine();


        } catch (FileNotFoundException ex) {
            Auxiliar.escriure_error("Error: " + ex);
        } catch (IOException ex) {
            Auxiliar.escriure_error("Error: " + ex);
        }
    }

}
