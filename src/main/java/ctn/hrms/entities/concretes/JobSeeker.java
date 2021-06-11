package ctn.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.JoinColumn;
//import javax.persistence.MapsId;
//import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import ctn.hrms.core.entities.User;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
 
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Entity  
@Table(name = "job_seekers")
@PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "id")
public class JobSeeker  extends User{

	@Column( name ="first_name")
	private String firstName;
 
	@Column( name ="last_name") 
	private String lastName;
	
	@Column( name ="nationality_id")
	private String nationalityId;
	
	@Column( name ="date_of_year")
	private int dateOfYear; 
	
	



}
