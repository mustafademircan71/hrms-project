package campProject.hrms.entities.concretes;


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
@Table(name="curriculum_vitaes")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobSeeker","photos","educationInfos","educationInfos"
	,"expreinces","languages"})
public class CurriculumVitae implements Entities {
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="cv_id")
		private int cvId;
		
		@Column(name="git_hub_address")
		@NotNull(message="Bu Alan Boş Olamaz")
		private String gitHubAddress;
		
		@Column(name="linkedin_address")
		@NotNull(message="Bu Alan Boş Olamaz")
		private String linkedinAddress;
		
		@Column(name="abilities")
		@NotNull(message="Bu Alan Boş Olamaz")
		private String abilities;
		
		@Column(name="cover_letter")
		@NotNull(message="Bu Alan Boş Olamaz")
		private String coverLetter;
		
		@OneToMany(mappedBy="curriculumVitae")
		private List<JobSeeker> jobSeeker;
		
		@OneToMany(mappedBy="curriculumVitae")
		private List<Photo> photos;
		
		@OneToMany(mappedBy="curriculumVitae")
		private List<EducationInfo> educationInfos;
		
		@OneToMany(mappedBy="curriculumVitae")
		private List<Experience> expreinces;
		
		@OneToMany(mappedBy="curriculumVitae")
		private List<Language> languages;
		
		//@ManyToOne(cascade=CascadeType.ALL)
		//@JoinColumn(name="education_id")
		//private EducationInfo educationInfo;
		
		//@ManyToOne(cascade=CascadeType.ALL)
		//@JoinColumn(name="expreience_id")
		//private Experience experience;
		
		//@ManyToOne(cascade=CascadeType.ALL)
		//@JoinColumn(name="language_id")
		//private Language language;
		
	
		
		
		
		
		
		
}
