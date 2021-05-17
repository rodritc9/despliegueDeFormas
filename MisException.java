/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicotres;

import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo
 */
public class MisException extends Exception{
    MisException(String mensaje){
        super(mensaje);
        
        int n = Integer.parseInt(mensaje);
        switch(n){
            case 1:
                 JOptionPane.showMessageDialog(null, "Ingrese valores enteros entre 3 y 20", "Error", JOptionPane.WARNING_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "ingrese valores de lineas entre 4 y 5000", "Error", JOptionPane.WARNING_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "valores no compatibles al espacio de trabajo", "Error", JOptionPane.WARNING_MESSAGE);
                break;

            default:
                break;
        }
    }
    
}
