package campProject.hrms.dataAccess.abstracts;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import campProject.hrms.entities.concretes.CurriculumVitae;

public interface CurriculumVitaeDao extends JpaRepository<CurriculumVitae, Integer> {
	
	
	
	CurriculumVitae getByCvId(int id);
	
	
	
}
