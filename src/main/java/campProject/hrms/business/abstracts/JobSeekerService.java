package campProject.hrms.business.abstracts;

import java.util.List;

import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.entities.concretes.JobSeeker;

public interface JobSeekerService {
		DataResult<List<JobSeeker>> getAll();
		
		Result add(JobSeeker jobSeeker);
}
