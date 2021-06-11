package ctn.hrms.entities.mappers.concretes;

import ctn.hrms.entities.concretes.JobSeeker;
import ctn.hrms.entities.dtos.JobSeekerDto;
import ctn.hrms.entities.mappers.abstracts.JobSeekerMapper;

import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class JobSeekerMapperImpl implements JobSeekerMapper {

    @Override
    public JobSeekerDto jobSeekerDto(JobSeeker jobSeeker) {
        if ( jobSeeker == null ) {
            return null;
        }

        JobSeekerDto jobSeekerDto = new JobSeekerDto();
        jobSeekerDto.setId(jobSeeker.getId());
        jobSeekerDto.setFirstName(jobSeeker.getFirstName());
        jobSeekerDto.setLastName(jobSeeker.getLastName());
        return jobSeekerDto;
    }

    @Override
    public JobSeeker jobSeeker(JobSeekerDto jobSeekerDto) {
        if ( jobSeekerDto == null ) {
            return null;
        }

        JobSeeker jobSeeker = new JobSeeker();
        
        return jobSeeker;
    }
}
