package ctn.hrms.bussiness.abstracts;

import ctn.hrms.core.utilities.results.Result;
import ctn.hrms.entities.concretes.Technology;

public interface TechnologyService {
	
	Result add(Technology technology);
}
