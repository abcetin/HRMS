package ctn.hrms.entities.mappers.concretes;

import ctn.hrms.entities.concretes.Language;
import ctn.hrms.entities.dtos.LanguageDto;
import ctn.hrms.entities.mappers.abstracts.LanguageMapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class LanguageMapperImpl implements LanguageMapper {

    @Override
    public LanguageDto languageDto(Language language) {
        if ( language == null ) {
            return null;
        }

        LanguageDto languageDto = new LanguageDto();
        languageDto.setId(language.getId());
        languageDto.setLanguage(language.getLanguage());
        languageDto.setLanguageLevel(language.getLanguageLevel());
        return languageDto;
    }

    @Override
    public Language language(LanguageDto languageDto) {
        if ( languageDto == null ) {
            return null;
        }

        Language language = new Language();
        language.setLanguage(languageDto.getLanguage());
        language.setLanguageLevel(languageDto.getLanguageLevel());
        return language;
    }

    @Override
    public List<LanguageDto> languageDtos(List<Language> languages) {
        if ( languages == null ) {
            return null;
        }

        List<LanguageDto> list = new ArrayList<LanguageDto>( languages.size() );
        for ( Language language : languages ) {
            list.add( languageDto( language ) );
        }

        return list;
    }
}
