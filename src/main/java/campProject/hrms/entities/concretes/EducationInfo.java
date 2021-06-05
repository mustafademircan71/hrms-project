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
@Table(name="education_infos")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","curriculumVitaes"})
public class EducationInfo implements Entities {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="education_id")
	private int educationId;
		
	@Column(name="school_name")
	@NotNull(message="Bu Alan Boş Olamaz")
	private String schoolName;
	
	@Column(name="school_start_date")
	@NotNull(message="Bu Alan Boş Olamaz")
	private LocalDate schoolStartDate;
	
	@Column(name="school_end_date")
	private LocalDate schoolEndDate;
	
	@OneToMany(mappedBy="educationInfo")
	private List<CurriculumVitae> curriculumVitaes; 
	
	//@ManyToMany()
	//@JoinColumn(name="id")
	//private EducationInfo educationInfo;
	
	
	
	
	
	
}
