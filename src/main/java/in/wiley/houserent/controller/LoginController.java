package in.wiley.houserent.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.wiley.houserent.model.LoginModel;
import in.wiley.houserent.model.UserModel;
import in.wiley.houserent.repository.UserRepo;

@CrossOrigin(origins = "*")
@RestController
public class LoginController {
	@Autowired
	private UserRepo userRepo;
	
	//Get all Users
	@GetMapping("/users")
	public List<UserModel> getAllUsers(){
		return userRepo.findAll();	
	}
	
	//Get user by Id
	@GetMapping("/user")
	public UserModel getUserByUsernamePassword(@RequestParam String username, String password ){
		System.out.println(username);
		System.out.println(password);
		Optional<UserModel> user =  userRepo.findById(username);
		if(user.get().getPassword().equals(password)) {
			return user.get();
		}
		else {
			return null;
		}
		
	}
	
	//Get user by Id
	@GetMapping("/username")
	public UserModel getUserByUsername(@RequestParam String username){
		Optional<UserModel> user =  userRepo.findById(username);
		return user.get();	
	}
}
