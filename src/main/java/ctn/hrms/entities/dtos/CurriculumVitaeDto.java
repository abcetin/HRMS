package ctn.hrms.entities.dtos;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CurriculumVitaeDto {

	@JsonProperty("id")
	private int id;
	
	@JsonProperty("jobSeeker")
	private JobSeekerDto jobSeekerDto;
	
	@JsonProperty("githubAddress")
	private String githubAddress;
	
	@JsonProperty("linkedinAddress")
	private String linkedinAddress;
	
	@JsonProperty("description")
	private String description;
	
	@JsonProperty("schools")
	private List<SchoolDto> schoolDtos;
	
	@JsonProperty("experiences")
	private List<JobExperienceDto> experienceDtos;
	
	@JsonProperty("languages")
	private List<LanguageDto> languageDtos;
	
	@JsonProperty("technologies")
	private List<TechnologyDto> technologyDtos;
	
	@JsonProperty("images")
	private List<JobSeekerImageDto> imageDtos;
	
}
