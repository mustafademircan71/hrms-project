package campProject.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import campProject.hrms.entities.concretes.CurriculumVitae;

public interface CurriculumVitaeDao extends JpaRepository<CurriculumVitae, Integer> {
	CurriculumVitae getById(int id);
	
	@Query("From CurriculumVitae c where c.JobSeeker.User_Id=?1")
	List<CurriculumVitae> getByCurriculumVitaeForUserId(int userId);
	
}
