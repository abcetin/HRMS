package ctn.hrms.entities.concretes;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "curriculum_vitaes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurriculumVitae {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "github_address")
	private String githubAddress;
	
	@Column(name = "linkedin_address")
	private String linkedinAdrress;
	
	@Column(name = "description")
	private String description;
	
	
	@OneToOne
	@JoinColumn(name = "job_seeker_id")
	private JobSeeker jobSeeker;
	

	@OneToMany(mappedBy = "curriculumVitae")
	private List<JobExperience> experiences;

	@OneToMany(mappedBy = "curriculumVitae")
	private List<School> schools;
	
	@OneToMany(mappedBy = "curriculumVitae")
	private List<Language> languages;
	
	@OneToMany(mappedBy = "curriculumVitae")
	private List<Technology> technologies;
	
	@OneToMany(mappedBy = "curriculumVitae")
	private List<JobSeekerImage> images;


	
}
