/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.edu.marun.bridge.painter;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import tr.edu.marun.bridge.model.OvalModel;
import tr.edu.marun.bridge.model.RectangleModel;

/**
 *
 * @author bamasyali
 */
public class BlueDrawing implements Drawing {

    @Override
    public JComponent drawOval(final OvalModel oval) {
        JComponent component = new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.blue);
                g.fillOval(oval.getX(), oval.getY(), oval.getR(), oval.getR());

            }
        };
        return component;
    }

    @Override
    public JComponent drawRectangle(final RectangleModel rectangle) {
        JComponent component = new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.blue);
                g.fillRect(rectangle.getX1(), rectangle.getY1(), Math.abs(rectangle.getX1() - rectangle.getX1()), rectangle.getY1() - rectangle.getY2());
            }
        };
        return component;
    }

}
