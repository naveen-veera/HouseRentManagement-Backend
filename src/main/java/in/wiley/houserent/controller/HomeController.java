package in.wiley.houserent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "LoginForm";
	}
	
	@GetMapping("/LoginForm.html")
	public String LoginForm() {
		return "LoginForm";
	}
	
	@GetMapping("/SignupForm.html")
	public String signup() {
		return "SignupForm";
	}
	
	@GetMapping("/SellerHome.html")
	public String SellerHome() {
		return "SellerHome";
	}
	
	@GetMapping("/BuyerHome.html")
	public String BuyerHome() {
		return "BuyerHome";
	}
}
