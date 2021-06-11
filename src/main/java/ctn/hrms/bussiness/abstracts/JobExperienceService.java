package ctn.hrms.bussiness.abstracts;

import java.util.List;

import ctn.hrms.core.utilities.results.DataResult;
import ctn.hrms.core.utilities.results.Result;
import ctn.hrms.entities.concretes.JobExperience;

public interface JobExperienceService {

	Result add(JobExperience experience);
	
	DataResult<List<JobExperience>> getBySorted();
}
