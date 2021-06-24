package edu.escuelaing.arsw.services.impl;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Component;

import edu.escuelaing.arsw.helper.Storage;
import edu.escuelaing.arsw.model.Point;
import edu.escuelaing.arsw.services.BoardServices;

@Component
public class BoardServicesImpl implements BoardServices{

    @Override
    public ConcurrentHashMap<String, ArrayList<Point>> fetchAllPoints() {
        return Storage.getInstance().getPoints();
    }

    @Override
    public void addPoint(String userIp, Point point) {
        Storage.getInstance().addPoint(userIp, point);
    }
        
}
