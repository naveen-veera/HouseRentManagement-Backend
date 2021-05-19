package in.wiley.houserent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import in.wiley.houserent.model.UserModel;

public interface UserRepo extends JpaRepository<UserModel, String> {

}
