package ctn.hrms.bussiness.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import ctn.hrms.bussiness.abstracts.EmployerService;
import ctn.hrms.core.adapters.fakeEmailService.EmailService;
import ctn.hrms.core.utilities.results.DataResult;
import ctn.hrms.core.utilities.results.ErrorDataResult;
import ctn.hrms.core.utilities.results.ErrorResult;
import ctn.hrms.core.utilities.results.Result;
import ctn.hrms.core.utilities.results.SuccessDataResult;
import ctn.hrms.core.utilities.results.SuccessResult;
import ctn.hrms.dataAccess.abstracts.EmployerDao;
import ctn.hrms.entities.concretes.Employer;
import lombok.var;
import ctn.hrms.bussiness.constans.*;

@Service
public class EmployerManager implements EmployerService{

	private EmployerDao employerDao;
	private EmailService emailService;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao, EmailService emailService) {
		super();
		this.employerDao = employerDao;
		this.emailService = emailService;
	}

	@Override
	public Result register(Employer employer) {
		if(getByEmail(employer.getEmail()).isSuccess() && getByEmailContains(employer.getEmail(), employer.getWebSite()).isSuccess() ) {
			this.emailService.validation(employer.getEmail());
			this.employerDao.save(employer);
			return new SuccessResult(Messages.addedSuccess);
		}
		return new ErrorResult(Messages.addedError);
	}

	@Override
	public Result getByEmailContains(String email, String webSite) {
		String[] splitEmail1 = email.split("@", 2);
		String emailPart1 = splitEmail1[1];
		String[] splitEmail2 = emailPart1.split("\\.",2);
		String newEmail = splitEmail2[0];
		System.out.println(newEmail);

	
		var result =  webSite.matches(".*"+newEmail+".*");
		System.out.println(result);
		if(result) {
			return new SuccessResult();
		}
		System.out.println(Messages.notMatchDomains);
		return new ErrorResult(Messages.notMatchDomains);
	}

	@Override
	public DataResult<List<Employer>> getByEmail(String email) {
		var result = employerDao.getByEmail(email).isEmpty();
		if(result) {
			return new SuccessDataResult<List<Employer>>();
		}
		return new ErrorDataResult<List<Employer>>(Messages.existsEmail);
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),Messages.listed);
	}

}
