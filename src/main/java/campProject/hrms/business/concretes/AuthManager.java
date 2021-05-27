package campProject.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import campProject.hrms.business.abstracts.AuthService;
import campProject.hrms.core.adapters.abstracts.EmailServices;

import campProject.hrms.dataAccess.abstracts.UserDao;
import campProject.hrms.mernisService.MernisServices;


@Service
public class AuthManager implements AuthService {

	private EmailServices emailServices;
	private UserDao userDao;
	private MernisServices mernisService;
	
	@Autowired
	public AuthManager(EmailServices emailServices,UserDao userDao,MernisServices mernisService) {
		super();
		this.emailServices = emailServices;
		this.userDao=userDao;
		this.mernisService=mernisService;
	}

	@Override
	public  boolean emailVerify(String email) {
		if(!this.emailServices.checkEmail(email)) {
			return false;
		}else if(this.userDao.findByEmail(email)!=null) {
			return false;
		}else{
			return true;
		}
	}

	@Override
	public boolean idntityNoVerify(String IdentityNo) {
		if(!this.mernisService.identityNoCheck(IdentityNo)) {
			return false;
		}else {
			return true;
		}
	}

	@Override
	public boolean domainVerify(String email, String webSite) {
		if(!email.contains("@"+email.substring(email.indexOf("@")+1))) {
			return  false;
		}
		return true;
	}

}
