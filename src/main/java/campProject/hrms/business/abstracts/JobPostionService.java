package campProject.hrms.business.abstracts;

import java.util.List;

import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.entities.concretes.JobPosition;


public interface JobPostionService {
		List<JobPosition> getAll();
		Result add(JobPosition jobPostion);
}
