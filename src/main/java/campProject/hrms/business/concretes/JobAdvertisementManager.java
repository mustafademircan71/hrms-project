package campProject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import campProject.hrms.business.abstracts.JobAdvertisementService;
import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.core.utilities.results.SuccesDataResult;
import campProject.hrms.core.utilities.results.SuccessResult;
import campProject.hrms.dataAccess.abstracts.JobAdvertisementDao;
import campProject.hrms.entities.concretes.JobAdvertisement;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {
	private JobAdvertisementDao jobAdvertisementDao;
	
	
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		this.jobAdvertisementDao = jobAdvertisementDao;
	}


	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		return new SuccesDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.findAll(), "DataListelendi");
	}


	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
			this.jobAdvertisementDao.save(jobAdvertisement);
			return new SuccessResult("İş İlanı Eklendi");
	}


	@Override
	public DataResult<List<JobAdvertisement>> getAllIsActive() {
		return new SuccesDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.getAllIsActive(),"Data Listelendi");
	}


	@Override
	public DataResult<List<JobAdvertisement>> getAllDate() {
		
		return new SuccesDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.getAllDate(),"Data Listelendi");
	}


	@Override
	public DataResult<List<JobAdvertisement>> getByEmployer_Id(int id) {
		
	return new SuccesDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByEmployer_Id(id));
	}


	@Override
	public DataResult<JobAdvertisement> getById(int id) {
		return new SuccesDataResult<JobAdvertisement>(this.jobAdvertisementDao.getbyId(id));
	}


	@Override
	public Result IsActiveUpdate(int id, boolean isActive) {
		JobAdvertisement jobAdvertisement=this.jobAdvertisementDao.getbyId(id);
		jobAdvertisement.setActive(isActive);
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("İş İlanı Pasif Hale Getirildi");
	}


	


	

	







}
