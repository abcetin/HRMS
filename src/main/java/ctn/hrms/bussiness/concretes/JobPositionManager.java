package ctn.hrms.bussiness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ctn.hrms.bussiness.abstracts.JobPositionService;
import ctn.hrms.bussiness.constans.Messages;
import ctn.hrms.core.utilities.results.DataResult;
import ctn.hrms.core.utilities.results.Result;
import ctn.hrms.core.utilities.results.SuccessDataResult;
import ctn.hrms.core.utilities.results.SuccessResult;
import ctn.hrms.dataAccess.abstracts.JobPositionDao;
import ctn.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService{

	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {

		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public DataResult<List<JobPosition>>getAll() {
		
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll() ,Messages.listed);
	}

	@Override
	public Result add(JobPosition jobPosition) {
		this.jobPositionDao.save(jobPosition);
		return new SuccessResult(Messages.addedSuccess);
	}

	
	
}
