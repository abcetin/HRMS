package ctn.hrms.entities.mappers.concretes;

import ctn.hrms.entities.concretes.School;
import ctn.hrms.entities.dtos.SchoolDto;
import ctn.hrms.entities.mappers.abstracts.SchoolMapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class SchoolMapperImpl implements SchoolMapper {

    @Override
    public SchoolDto schoolDto(School school) {
        if ( school == null ) {
            return null;
        }

        SchoolDto schoolDto = new SchoolDto();
        schoolDto.setId(school.getId());
        schoolDto.setSchoolName(school.getSchoolName());
        schoolDto.setDepartment(school.getSchoolDepartment());
        schoolDto.setStartingDate(school.getStartingDateSchool());
        schoolDto.setDateOfGraduate(school.getDateOfGraduate());
        return schoolDto;
    }

    @Override
    public School school(SchoolDto schoolDto) {
        if ( schoolDto == null ) {
            return null;
        }

        School school = new School();
        school.setSchoolName(schoolDto.getSchoolName());
        school.setSchoolDepartment(schoolDto.getDepartment());
        school.setStartingDateSchool(schoolDto.getStartingDate());
        school.setDateOfGraduate(schoolDto.getDateOfGraduate());
        return school;
    }

    @Override
    public List<SchoolDto> schoolDtos(List<School> schools) {
        if ( schools == null ) {
            return null;
        }

        List<SchoolDto> list = new ArrayList<SchoolDto>( schools.size() );
        for ( School school : schools ) {
            list.add( schoolDto( school ) );
        }

        return list;
    }
}
