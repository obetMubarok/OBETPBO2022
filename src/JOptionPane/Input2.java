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
public class Input2 {

    public static void main(String[] args) {
        String in = (String)JOptionPane.showInputDialog(null,
                "Is this a question?",
                "Dialog Title",
                3,
                null,
                null,
                "Type something here.");
    }
}
