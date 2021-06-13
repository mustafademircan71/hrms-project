package campProject.hrms.business.abstracts;

import java.util.List;

import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.entities.concretes.EducationInfo;

public interface EducationInfoService {
		DataResult<List<EducationInfo>> getAll();
		Result add(EducationInfo educationInfo);
		DataResult<List<EducationInfo>> getByCurriculumVitae_CvId(int id);
}
