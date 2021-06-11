package ctn.hrms.core.adapters.fakeEmailService;

import  ctn.hrms.core.utilities.results.Result;

public interface EmailService {
	
	Result validation(String email);
}
