package campProject.hrms.entities.concretes;

import javax.persistence.Column;

import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;



import javax.persistence.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;



@Entity
@EqualsAndHashCode(callSuper=true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "user_id")
@Table(name="employers")
public class Employer extends User  {
		
		@Column(name="company_name")
		private String companyName;
		
		@Column(name="website")
		private String website;
		
		@Column(name="phone")
		private String phone;
		
		//@OneToOne(fetch=FetchType.LAZY)
		//@JoinColumn(name="id")
		//private User user;
}
