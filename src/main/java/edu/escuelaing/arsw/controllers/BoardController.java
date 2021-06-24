package edu.escuelaing.arsw.controllers;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.escuelaing.arsw.model.Point;
import edu.escuelaing.arsw.services.BoardServices;

@RestController
@RequestMapping(value = "/api/")
@CrossOrigin(origins = "*")
public class BoardController {

    @Autowired
    BoardServices boardServices;
    
    @GetMapping("fetchAll")
    public ConcurrentHashMap<String, ArrayList<Point>> fetchAllPoints(){
        try {
            return boardServices.fetchAllPoints();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @PostMapping("addPoint")
    public void addPoint(@RequestParam("ip") String userIp, @RequestBody Point point){
        try {
            boardServices.addPoint(userIp, point);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
