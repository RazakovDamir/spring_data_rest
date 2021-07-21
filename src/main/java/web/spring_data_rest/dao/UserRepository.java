package web.spring_data_rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import web.spring_data_rest.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
