package campProject.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import campProject.hrms.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer> {
		User findByEmail(String email);
}
