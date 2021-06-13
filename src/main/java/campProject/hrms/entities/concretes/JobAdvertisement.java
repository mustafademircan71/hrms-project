package campProject.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import campProject.hrms.entities.abstracts.Entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Job_advertisements")
public class JobAdvertisement implements Entities {
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
		private int id;
		
		@Column(name="job_description")
		private String jobDescription;
		
		@Column(name="max_pay")
		private double maxPay;
		
		@Column(name="min_pay")
		private double minPay;
		
		@Column(name="open_position")
		private int openPostion;
		
		@Column(name="release_date")
		private LocalDate releaseDate;
		
		@Column(name="is_active")
		private boolean isActive;
		
		@Column(name="deadline_date")
		private LocalDate deadlineDate;
		
		@ManyToOne()
		@JoinColumn(name="employer_id")
		private Employer employer;
		
		@ManyToOne()
		@JoinColumn(name="jobPostionId")
		private JobPosition jobPosition;
		
		@ManyToOne()
		@JoinColumn(name="cityId")
		private City city;
}
