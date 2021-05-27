package campProject.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;

import campProject.hrms.business.abstracts.UserService;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.core.utilities.results.SuccessResult;
import campProject.hrms.dataAccess.abstracts.UserDao;
import campProject.hrms.entities.concretes.User;

public class UserManager implements UserService {
	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		this.userDao=userDao;
	}
	
	@Override
	public Result add(User user) {
			userDao.save(user);
			return new SuccessResult("Eklendi");
	}

}
