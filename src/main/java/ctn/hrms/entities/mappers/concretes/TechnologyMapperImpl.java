package ctn.hrms.entities.mappers.concretes;

import ctn.hrms.entities.concretes.Technology;
import ctn.hrms.entities.dtos.TechnologyDto;
import ctn.hrms.entities.mappers.abstracts.TechnologyMapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class TechnologyMapperImpl implements TechnologyMapper {

    @Override
    public TechnologyDto technologyDto(Technology technology) {
        if ( technology == null ) {
            return null;
        }

        TechnologyDto technologyDto = new TechnologyDto();
        technologyDto.setId(technology.getId());
        technologyDto.setTechnology(technology.getTechnology());
        return technologyDto;
    }

    @Override
    public Technology technology(TechnologyDto technologyDto) {
        if ( technologyDto == null ) {
            return null;
        }

        Technology technology = new Technology();
        technology.setTechnology(technologyDto.getTechnology());
        return technology;
    }

    @Override
    public List<TechnologyDto> technologyDtos(List<Technology> technologies) {
        if ( technologies == null ) {
            return null;
        }

        List<TechnologyDto> list = new ArrayList<TechnologyDto>( technologies.size() );
        for ( Technology technology : technologies ) {
            list.add( technologyDto( technology ) );
        }

        return list;
    }
}
