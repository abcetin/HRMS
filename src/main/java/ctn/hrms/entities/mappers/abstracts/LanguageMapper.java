package ctn.hrms.entities.mappers.abstracts;

import java.util.List;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import ctn.hrms.entities.concretes.Language;
import ctn.hrms.entities.dtos.LanguageDto;

@Mapper(componentModel = "spring", uses = Language.class, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface LanguageMapper {

	LanguageDto languageDto(Language language);
	
	Language language(LanguageDto languageDto);
	
	List<LanguageDto> languageDtos(List<Language> languages);
	
}
