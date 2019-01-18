/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteques;

import com.sun.istack.internal.logging.Logger;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class ReadColor {

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
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex);
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
}
