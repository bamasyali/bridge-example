/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.edu.marun.bridge.draw;

import javax.swing.JComponent;
import tr.edu.marun.bridge.model.OvalModel;
import tr.edu.marun.bridge.painter.Drawing;

/**
 *
 * @author bamasyali
 */
public class OvalShape extends Shape<OvalModel, Drawing> {

    public OvalShape(Drawing drawing) {
        super(drawing);
    }

    @Override
    public JComponent draw(OvalModel model) {
        return super.drawing.drawOval(model);
    }

}
