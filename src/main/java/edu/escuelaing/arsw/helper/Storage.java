package edu.escuelaing.arsw.helper;

import java.util.ArrayList;

import edu.escuelaing.arsw.model.Point;

public class Storage {

    private static final Storage instance = new Storage();
    private ArrayList<Point> points = new ArrayList<>();

    private Storage() {
    }

    /**
     * Instancia de la clase
     * 
     * @return
     */
    public static Storage getInstance() {
        return instance;
    }

    /**
     * Constructor de la clase con parametros
     * 
     * @param points
     */
    public Storage(ArrayList<Point> points) {
        this.points = points;
    }

    /**
     * Agrega un nuevo punto a la lista
     * 
     * @param newPoint
     */
    public void addPoint(Point newPoint) {
        //System.out.println(newPoint);
        points.add(newPoint);
    }

    /**
     * Devuelve los puntos
     * @return
     */
    public ArrayList<Point> getPoints() {
        return this.points;
    }

    public void setPoints(ArrayList<Point> points) {
        this.points = points;
    }

    public Storage points(ArrayList<Point> points) {
        setPoints(points);
        return this;
    }

    @Override
    public String toString() {
        return "{" + " points='" + getPoints() + "'" + "}";
    }

}
