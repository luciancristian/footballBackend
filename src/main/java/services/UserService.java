package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import db.User;
import interfaces.IUserRepo;

@Service
public class UserService {
    
	@Autowired
    IUserRepo repo;
	
    public List<User> getUsers(){
        return repo.findAll();
    }
    
    public User addUser(User newUser) {
    	return repo.save(newUser);
    }

    public List<User> addUsers(List<User> newUsers) {
    	return repo.saveAll(newUsers);
    }

    public User updateUser(User updateUser) {
    	return repo.save(updateUser);
    }


    public List<User> updateUsers(List<User> updateUsers) {
    	return repo.saveAll(updateUsers);
    }


    public void deleteUser(Long id) {
    	repo.deleteById(id);
    }


    public void deleteUsers(List<Long> ids) {
    	ids.forEach((id) -> {repo.deleteById(id);});
    }
}