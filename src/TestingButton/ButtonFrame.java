/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestingButton;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
//import java.awt.event.ButtonHandler;
/**
 *
 * @author neos
 */
public class ButtonFrame extends JFrame{
    private JButton pbtn;
    private JButton fbtn;
    public ButtonFrame(){
        super("Testing Button");
        setLayout(new FlowLayout());
        
        Icon eta = new ImageIcon(getClass().getResource("ic_menu_emoticons.png"));

        
        pbtn = new JButton("Plain Button");
        
        fbtn = new JButton("Fancy Button");
        fbtn.setIcon(eta);
        add(fbtn);
        add(pbtn);
        
        ButtonHandlereu handler = new ButtonHandlereu();
        pbtn.addActionListener(handler);
        fbtn.addActionListener(handler);
    }
    
    private class ButtonHandlereu implements ActionListener {
        String string = "";
        @Override
        public void actionPerformed(ActionEvent event){
            if(event.getSource()== pbtn)
                string = String.format("You pressed %s",event.getActionCommand());
            else if(event.getSource()==fbtn)
                string = String.format("You pressed %s",event.getActionCommand());
            
            JOptionPane.showMessageDialog(null,string);
            
        }
            
    }
    
}
