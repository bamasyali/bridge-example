/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.edu.marun.bridge.draw;

import javax.swing.JComponent;
import tr.edu.marun.bridge.model.RectangleModel;
import tr.edu.marun.bridge.painter.Drawing;

/**
 *
 * @author bamasyali
 */
public class RectangleShape extends Shape<RectangleModel, Drawing> {

    public RectangleShape(Drawing drawing) {
        super(drawing);
    }

    @Override
    public JComponent draw(RectangleModel model) {
        return super.drawing.drawRectangle(model);
    }

}
