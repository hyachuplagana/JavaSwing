/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestingRadioButton;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;

/**
 *
 * @author neos
 */
public class RadioButtonFrame extends JFrame {

    private JTextField textField;
    private Font plainFont;
    private Font boldFont;
    private Font italicFont;
    private Font boldItalicFont;
    private JRadioButton plainJRadioButton;
    private JRadioButton boldJRadioButton;
    private JRadioButton italicJRadioButton;
    private JRadioButton boldItalicJRadioButton;
//    private ButtonGroup radioGroup;

    public RadioButtonFrame() {
        super("RadioButton Test");
        setLayout(new FlowLayout());
        textField = new JTextField("पालीमा टाईप गर्नु", 25);
        add(textField);

        plainJRadioButton = new JRadioButton("Plain", true);
        boldJRadioButton = new JRadioButton("Bold", true);
        italicJRadioButton = new JRadioButton("Italic", true);
        boldItalicJRadioButton = new JRadioButton("BoldItalic", true);
        add(plainJRadioButton);
        add(boldJRadioButton);
        add(italicJRadioButton);
        add(boldItalicJRadioButton);
        
        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(plainJRadioButton);
        radioGroup.add(boldJRadioButton);
        radioGroup.add(italicJRadioButton);
        radioGroup.add(boldItalicJRadioButton);
        
//        plainFont = new Font("Serif", Font.PLAIN,14);
//        boldFont = new Font("Serif", Font.BOLD,14);
//        italicFont = new Font("Serif", Font.ITALIC,14);
//        boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC,14);
plainFont = new Font("", Font.PLAIN,14);
        boldFont = new Font("Serif", Font.BOLD,14);
        italicFont = new Font("Serif", Font.ITALIC,14);
        boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC,14);
        textField.setFont(new Font("Nirmala UI", Font.PLAIN,19));
        
        plainJRadioButton.addItemListener(new RadioButtonHandler(plainFont));
        boldJRadioButton.addItemListener(new RadioButtonHandler(boldFont));
        italicJRadioButton.addItemListener(new RadioButtonHandler(italicFont));
        boldItalicJRadioButton.addItemListener(new RadioButtonHandler(boldItalicFont));
    }
    
    private class RadioButtonHandler implements ItemListener{
        private Font font;
        public RadioButtonHandler(Font f){
            font = f;
        }
        @Override
        public void itemStateChanged(ItemEvent event){
            textField.setFont(font);
        }
    }

}
