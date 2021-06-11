package ctn.hrms.bussiness.abstracts;

import java.util.List;

import ctn.hrms.core.utilities.results.DataResult;
import ctn.hrms.core.utilities.results.Result;
import ctn.hrms.entities.concretes.JobSeeker;
import ctn.hrms.entities.dtos.JobSeekerDto;

public interface JobSeekerService {

	DataResult<List<JobSeeker>> getAll();
	DataResult<List<JobSeeker>> getAllByNationalityId(String nationalityId);
	DataResult<List<JobSeeker>> getByEmail(String email);
	DataResult<JobSeekerDto> getJobSeekerByIdDetail(int id);
	Result add(JobSeeker jobSeeker);
	
}
