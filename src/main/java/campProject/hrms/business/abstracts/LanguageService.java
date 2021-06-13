package campProject.hrms.business.abstracts;

import java.util.List;

import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.entities.concretes.Language;

public interface LanguageService  {
			DataResult<List<Language>> getAll();
			Result add(Language language);
			DataResult<List<Language>> getByCurriculumVitae_CvId(int id);
}
