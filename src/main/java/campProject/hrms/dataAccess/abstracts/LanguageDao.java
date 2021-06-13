package campProject.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import campProject.hrms.entities.concretes.Language;

public interface LanguageDao extends JpaRepository<Language, Integer> {
		List<Language> getByCurriculumVitae_CvId(int id);
}
