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
import java.io.File;                            //Import per a les files
import java.io.FileNotFoundException;           //Import per si no troba el fitxer
import java.io.FileReader;                      //Import per a llegir sobre files
import java.io.IOException;                     //Import per les excepcions
import java.io.PrintStream;
import java.util.regex.Matcher;                 //Import del matcher
import java.util.regex.Pattern;                 //Import del pattern
import javax.swing.JColorChooser;

/**
 * @author Marcos Zaballos, Manu Gallego, Evaldas Casas, Ferran Climent.
 */
public class Config {

    public static File arxiuConfig = new File("gestio_parc/config/gui.conf"); //Declarem el fitxer per llegir la configuracio

    public static Color parseColor() { //Metode per interpretar el arxiu
        try {
            Pattern c = Pattern.compile("rgb *\\(*([0-9]+), *([0-9]+), *([0-9]+) *\\)");   //LLegir el color amb rgb
            Matcher m = c.matcher(Public.dadesConfig[0]);   //Igualar el matcher al pattern amb el color

            if (m.matches()) {  //Interpretar el color rgb
                return new Color(
                        Integer.valueOf(m.group(1)),//R
                        Integer.valueOf(m.group(2)),//G
                        Integer.valueOf(m.group(3))//B
                );
            }
        }
        catch (Exception e) {
            Auxiliar.escriure_error("Error: " + e);
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
        File fitxer_sortida = new File("gestio_parc/config/gui.conf");
        fitxer_sortida.getParentFile().mkdirs();

        try {
            PrintStream escriptor = new PrintStream(fitxer_sortida);

            for (int i = 0; i < Public.dadesConfig.length; ++i) {
                escriptor.println(Public.dadesConfig[i]);
            }

        } catch (FileNotFoundException e) {
            Auxiliar.escriure_error("Error: " + e);
        }
    }

    /**
     * Metode per a llegir la configuracio des d'un fitxer
     *
     * @return void
     */
    public static void lecturaConfig() {
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
