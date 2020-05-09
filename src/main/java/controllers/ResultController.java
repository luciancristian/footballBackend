package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import db.MatchResult;
import interfaces.IResultRepo;

@RestController
public class ResultController {

    @Autowired
    IResultRepo repo;

    @GetMapping("/results")
    public List<MatchResult> function(){
        return repo.findAll();
    }
}