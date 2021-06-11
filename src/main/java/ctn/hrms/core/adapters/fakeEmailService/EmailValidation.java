package ctn.hrms.core.adapters.fakeEmailService;
	
import org.springframework.stereotype.Service;

import ctn.hrms.core.utilities.results.Result;
import  ctn.hrms.core.utilities.results.SuccessResult;

@Service
public class EmailValidation implements EmailService {

	@Override
	public Result validation(String email) {
		System.out.println("Lütfen Mailinizi Doğrulayınız  : " +email);
		return new SuccessResult("Lütfen Mailinizi Doğrulayınız  : " +email);
	}

}
