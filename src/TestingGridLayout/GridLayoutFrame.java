/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestingGridLayout;

import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
/**
 *
 * @author neos
 */
public class GridLayoutFrame extends JFrame implements ActionListener {
    
        private JButton[] buttons;
    private static final String[] names = {"one","two","three","four","five","six"};
    private boolean toggle = true;
    private Container container;
    private GridLayout g1;
    private GridLayout g2;
    
    public GridLayoutFrame(){
        super("GridLayout Demo");
        g1 = new GridLayout(2,3,5,5); //2 by 3 with 5 gap
        g2 = new GridLayout(3,2); //3 by 2 no gap
        container = getContentPane();
        setLayout(g1);
        buttons = new JButton[names.length];
        
        for (int count = 0; count< names.length;count++){
            buttons[count] = new JButton(names[count]);
            buttons[count].addActionListener(this);
            add(buttons[count]);
        }            
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(toggle)
            container.setLayout(g2);
        else 
            container.setLayout(g1);
        toggle =! toggle;
        container.validate();
    }
    
}

