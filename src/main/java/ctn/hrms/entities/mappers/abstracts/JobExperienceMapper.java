package ctn.hrms.entities.mappers.abstracts;

import java.util.List;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import ctn.hrms.entities.concretes.JobExperience;
import ctn.hrms.entities.dtos.JobExperienceDto;

@Mapper(componentModel = "spring", uses = JobExperience.class, injectionStrategy = InjectionStrategy.CONSTRUCTOR )
public interface JobExperienceMapper {

	JobExperienceDto experienceDto(JobExperience experience);
	
	JobExperience jobExperience(JobExperienceDto experienceDto);
	
	List<JobExperienceDto> experienceDtos(List<JobExperience> experiences);
	
}
