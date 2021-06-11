package ctn.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "schools")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class School {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	
	@Column(name = "school_name")
	private String schoolName;
	
	@Column(name = "department")
	private String schoolDepartment;
	
	@Column(name = "starting_date")
	private Date startingDateSchool;
	
	@Column(name = "date_of_graduate")
	private String dateOfGraduate;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private JobSeeker jobSeeker;
	
	@ManyToOne
	@JsonIgnore
	private CurriculumVitae curriculumVitae;
}
