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
@Table(name ="job_experience")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobExperience {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name  ="id")
	private int id;
	
	@Column(name  ="workplace_name")
	private String workplaceName;
	
	@Column(name  ="department")
	private String department;
	
	@Column(name  ="starting_date")
	private Date startingDate;
	
	@Column(name  ="leave_date")
	private String leaveDate;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private JobSeeker jobSeeker;
	
	@ManyToOne
	@JsonIgnore
	private CurriculumVitae curriculumVitae;
	
}
