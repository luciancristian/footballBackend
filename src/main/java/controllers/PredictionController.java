package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import db.Prediction;
import interfaces.IPredictionRepo;

@RestController
public class PredictionController {

    @Autowired
    IPredictionRepo repo;

    @GetMapping("/predictions")
    public List<Prediction> function(){
        return repo.findAll();
    }
}