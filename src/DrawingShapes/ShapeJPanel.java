/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DrawingShapes;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
/**
 *
 * @author neos
 */
public class ShapeJPanel extends JPanel{
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.WHITE);
        g.setColor(Color.yellow);
        g.drawLine(5, 30, 380, 30); //x1,y1,x2,y2
        g.setColor(Color.BLUE);
        g.drawRect(5, 40, 90, 55); // x,y,w,h xy chai left top 
        g.fillRect(100,40,90,55); 
        g.setColor(Color.CYAN);
        g.fillRoundRect(195, 40, 90, 55, 50,50); //x, y, w, h, arc w, arc h
        g.drawRoundRect(290, 40, 90, 55, 20, 20);
        g.setColor(Color.RED);
        g.draw3DRect(5,100,90,55,true); 
        
        g.fill3DRect(100, 100, 90, 55,true);
        g.setColor(Color.MAGENTA);
        g.drawOval(195, 100, 90, 55);
        g.fillOval(290, 100, 90, 55);
    } 
}
