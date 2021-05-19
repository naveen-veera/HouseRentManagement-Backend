package in.wiley.houserent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.wiley.houserent.model.HouseModel;

public interface HouseRepo extends JpaRepository<HouseModel, String>{

}
