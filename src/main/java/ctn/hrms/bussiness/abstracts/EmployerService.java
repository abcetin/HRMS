package ctn.hrms.bussiness.abstracts;

import java.util.List;

import ctn.hrms.core.utilities.results.DataResult;
import ctn.hrms.core.utilities.results.Result;
import ctn.hrms.entities.concretes.Employer;

public interface EmployerService {
	Result register(Employer employer);
	Result getByEmailContains(String email, String webSite);
	DataResult<List<Employer>> getByEmail(String email);
	DataResult<List<Employer>> getAll();
}
