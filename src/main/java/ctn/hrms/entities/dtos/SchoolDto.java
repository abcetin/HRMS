package ctn.hrms.entities.dtos;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class SchoolDto {

	@JsonProperty("id")
	private int id;
	
	@JsonProperty("schoolName")
	private String schoolName;
	
	@JsonProperty("department")
	private String department;
	
	@JsonProperty("startingDate")
	private Date startingDate;
	
	@JsonProperty("dateOfGraduate")
	private String dateOfGraduate;
}
