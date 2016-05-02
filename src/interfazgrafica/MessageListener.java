/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazgrafica;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Estudiante
 */
public class MessageListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent event){
        JOptionPane.showMessageDialog(null, "You clicked the button!");
    }
}
