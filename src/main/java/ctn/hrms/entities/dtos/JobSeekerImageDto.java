package ctn.hrms.entities.dtos;



import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class JobSeekerImageDto {

	@JsonProperty("id")
	private int id;
	
	@JsonProperty("imagePath")
	private String imagePath;
}
