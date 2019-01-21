/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteques;

import java.awt.Color;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Config {

    public static File arxiuConfig = new File("config/gui.conf");

    public static Color llegirColorFons() throws FileNotFoundException, IOException {
        String colorCadena = "";
        Color color = null;

        if (arxiuConfig.exists()) {
            String linea = "";

            try {

                FileReader llegirArxiu = new FileReader(arxiuConfig);
                BufferedReader buffer = new BufferedReader(llegirArxiu);

                while ((linea = buffer.readLine()) != null) {
                    colorCadena += linea;
                }

                color = parseColor(colorCadena);
                return color;
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex);
                Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
                
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex);
                Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
            }
        }
        return null;
    }

    public static Color parseColor(String color) {
        Pattern c = Pattern.compile("rgb *\\(*([0-9]+), *([0-9]+), *([0-9]+) *\\)");
        Matcher m = c.matcher(color);

        if (m.matches()) {
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
