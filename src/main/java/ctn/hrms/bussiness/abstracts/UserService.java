package ctn.hrms.bussiness.abstracts;

import java.util.List;

import ctn.hrms.core.entities.User;
import ctn.hrms.core.utilities.results.DataResult;
import ctn.hrms.core.utilities.results.Result;

public interface UserService {

	DataResult<List<User>> getAll();
	Result add(User user);
	Result delete(User user);
	
}
