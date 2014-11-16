/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.edu.marun.bridge;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JComponent;
import javax.swing.JFrame;
import tr.edu.marun.bridge.draw.OvalShape;
import tr.edu.marun.bridge.draw.Shape;
import tr.edu.marun.bridge.model.Model;
import tr.edu.marun.bridge.model.OvalModel;
import tr.edu.marun.bridge.painter.BlueDrawing;
import tr.edu.marun.bridge.painter.Drawing;

/**
 *
 * @author bamasyali
 */
public class Main {

    public static void main(String[] args) {
        Drawing drawing = new BlueDrawing();

        Shape shape = new OvalShape(drawing);

        Model model = new OvalModel(100, 100, 100);

        JComponent component = shape.draw(model);
        
        draw(component);
    }

    protected static void draw(JComponent component) {
        JFrame testFrame = new JFrame();
        testFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        component.setPreferredSize(new Dimension(320, 200));

        testFrame.getContentPane().add(component, BorderLayout.CENTER);

        testFrame.pack();
        testFrame.setVisible(true);
    }
}
