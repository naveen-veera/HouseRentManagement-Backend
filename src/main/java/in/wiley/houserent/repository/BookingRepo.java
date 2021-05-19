package in.wiley.houserent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.wiley.houserent.model.BookingModel;

public interface BookingRepo extends JpaRepository<BookingModel, Long>{

}
