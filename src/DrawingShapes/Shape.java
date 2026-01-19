/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DrawingShapes;
import javax.swing.JFrame;
import java.awt.Color;
/**
 *
 * @author neos
 */
public class Shape {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Drawing lines, rectangles and ovals");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ShapeJPanel sj = new ShapeJPanel();
        sj.setBackground(Color.WHITE);
        frame.add(sj);
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
