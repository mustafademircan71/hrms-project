package campProject.hrms.entities.concretes;



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

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="photos")

public class Photo implements Entities {
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="photo_id")
		private int photoId;
		
		@Column(name="image_url")
		private String imageUrl;
		
		@ManyToOne()
		@JoinColumn(name="id")
		private CurriculumVitae curriculumVitae;
		
}
