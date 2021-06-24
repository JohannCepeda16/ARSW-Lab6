package edu.escuelaing.arsw.helper;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

import edu.escuelaing.arsw.model.Point;

public class Storage {

    private static final Storage instance = new Storage();
    private ConcurrentHashMap<String, ArrayList<Point>> points = new ConcurrentHashMap<>();

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
    public Storage(ConcurrentHashMap<String, ArrayList<Point>> points) {
        this.points = points;
    }

    /**
     * Agrega un nuevo punto a la lista
     * 
     * @param newPoint
     */
    public void addPoint(String ip, Point newPoint) {
        ArrayList<Point> oldPoints = null;
        if (points.containsKey(ip)) {
            oldPoints = points.get(ip);
        } else {
            oldPoints = new ArrayList<Point>();
        }
        //Agregar el nuevo punto
        oldPoints.add(newPoint);
        points.put(ip, oldPoints);
    }

    public ConcurrentHashMap<String, ArrayList<Point>> getPoints() {
        return this.points;
    }

    public void setPoints(ConcurrentHashMap<String, ArrayList<Point>> points) {
        this.points = points;
    }

    public Storage points(ConcurrentHashMap<String, ArrayList<Point>> points) {
        setPoints(points);
        return this;
    }

    @Override
    public String toString() {
        return "{" + " points='" + getPoints() + "'" + "}";
    }

}
