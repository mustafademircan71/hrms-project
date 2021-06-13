package campProject.hrms.entities.concretes;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import campProject.hrms.entities.abstracts.Entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="languages")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","curriculumVitaes"})
public class Language implements Entities{
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="language_id")
		private int languageid;
		
		@Column(name="language")
		@NotNull(message="Bu Alan Boş Olamaz")
		private String Language;
		
		@Column(name="languages_level")
		@NotNull(message="Bu Alan Boş Olamaz")
		private int languageLevel;
		
		@ManyToOne()
		@JoinColumn(name="cvId")
		private CurriculumVitae curriculumVitae;
		
		//@OneToMany(mappedBy="language")
		//private List<CurriculumVitae> curriculumVitaes; 
		
		
}
