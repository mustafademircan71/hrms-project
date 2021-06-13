package campProject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import campProject.hrms.business.abstracts.EmployerService;
import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.core.utilities.results.SuccesDataResult;
import campProject.hrms.core.utilities.results.SuccessResult;
import campProject.hrms.dataAccess.abstracts.EmployerDao;
import campProject.hrms.dataAccess.abstracts.UserDao;
import campProject.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {
	
	private EmployerDao employerDao;
	
	
	
	
	@Autowired
	 public EmployerManager(EmployerDao employerDao,UserDao userDao) {
		this.employerDao=employerDao;
		
	
		}
	
	@Override
	public DataResult<List<Employer>> getAll() {
		
		return new SuccesDataResult<List<Employer>>
		(employerDao.findAll(),"Data Listelendi");
	}

	@Override
	public Result add(Employer employer) {
	
				employerDao.save(employer);
				return new SuccessResult("Eklendi");
		
	}

}
