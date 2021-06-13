package campProject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import campProject.hrms.business.abstracts.JobSeekerService;


import campProject.hrms.core.utilities.results.DataResult;

import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.core.utilities.results.SuccesDataResult;
import campProject.hrms.core.utilities.results.SuccessResult;

import campProject.hrms.dataAccess.abstracts.JobSeekerDao;

import campProject.hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService {
	
		private JobSeekerDao jobSeekerDao;
		
	
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao) {
			this.jobSeekerDao = jobSeekerDao;
			
		}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		
		return new SuccesDataResult<List<JobSeeker>>
		(jobSeekerDao.findAll(),"Data Listelendi");
	}

	@Override
	public Result add(JobSeeker jobSeeker) {
		jobSeekerDao.save(jobSeeker);
		return new SuccessResult("Kayıt Yapıldı");
			
	}

	@Override
	public DataResult<JobSeeker> getById(int id) {
		return new SuccesDataResult<JobSeeker>(this.jobSeekerDao.getById(id),"Data Listelendi");
	}



}
