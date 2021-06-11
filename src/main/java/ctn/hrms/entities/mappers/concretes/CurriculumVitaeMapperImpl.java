package ctn.hrms.entities.mappers.concretes;

import ctn.hrms.entities.concretes.CurriculumVitae;
import ctn.hrms.entities.dtos.CurriculumVitaeDto;
import ctn.hrms.entities.mappers.abstracts.CurriculumVitaeMapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class CurriculumVitaeMapperImpl implements CurriculumVitaeMapper {

	private JobSeekerMapperImpl jobSeeker;
	private JobExperienceMapperImpl experience;
	private JobSeekerImageMapperImpl image;
	private LanguageMapperImpl language;
	private SchoolMapperImpl school;
	private TechnologyMapperImpl technology;
	
    public CurriculumVitaeMapperImpl(JobSeekerMapperImpl jobSeeker, JobExperienceMapperImpl experience,
			JobSeekerImageMapperImpl image, LanguageMapperImpl language, SchoolMapperImpl school,
			TechnologyMapperImpl technology) {
		super();
		this.jobSeeker = jobSeeker;
		this.experience = experience;
		this.image = image;
		this.language = language;
		this.school = school;
		this.technology = technology;
	}

	@Override
    public CurriculumVitaeDto curriculumVitaeDto(CurriculumVitae curriculumVitae) {
        if ( curriculumVitae == null ) {
            return null;
        }
        CurriculumVitaeDto curriculumVitaeDto = new CurriculumVitaeDto();
        
                   
        curriculumVitaeDto.setId(curriculumVitae.getId());
        curriculumVitaeDto.setGithubAddress(curriculumVitae.getGithubAddress());
        curriculumVitaeDto.setLinkedinAddress(curriculumVitae.getLinkedinAdrress());
        curriculumVitaeDto.setDescription(curriculumVitae.getDescription());
        curriculumVitaeDto.setJobSeekerDto(this.jobSeeker.jobSeekerDto(curriculumVitae.getJobSeeker()));
        curriculumVitaeDto.setExperienceDtos(this.experience.experienceDtos(curriculumVitae.getExperiences()));
        curriculumVitaeDto.setSchoolDtos(this.school.schoolDtos(curriculumVitae.getSchools()));
        curriculumVitaeDto.setLanguageDtos(this.language.languageDtos(curriculumVitae.getLanguages()));
        curriculumVitaeDto.setTechnologyDtos(this.technology.technologyDtos(curriculumVitae.getTechnologies()));
        curriculumVitaeDto.setImageDtos(this.image.imageDtos(curriculumVitae.getImages()));
        return curriculumVitaeDto;
    }

    @Override
    public CurriculumVitae curriculumVitae(CurriculumVitaeDto curriculumVitaeDto) {
        if ( curriculumVitaeDto == null ) {
            return null;
        }

        CurriculumVitae curriculumVitae = new CurriculumVitae();

        return curriculumVitae;
    }

    @Override
    public List<CurriculumVitaeDto> curriculumVitaeDtos(List<CurriculumVitae> curriculumVitaes) {
        if ( curriculumVitaes == null ) {
            return null;
        }

        List<CurriculumVitaeDto> list = new ArrayList<CurriculumVitaeDto>( curriculumVitaes.size() );
        for ( CurriculumVitae curriculumVitae : curriculumVitaes ) {
            list.add( curriculumVitaeDto( curriculumVitae ) );
        }

        return list;
    }
}
