package edu.escuelaing.arsw.services;

import java.util.ArrayList;

import edu.escuelaing.arsw.model.Point;

public interface BoardServices {
    /**
     * Devuelve todos los puntos del tablero
     * @return
     */
    ArrayList<Point> fetchAllPoints();

    /**
     * Agrega un punto a la lista
     * @param point
     */
    void addPoint(Point point);
}
