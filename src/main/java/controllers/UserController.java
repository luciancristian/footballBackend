package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    
    @PostMapping("/addUser")
    public User addUser(@RequestBody User newUser) {
    	return repo.save(newUser);
    }
    
    @PostMapping("/addUsers")
    public List<User> addUsers(@RequestBody List<User> newUsers) {
    	return repo.saveAll(newUsers);
    }
    
    @PutMapping("/updateUser")
    public User updateUsers(@RequestBody User updateUser) {
    	return repo.save(updateUser);
    }
    
    @PutMapping("/updateUsers")
    public List<User> updateUsers(@RequestBody List<User> updateUsers) {
    	return repo.saveAll(updateUsers);
    }
    
    //send in path the id of the user
    @DeleteMapping(value="/deleteUser/{id}")
    public void deleteUser(@PathVariable Long id) {
    	repo.deleteById(id);
    }
    
    //send an array of long in body
    @DeleteMapping(value="/deleteUsers")
    public void deleteUser(@RequestBody List<Long> ids) {
    	ids.forEach((id) -> {repo.deleteById(id);});
    }
    
}