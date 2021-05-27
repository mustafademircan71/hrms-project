package campProject.hrms.entities.concretes;





import javax.persistence.Column;

import javax.persistence.Table;

import campProject.hrms.entities.abstracts.Entities;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Entity
@EqualsAndHashCode(callSuper=true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="job_seekers")
public class JobSeeker extends User implements Entities  {
		
	
		
		@Column(name="first_name")
		private String firstName;
		
		@Column(name="last_name")
		private String lastName;
		
		@Column(name="identity_no")
		private String identityNo;
		
		@Column(name="date_of_birth")
		private int dateOfBirth;
}
