package campProject.hrms.business.abstracts;



import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.entities.concretes.User;


public interface UserService {
		Result add(User user);
}
