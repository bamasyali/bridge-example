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
public class Oval implements Shape {

    private final Integer x, y, r;

    public Oval(Integer x, Integer y, Integer r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public Integer getR() {
        return r;
    }

}
