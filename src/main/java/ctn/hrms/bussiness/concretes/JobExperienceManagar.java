package ctn.hrms.bussiness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import ctn.hrms.bussiness.abstracts.JobExperienceService;
import ctn.hrms.bussiness.constans.Messages;
import ctn.hrms.core.utilities.results.DataResult;
import ctn.hrms.core.utilities.results.Result;
import ctn.hrms.core.utilities.results.SuccessDataResult;
import ctn.hrms.core.utilities.results.SuccessResult;
import ctn.hrms.dataAccess.abstracts.JobExperienceDao;
import ctn.hrms.entities.concretes.JobExperience;
import lombok.var;

@Service
public class JobExperienceManagar implements JobExperienceService {

	private JobExperienceDao experienceDao;
	
	@Autowired
	public JobExperienceManagar(JobExperienceDao experienceDao) {
		super();
		this.experienceDao = experienceDao;
	}

	@Override
	public Result add(JobExperience experience) {
		var result = experience.getLeaveDate().isEmpty();
		if(result) {
			experience.setLeaveDate("Devam Ediyor");
			this.experienceDao.save(experience);
			return new SuccessResult(Messages.addedSuccess);
		}else {
			this.experienceDao.save(experience);
			return new SuccessResult(Messages.addedSuccess);
		}
	}

	@Override
	public DataResult<List<JobExperience>> getBySorted() {
		Sort sort = Sort.by(Sort.Direction.DESC,"leaveDate");
		return new SuccessDataResult<List<JobExperience>>(this.experienceDao.findAll(sort),Messages.listed);
	}

	
}
