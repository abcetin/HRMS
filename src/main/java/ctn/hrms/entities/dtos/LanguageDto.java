package ctn.hrms.entities.dtos;



import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class LanguageDto {

	@JsonProperty("id")
	private int id;
	
	@JsonProperty("language")
	private String language;
	
	@JsonProperty("languageLevel")
	private int 	languageLevel;
	
}
