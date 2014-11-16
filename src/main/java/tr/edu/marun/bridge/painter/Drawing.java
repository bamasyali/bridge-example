/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.edu.marun.bridge.painter;

import javax.swing.JComponent;
import tr.edu.marun.bridge.model.OvalModel;
import tr.edu.marun.bridge.model.RectangleModel;

/**
 *
 * @author bamasyali
 */
public interface Drawing {

    JComponent drawOval(OvalModel oval);

    JComponent drawRectangle(RectangleModel rectangle);

}
