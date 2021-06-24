package edu.escuelaing.arsw.services;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

import edu.escuelaing.arsw.model.Point;

public interface BoardServices {
    ConcurrentHashMap<String, ArrayList<Point>> fetchAllPoints();
    void addPoint(String userIp, Point point);
}
