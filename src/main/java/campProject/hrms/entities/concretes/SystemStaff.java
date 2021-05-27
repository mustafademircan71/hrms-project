package campProject.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.Table;

import campProject.hrms.entities.abstracts.Entities;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="system_staff")
public class SystemStaff  implements Entities {
	
	@Id
	@GeneratedValue
	@Column(name="user_id")
	private int userId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
}
