package ctn.hrms.entities.mappers.concretes;
import ctn.hrms.entities.concretes.JobSeekerImage;
import ctn.hrms.entities.dtos.JobSeekerImageDto;
import ctn.hrms.entities.mappers.abstracts.JobSeekerImageMapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class JobSeekerImageMapperImpl implements JobSeekerImageMapper {

    @Override
    public JobSeekerImageDto imageDto(JobSeekerImage image) {
        if ( image == null ) {
            return null;
        }

        JobSeekerImageDto jobSeekerImageDto = new JobSeekerImageDto();
        jobSeekerImageDto.setId(image.getId());
        jobSeekerImageDto.setImagePath(image.getImagePath());
        return jobSeekerImageDto;
    }

    @Override
    public JobSeekerImage image(JobSeekerImageDto imageDto) {
        if ( imageDto == null ) {
            return null;
        }

        JobSeekerImage jobSeekerImage = new JobSeekerImage();
        jobSeekerImage.setImagePath(imageDto.getImagePath());
        return jobSeekerImage;
    }

    @Override
    public List<JobSeekerImageDto> imageDtos(List<JobSeekerImage> images) {
        if ( images == null ) {
            return null;
        }

        List<JobSeekerImageDto> list = new ArrayList<JobSeekerImageDto>( images.size() );
        for ( JobSeekerImage jobSeekerImage : images ) {
            list.add( imageDto( jobSeekerImage ) );
        }

        return list;
    }
}
