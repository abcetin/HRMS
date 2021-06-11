package ctn.hrms.bussiness.abstracts;

import java.util.List;



import ctn.hrms.core.utilities.results.DataResult;
import ctn.hrms.core.utilities.results.Result;
import ctn.hrms.entities.concretes.CurriculumVitae;
import ctn.hrms.entities.dtos.CurriculumVitaeDto;

public interface CurriculumVitaeService {
 
	Result addCv(CurriculumVitae cv);
	
	DataResult<CurriculumVitaeDto> getCVDetail(int id);
	
	DataResult<List<CurriculumVitae>> getall();
}
