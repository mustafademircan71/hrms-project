package campProject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import campProject.hrms.business.abstracts.JobPostionService;
import campProject.hrms.core.utilities.results.ErrorResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.core.utilities.results.SuccessResult;
import campProject.hrms.dataAccess.abstracts.JobPostionDao;
import campProject.hrms.entities.concretes.JobPosition;


@Service
public class JobPostionManager implements JobPostionService {

	private JobPostionDao jobPostionDao;
	
	@Autowired
	public JobPostionManager(JobPostionDao jobpostionDao) {
		this.jobPostionDao=jobpostionDao;
	}
	
	@Override
	public List<JobPosition> getAll() {
		
		return jobPostionDao.findAll();
	}

	@Override
	public Result add(JobPosition jobPostion) {
		if(jobPostion.getPositionName().isEmpty()) {
			return new ErrorResult("Bu isimle kayıtlı pozisyon zaten var");
		}else {
			jobPostionDao.save(jobPostion);
			return new SuccessResult("Kayıt Eklendi");
		}
		
	}

}
