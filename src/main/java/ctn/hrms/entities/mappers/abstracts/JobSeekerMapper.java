package ctn.hrms.entities.mappers.abstracts;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import ctn.hrms.entities.concretes.JobSeeker;
import ctn.hrms.entities.dtos.JobSeekerDto;

@Mapper(componentModel = "spring", uses = JobSeeker.class, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface JobSeekerMapper {
	
	JobSeekerDto jobSeekerDto(JobSeeker jobSeeker);
	
	JobSeeker jobSeeker(JobSeekerDto jobSeekerDto);
}
