package edu.escuelaing.arsw.services.impl;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import edu.escuelaing.arsw.helper.Storage;
import edu.escuelaing.arsw.model.Point;
import edu.escuelaing.arsw.services.BoardServices;

@Component
public class BoardServicesImpl implements BoardServices{

    @Override
    public ArrayList<Point> fetchAllPoints() {
        return Storage.getInstance().getPoints();
    }

    @Override
    public void addPoint(Point point) {
        Storage.getInstance().addPoint(point);
    }
        
}
