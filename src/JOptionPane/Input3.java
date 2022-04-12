/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOptionPane;

import javax.swing.JOptionPane;

/**
 *
 * @author Obet Mubarok
 */
public class Input3 {

    public static void main(String[] args) {
        String[] acceptableValues = {"Choice 1", "Choice 2", "Choice 3"};
        String input = (String) JOptionPane.showInputDialog(null,
                "Is this a question?",
                "Dialog Title",
                2,
                null,
                acceptableValues,
                acceptableValues[1]);
        
        JOptionPane.showMessageDialog(null, input);

    }
}
