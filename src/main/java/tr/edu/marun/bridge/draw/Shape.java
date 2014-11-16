/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.edu.marun.bridge.draw;

import javax.swing.JComponent;
import tr.edu.marun.bridge.model.Model;
import tr.edu.marun.bridge.painter.Drawing;

/**
 *
 * @author bamasyali
 * @param <M>
 * @param <T>
 */
public abstract class Shape< M extends Model, T extends Drawing> {

    protected final T drawing;

    public Shape(T drawing) {
        this.drawing = drawing;
    }

    public abstract JComponent draw(M model);

}
