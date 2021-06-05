package campProject.hrms.entities.concretes;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import campProject.hrms.entities.abstracts.Entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="experiences")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","curriculumVitaes"})
public class Experience implements Entities {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="experience_id")
	private int experienceId;
		
	@Column(name="company_name")
	@NotNull(message="Bu Alan Boş Olamaz")
	private String companyName;
	
	@Column(name="job_start_date")
	@NotNull(message="Bu Alan Boş Olamaz")
	private LocalDate jobStartDate;
	
	@Column(name="job_end_date")
	private LocalDate jobEndDate;
	
	@OneToMany(mappedBy="experience")
	private List<CurriculumVitae> curriculumVitaes;
	
	
}
