package ctn.hrms.entities.mappers.abstracts;

import java.util.List;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import ctn.hrms.entities.concretes.JobSeekerImage;
import ctn.hrms.entities.dtos.JobSeekerImageDto;

@Mapper(componentModel = "spring", uses = JobSeekerImage.class, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface JobSeekerImageMapper {

	JobSeekerImageDto imageDto(JobSeekerImage image);
	
	JobSeekerImage image(JobSeekerImageDto  imageDto);
	
	List<JobSeekerImageDto> imageDtos(List<JobSeekerImage> images);
}
