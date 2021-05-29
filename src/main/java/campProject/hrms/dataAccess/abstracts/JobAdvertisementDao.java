package campProject.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import campProject.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {
	
	
	@Query("From JobAdvertisement where isActive=true")	
	List<JobAdvertisement> getAllIsActive();
	
	@Query("From JobAdvertisement where isActive=true Order By releaseDate asc")
	List<JobAdvertisement> getAllDate();
	
	List<JobAdvertisement> getByEmployer_Id(int userId);
	
	@Query("From JobAdvertisement where id=:id")
	JobAdvertisement getbyId(int id);
	
	
}
