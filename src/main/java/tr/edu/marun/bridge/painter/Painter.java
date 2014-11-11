/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.edu.marun.bridge.painter;

import javax.swing.JComponent;
import tr.edu.marun.bridge.model.Oval;
import tr.edu.marun.bridge.model.Rectangle;

/**
 *
 * @author bamasyali
 */
public interface Painter {

    JComponent paintOval(Oval oval);

    JComponent paintRectangle(Rectangle rectangle);

}
