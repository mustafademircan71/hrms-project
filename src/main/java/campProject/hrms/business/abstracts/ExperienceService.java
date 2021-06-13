package campProject.hrms.business.abstracts;

import java.util.List;

import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.entities.concretes.Experience;

public interface ExperienceService {
	DataResult<List<Experience>> getAll();
	Result add(Experience experience);
	DataResult<List<Experience>> getByCurriculumVitaeId(int id);
}
