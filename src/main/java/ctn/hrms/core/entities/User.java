package ctn.hrms.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "activated_id")
	private int activatedId;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "password_verify") 
	private String passwordVerify;
	
//	@OneToOne(mappedBy = "user")
//	@PrimaryKeyJoinColumn
//	private JobSeeker jobSeeker;
//	
//	@OneToOne(mappedBy = "user")
//	@PrimaryKeyJoinColumn
//	private Employer employer;
//	
//	@OneToOne(mappedBy = "user")
//	@PrimaryKeyJoinColumn
//	private SystemPersonel personel;
}
