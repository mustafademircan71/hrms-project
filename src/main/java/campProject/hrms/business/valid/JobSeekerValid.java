package campProject.hrms.business.valid;

import campProject.hrms.entities.concretes.JobSeeker;

public class JobSeekerValid {
	public static boolean employerNullCheck(JobSeeker jobSeeker) {
			if (jobSeeker.getFirstName().isEmpty()  ||
				jobSeeker.getLastName().isEmpty()   ||
				jobSeeker.getIdentityNo().isEmpty() 
				) {
				return false;
			}
			return true;
	}
	
}
