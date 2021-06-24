package edu.escuelaing.arsw.services;

import java.util.ArrayList;

import edu.escuelaing.arsw.model.Point;

public interface BoardServices {
    ArrayList<Point> fetchAllPoints();
    void addPoint(Point point);
}
