package ctn.hrms.entities.dtos;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class JobExperienceDto {

	@JsonProperty("id")
	private int id;
	
	@JsonProperty("workPlaceName")
	private String workPlaceName;
	
	@JsonProperty("department")
	private String department;
	
	@JsonProperty("startingDate")
	private Date startingDate;
	
	@JsonProperty("leaveDate")
	private String leaveDate;
	
}
