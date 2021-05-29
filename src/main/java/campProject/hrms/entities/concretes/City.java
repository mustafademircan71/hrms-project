package campProject.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import campProject.hrms.entities.abstracts.Entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="cities")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisement"})
public class City implements Entities {
	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
		private int cityId;
		
		@Column(name="city_name")
		private String cityName;
		
		@OneToMany(mappedBy="city")
		private List<JobAdvertisement> jobAdvertisement;

}
