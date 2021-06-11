package ctn.hrms.entities.mappers.abstracts;

import java.util.List;


import org.mapstruct.Mapper;

import ctn.hrms.entities.concretes.CurriculumVitae;
import ctn.hrms.entities.dtos.CurriculumVitaeDto;


@Mapper(componentModel = "spring")
public interface CurriculumVitaeMapper {

	CurriculumVitaeDto curriculumVitaeDto(CurriculumVitae curriculumVitae);
	
	CurriculumVitae curriculumVitae(CurriculumVitaeDto curriculumVitaeDto);
	
	List<CurriculumVitaeDto> curriculumVitaeDtos(List<CurriculumVitae> curriculumVitaes);
}
