/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.edu.marun.bridge.model;

/**
 *
 * @author bamasyali
 */
public class Rectangle implements Shape {

    private final Integer x1, y1, x2, y2;

    public Rectangle(Integer x1, Integer y1, Integer x2, Integer y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Integer getX1() {
        return x1;
    }

    public Integer getY1() {
        return y1;
    }

    public Integer getX2() {
        return x2;
    }

    public Integer getY2() {
        return y2;
    }
    
    

}
