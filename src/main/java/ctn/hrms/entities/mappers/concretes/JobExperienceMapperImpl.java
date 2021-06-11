package ctn.hrms.entities.mappers.concretes;

import ctn.hrms.entities.concretes.JobExperience;
import ctn.hrms.entities.dtos.JobExperienceDto;
import ctn.hrms.entities.mappers.abstracts.JobExperienceMapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class JobExperienceMapperImpl implements JobExperienceMapper {

    @Override
    public JobExperienceDto experienceDto(JobExperience experience) {
        if ( experience == null ) {
            return null;
        }

        JobExperienceDto jobExperienceDto = new JobExperienceDto();
        jobExperienceDto.setId(experience.getId());
        jobExperienceDto.setWorkPlaceName(experience.getWorkplaceName());
        jobExperienceDto.setDepartment(experience.getDepartment());
        jobExperienceDto.setStartingDate(experience.getStartingDate());
        jobExperienceDto.setLeaveDate(experience.getLeaveDate());
        
        return jobExperienceDto;
    }

    @Override
    public JobExperience jobExperience(JobExperienceDto experienceDto) {
        if ( experienceDto == null ) {
            return null;
        }

        JobExperience jobExperience = new JobExperience();
        
        jobExperience.setWorkplaceName(experienceDto.getWorkPlaceName());
        jobExperience.setDepartment(experienceDto.getDepartment());
        jobExperience.setStartingDate(experienceDto.getStartingDate());
        jobExperience.setLeaveDate(experienceDto.getLeaveDate());
        return jobExperience;
        
    }

    @Override
    public List<JobExperienceDto> experienceDtos(List<JobExperience> experiences) {
        if ( experiences == null ) {
            return null;
        }

        List<JobExperienceDto> list = new ArrayList<JobExperienceDto>( experiences.size() );
        for ( JobExperience jobExperience : experiences ) {
            list.add( experienceDto( jobExperience ) );
        }

        return list;
    }
}
