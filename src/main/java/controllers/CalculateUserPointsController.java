package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import services.UserService;
import db.User;

@RestController
public class CalculateUserPointsController {

	@Autowired
	private UserService userService;
	
    @GetMapping("/userPoints")
    public List<User> calculate(){
        return userService.getUserAfterPointsDSC();
    }
}