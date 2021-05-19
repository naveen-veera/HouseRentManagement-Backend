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

import in.wiley.houserent.model.BookingModel;
import in.wiley.houserent.repository.BookingRepo;

@CrossOrigin(origins = "*")
@RestController
public class BookingController {

	@Autowired
	private BookingRepo bookingRepo;
	
	//Get all Booking
	@GetMapping("/allBooking")
	public List<BookingModel> getAllBooking(){
		return bookingRepo.findAll();
	}
	
	//Get Booking
	@GetMapping("/booking")
	public BookingModel getBooking(@RequestParam long id){
		return bookingRepo.findById(id).get();
	}
		
	//Add Booking
	@PostMapping("/addBooking")
	public BookingModel addBooking(@RequestBody BookingModel booking) {
		return bookingRepo.save(booking);
	}
	
	
	//Approved Status Update
	@PutMapping("/approveBooking")
	public BookingModel approveBooking(@RequestBody BookingModel booking) {
		return bookingRepo.save(booking);
	}
	
	
	//Remove Booking
	
	@DeleteMapping("/removeBooking")
	public void removeBooking(@RequestParam long id) {
		bookingRepo.deleteById(id);
	}
}
