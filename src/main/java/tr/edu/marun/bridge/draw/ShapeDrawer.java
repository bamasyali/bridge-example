/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.edu.marun.bridge.draw;

import tr.edu.marun.bridge.model.Shape;

/**
 *
 * @author bamasyali
 */
public interface ShapeDrawer<T extends Shape> {

    void draw(T shape);
}
