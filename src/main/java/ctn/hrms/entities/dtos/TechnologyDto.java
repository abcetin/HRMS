package ctn.hrms.entities.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TechnologyDto {

	@JsonProperty("id")
	private int id;
	
	@JsonProperty("technology")
	private String technology;
}
