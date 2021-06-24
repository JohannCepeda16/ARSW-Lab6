package edu.escuelaing.arsw.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.escuelaing.arsw.model.Point;
import edu.escuelaing.arsw.services.BoardServices;

@RestController
@RequestMapping(value = "/api/")
@CrossOrigin(origins = "*")
public class BoardController {

    @Autowired
    BoardServices boardServices;
    
    /**
     * Devuelve todos los puntos
     * @return
     */
    @GetMapping("fetchAll")
    public ArrayList<Point> fetchAllPoints(){
        try {
            return boardServices.fetchAllPoints();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Agrega un punto adicional a la lista
     * @param point
     */
    @PostMapping("addPoint")
    public void addPoint(@RequestBody Point point){
        try {
            boardServices.addPoint(point);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
