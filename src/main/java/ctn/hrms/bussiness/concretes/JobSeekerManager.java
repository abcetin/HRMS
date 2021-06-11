package ctn.hrms.bussiness.concretes;


import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import ctn.hrms.bussiness.abstracts.JobSeekerService;
import ctn.hrms.bussiness.constans.Messages;
import ctn.hrms.core.adapters.fakeEmailService.EmailService;
import ctn.hrms.core.adapters.mernisServiceAdapter.ValidationService;
import ctn.hrms.core.utilities.results.DataResult;
import ctn.hrms.core.utilities.results.ErrorDataResult;
import ctn.hrms.core.utilities.results.ErrorResult;
import ctn.hrms.core.utilities.results.Result;
import ctn.hrms.core.utilities.results.SuccessDataResult;
import ctn.hrms.core.utilities.results.SuccessResult;
import ctn.hrms.dataAccess.abstracts.JobSeekerDao;
import ctn.hrms.entities.concretes.JobSeeker;
import ctn.hrms.entities.dtos.JobSeekerDto;
import ctn.hrms.entities.mappers.abstracts.JobSeekerMapper;
import lombok.var;





@Service
public class JobSeekerManager implements JobSeekerService {

	private JobSeekerDao jobSeekerDao;
	private ValidationService validationService;
	private EmailService emailService;
	private JobSeekerMapper mapper;
	
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao, ValidationService validationService, EmailService emailService,JobSeekerMapper mapper) {
		this.jobSeekerDao = jobSeekerDao;
		this.validationService =  validationService;
		this.emailService = emailService;
		this.mapper = mapper;
	}
	
	
	@Override
	public Result add(JobSeeker jobSeeker)  {
		
		
	boolean result =  validationService.checkIfRealPerson(Long.parseLong(jobSeeker.getNationalityId()), 
				 jobSeeker.getFirstName().toUpperCase(new Locale("tr")), 
				 jobSeeker.getLastName().toUpperCase(new Locale("tr")), 
				 jobSeeker.getDateOfYear());
	
		if(result && getAllByNationalityId(jobSeeker.getNationalityId()).isSuccess() 
					  && getByEmail(jobSeeker.getEmail()).isSuccess()	) {
			jobSeekerDao.save(jobSeeker);
			emailService.validation(jobSeeker.getEmail());
			return new SuccessResult(Messages.addedSuccess);
		}
			return new ErrorResult(Messages.addedError);
	} 

	@Override
	public DataResult<List<JobSeeker>> getAllByNationalityId(String nationalityId) {
		
		var result = jobSeekerDao.findByNationalityId(nationalityId).isEmpty();
		if(result == false) {
			return new    ErrorDataResult<List<JobSeeker>>(Messages.existsNationalityId);
			
		}
		return new SuccessDataResult<List<JobSeeker>>();
	}

	@Override
	public DataResult<List<JobSeeker>> getByEmail(String email) {
		var result = this.jobSeekerDao.findByEmail(email).isEmpty(); 
		if(result== false ) {
			return new ErrorDataResult<List<JobSeeker>>(Messages.existsEmail);
		}
		return new SuccessDataResult<List<JobSeeker>>();
	}


	@Override
	public DataResult<List<JobSeeker>> getAll() {
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(),Messages.listed);
	}


	@Override
	public DataResult<JobSeekerDto> getJobSeekerByIdDetail(int id) {
		return new SuccessDataResult<JobSeekerDto>(this.mapper.jobSeekerDto(this.jobSeekerDao.getJobSeekerById(id)));
	}
	
	
	
}
