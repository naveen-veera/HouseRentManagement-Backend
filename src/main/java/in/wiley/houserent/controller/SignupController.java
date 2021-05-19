package in.wiley.houserent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.wiley.houserent.model.LoginModel;
import in.wiley.houserent.model.UserModel;
import in.wiley.houserent.repository.UserRepo;

@CrossOrigin(origins = "*")
@RestController
public class SignupController {
	
	@Autowired
	private UserRepo userRepo;
	
	//Root Mapping
	@GetMapping("/")
	public String Home() {
		return "Spring Boot Started :)";
	}
	
	//Adding User
	@PostMapping("/addUser")
	public void addUser(@RequestBody UserModel user) {
		userRepo.save(user);	
	}
	
	//Removing User
	@DeleteMapping("/removeUser")
	public boolean removeUser(@RequestBody LoginModel user) {
		
		UserModel userDetails =  userRepo.findById(user.getUsername()).get();
		userRepo.delete(userDetails);
		return true;
	}
	
	
}
