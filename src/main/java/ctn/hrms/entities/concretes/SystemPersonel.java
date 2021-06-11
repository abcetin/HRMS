package ctn.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
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
@Table(name = "system_personel")
@PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "id")
public class SystemPersonel extends User{
	

	
	@Column(name = "fist_name")
	private String firstname;
	

	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "department")
	private String department;
	

	
}
