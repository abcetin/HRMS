package ctn.hrms.entities.mappers.abstracts;

import java.util.List;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import ctn.hrms.entities.concretes.School;
import ctn.hrms.entities.dtos.SchoolDto;

@Mapper(componentModel = "spring", uses = School.class, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface SchoolMapper {
	
	SchoolDto schoolDto(School school);

	School school(SchoolDto schoolDto);
	
	List<SchoolDto> schoolDtos(List<School> schools);
	
}
