package campProject.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import campProject.hrms.entities.concretes.Experience;

public interface ExperienceDao extends JpaRepository<Experience, Integer> {
		List<Experience> getByCurriculumVitae_CvId(int id);
}
