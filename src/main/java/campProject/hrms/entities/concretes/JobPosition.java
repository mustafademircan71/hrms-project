package campProject.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import campProject.hrms.entities.abstracts.Entity;
import lombok.Data;

@javax.persistence.Entity
@Data
@Table(name="job_position")
public class JobPosition implements Entity {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="position_name")
	private String positionName;
	
	
}
