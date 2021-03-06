package campProject.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;

import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import campProject.hrms.entities.abstracts.Entities;
import javax.persistence.Entity;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Entity
@Data
@EqualsAndHashCode(callSuper=true)
@AllArgsConstructor
@NoArgsConstructor
@Table(name="job_seekers")
@PrimaryKeyJoinColumn(name = "user_id")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","photos",})
public class JobSeeker extends User implements Entities  {
		
		@Column(name="first_name")
		private String firstName;
		
		@Column(name="last_name")
		private String lastName;
		
		@Column(name="identity_no")
		private String identityNo;
		
		@Column(name="date_of_birth")
		private LocalDate dateOfBirth;
		
		@ManyToOne()
		@JoinColumn(name="id")
		private CurriculumVitae curriculumVitae;
		
		
		
	
		
	
}
