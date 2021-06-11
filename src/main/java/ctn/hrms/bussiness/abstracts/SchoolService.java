package ctn.hrms.bussiness.abstracts;

import java.util.List;

import ctn.hrms.core.utilities.results.DataResult;
import ctn.hrms.core.utilities.results.Result;
import ctn.hrms.entities.concretes.School;

public interface SchoolService {

	Result add(School school);
	DataResult<List<School>> getAllBySorted();
}
