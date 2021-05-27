package campProject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import campProject.hrms.business.abstracts.EmployerService;
import campProject.hrms.core.helpers.EmployerHelper;
import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.ErrorResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.core.utilities.results.SuccesDataResult;
import campProject.hrms.core.utilities.results.SuccessResult;
import campProject.hrms.dataAccess.abstracts.EmployerDao;
import campProject.hrms.dataAccess.abstracts.UserDao;
import campProject.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {
	
	private EmployerDao employerDao;
	
	private AuthManager authManager;
	
	
	@Autowired
	 public EmployerManager(EmployerDao employerDao,UserDao userDao,AuthManager authManager) {
		this.employerDao=employerDao;
		this.authManager=authManager;
	
		}
	
	@Override
	public DataResult<List<Employer>> getAll() {
		
		return new SuccesDataResult<List<Employer>>
		(employerDao.findAll(),"Data Listelendi");
	}

	@Override
	public Result add(Employer employer) {
		if (!EmployerHelper.employerNullCheck(employer)) {
			return new ErrorResult("Tüm alanları doldurmalısınız.");
		}else if(!employer.getPassword().equals(employer.getRepeatPassword())) {
			return new ErrorResult("Şifreler Aynı Olmaldır");
		}else if(authManager.emailVerify(employer.getEmail())) {
			return new ErrorResult("Bu email ile kayıtılı kullanıcı zaten var");
		}else {
				employerDao.save(employer);
				return new SuccessResult("Eklendi");
		}
	}

}
