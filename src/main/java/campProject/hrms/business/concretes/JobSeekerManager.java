package campProject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import campProject.hrms.business.abstracts.AuthService;
import campProject.hrms.business.abstracts.JobSeekerService;
import campProject.hrms.business.valid.JobSeekerValid;

import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.ErrorResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.core.utilities.results.SuccesDataResult;
import campProject.hrms.core.utilities.results.SuccessResult;

import campProject.hrms.dataAccess.abstracts.JobSeekerDao;

import campProject.hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService {
	
		private JobSeekerDao jobSeekerDao;
		private AuthService authService;
	
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao,
			AuthService authService) {
			this.jobSeekerDao = jobSeekerDao;
			this.authService=authService;
		}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		
		return new SuccesDataResult<List<JobSeeker>>
		(jobSeekerDao.findAll(),"Data Listelendi");
	}

	@Override
	public Result add(JobSeeker jobSeeker) {
		if(!JobSeekerValid.employerNullCheck(jobSeeker)) {
				return new ErrorResult("Tüm Alanlar Doludurlmalıdır.");
		}else if(authService.idntityNoVerify(jobSeeker.getIdentityNo())) {
			return new ErrorResult("Kimlik Numarası Edin");
		}else if (authService.emailVerify(jobSeeker.getEmail())) {
			return new ErrorResult("Emaili Kontrol Edin");
		}else if(jobSeeker.getPassword().equals(jobSeeker.getRepeatPassword())) {
			return new ErrorResult("Şifreler aynı olmaldır.");
		}else {
			jobSeekerDao.save(jobSeeker);
			return new SuccessResult("Kayıt Yapıldı");
		}
	
	}

	@Override
	public DataResult<JobSeeker> getById(int id) {
		return new SuccesDataResult<JobSeeker>(this.jobSeekerDao.getById(id),"Data Listelendi");
	}



}
