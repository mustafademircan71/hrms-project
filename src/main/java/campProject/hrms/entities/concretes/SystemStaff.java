package campProject.hrms.entities.concretes;

import javax.persistence.Column;

import javax.persistence.Table;

import campProject.hrms.entities.abstracts.Entities;
import javax.persistence.Entity;
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
@Table(name="system_staff")
@PrimaryKeyJoinColumn(name = "user_id")
public class SystemStaff extends User implements Entities  {
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	
	
	
	
}
