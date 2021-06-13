package campProject.hrms.entities.concretes;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
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
@PrimaryKeyJoinColumn(name = "user_id")
@Table(name="employers")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisement"})
public class Employer extends User {
		
		@Column(name="company_name")
		private String companyName;
		
		@Column(name="website")
		private String website;
		
		@Column(name="phone")
		private String phone;
		
		@OneToMany(mappedBy="employer")
		private List<JobAdvertisement> jobAdvertisement;
		
		
}
