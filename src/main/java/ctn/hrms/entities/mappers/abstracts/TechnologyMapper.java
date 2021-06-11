package ctn.hrms.entities.mappers.abstracts;

import java.util.List;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import ctn.hrms.entities.concretes.Technology;
import ctn.hrms.entities.dtos.TechnologyDto;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface TechnologyMapper {
	
	TechnologyDto technologyDto(Technology technology);
	
	Technology technology(TechnologyDto  technologyDto);
	
	List<TechnologyDto> technologyDtos(List<Technology> technologies);

}
