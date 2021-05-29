package campProject.hrms.business.abstracts;

import java.util.List;

import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {
		DataResult<List<JobAdvertisement>> getAll();
		Result add(JobAdvertisement jobAdvertisement);
		DataResult<List<JobAdvertisement>> getAllIsActive();
		DataResult<List<JobAdvertisement>> getAllDate();
		DataResult<List<JobAdvertisement>> getByEmployer_Id(int userId);
		DataResult<JobAdvertisement> getById(int id);
		Result IsActiveUpdate(int id,boolean isActive);
}
