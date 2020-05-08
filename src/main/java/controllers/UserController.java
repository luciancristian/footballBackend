package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import db.User;
import interfaces.IUserRepo;

@RestController
public class UserController {

    @Autowired
    IUserRepo repo;

    @GetMapping("/users")
    public List<User> function(){
        return repo.findAll();
    }
}
