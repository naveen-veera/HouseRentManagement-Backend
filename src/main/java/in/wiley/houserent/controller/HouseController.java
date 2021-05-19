package in.wiley.houserent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.wiley.houserent.model.HouseModel;
import in.wiley.houserent.repository.HouseRepo;

@CrossOrigin(origins = "*")
@RestController
public class HouseController {

	@Autowired
	private HouseRepo houseRepo;
	
	//Get all House Details
	@GetMapping("/allHouse")
	public List<HouseModel> getAllHouse(){
		return houseRepo.findAll();
	}

	//Get House Details by Id
	@GetMapping("/house")
	public HouseModel getHouse(@RequestParam String regNo) {
		HouseModel houseDetails = houseRepo.findById(regNo).get();
		if(houseDetails.getRegNo().isEmpty()) {
			return null;
		}
		return houseDetails;
	}
	
	//Adding new House details
	@PostMapping("/addHouse")
	public HouseModel addHouse(@RequestBody HouseModel house) {
		return houseRepo.save(house);
	}
	
	//Update House Details
	@PutMapping("/editHouse")
	public HouseModel editHouse(@RequestBody HouseModel house) {
		HouseModel oldDetails = houseRepo.findById(house.getRegNo()).get();
		if(oldDetails.getRegNo().equals(house.getRegNo())) {
			oldDetails = house;
		}
		return houseRepo.save(oldDetails);
	}
	
	//Delete house Details
	@DeleteMapping("/removeHouse")
	public boolean removeHouse(@RequestParam String regNo) {
		houseRepo.deleteById(regNo);
		return true;
	}
}
