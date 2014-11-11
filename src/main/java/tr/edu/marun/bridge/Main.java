/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.edu.marun.bridge;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JComponent;
import javax.swing.JFrame;
import tr.edu.marun.bridge.model.Oval;
import tr.edu.marun.bridge.painter.RedPainter;

/**
 *
 * @author bamasyali
 */
public class Main {

    public static void main(String[] args) {
        JFrame testFrame = new JFrame();
        testFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        final JComponent comp = new RedPainter().paintOval(new Oval(100, 100, 100));
        comp.setPreferredSize(new Dimension(320, 200));

        testFrame.getContentPane().add(comp, BorderLayout.CENTER);

        testFrame.pack();
        testFrame.setVisible(true);
    }
}
