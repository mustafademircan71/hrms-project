package campProject.hrms.core.adapters.concretes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import campProject.hrms.core.adapters.abstracts.EmailServices;
import campProject.hrms.emailService.EmailService;

@Service
public class EmailManager implements EmailServices {
	private EmailService emailService;
	
	@Autowired
	public EmailManager(EmailService emailService) {
		super();
		this.emailService = emailService;
	}


	@Override
	public boolean checkEmail(String email) {
		
		return this.emailService.emailCheck(email);
	}
	 
	

		
}
