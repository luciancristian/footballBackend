package controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import db.User;
import services.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }
    
    @GetMapping("/user/{id}")
    public Optional<User> getUser(@PathVariable Long id){
        return userService.getUser(id);
    }
    
    @PostMapping("/addUser")
    public User addUser(@RequestBody User newUser) {
    	return userService.addUser(newUser);
    }
    
    @PostMapping("/addUsers")
    public List<User> addUsers(@RequestBody List<User> newUsers) {
    	return userService.addUsers(newUsers);
    }
    
    @PutMapping("/updateUser")
    public User updateUsers(@RequestBody User updateUser) {
    	return userService.updateUser(updateUser);
    }
    
    @PutMapping("/updateUsers")
    public List<User> updateUsers(@RequestBody List<User> updateUsers) {
    	return userService.updateUsers(updateUsers);
    }
    
    //send in path the id of the user
    @DeleteMapping(value="/deleteUser/{id}")
    public void deleteUser(@PathVariable Long id) {
    	userService.deleteUser(id);
    }
    
    //send an array of long in body
    @DeleteMapping(value="/deleteUsers")
    public void deleteUsers(@RequestBody List<Long> ids) {
    	userService.deleteUsers(ids);
    }
}