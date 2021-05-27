package campProject.hrms.core.helpers;

import campProject.hrms.entities.concretes.Employer;

public class EmployerHelper {
			public static boolean employerNullCheck(Employer employer) {
				if (employer.getCompanyName().isEmpty()
						|| employer.getEmail().isEmpty()
						|| employer.getPassword().isEmpty()
						|| employer.getPhone().isEmpty()
						|| employer.getWebsite().isEmpty()) {
					return false;
				}
				return true;
			}
		
			
			
}
