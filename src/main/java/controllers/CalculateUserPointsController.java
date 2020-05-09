package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import services.CalculateUserPoints;

@RestController
public class CalculateUserPointsController {

    @GetMapping("/calculate")
    public int function(){
        return CalculateUserPoints.calculate();
    }
}