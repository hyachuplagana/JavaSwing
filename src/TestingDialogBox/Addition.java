/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestingDialogBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author neos
 */
public class Addition {
    public static void main(String[] args) {
        String firstNumber;
        firstNumber = JOptionPane.showInputDialog("Enter first integer: ");
        String secondNumber; 
        secondNumber = JOptionPane.showInputDialog("Enter second integer: ");
        int n1 = Integer.parseInt(firstNumber);
        int n2 = Integer.parseInt(secondNumber);
        int sum = n1 + n2;
        
        JFrame frame = new JFrame("HEHE");
        frame.setSize(400,400);
        frame.setLocation(400,10);
//        JOptionPane.showMessageDialog(null,"The sum is " + sum, "Sum of Two Integers",JOptionPane.INFORMATION_MESSAGE);
        //null le screen ko center, message rakhne, dialogboxtitle, dialogbox message type
        //dialogbox message type: plain, error, information, etc
        
        //message lai top ma dekhauna .. position milauna null ko satta
        
        JOptionPane.showMessageDialog(frame,"The sum is " + sum, "Sum of Two Integers",JOptionPane.INFORMATION_MESSAGE);

    }
}
