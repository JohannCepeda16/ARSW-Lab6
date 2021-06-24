package edu.escuelaing.arsw.model;

import java.io.Serializable;

public class Point implements Serializable{
    
    private float x;
    private float y;
    private String color;

    public Point() {
    }

    public Point(float x, float y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "{" +
            " x='" + getX() + "'" +
            ", y='" + getY() + "'" +
            ", color='" + getColor() + "'" +
            "}";
    }

}
