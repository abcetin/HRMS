package ctn.hrms.bussiness.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ctn.hrms.bussiness.abstracts.TechnologyService;
import ctn.hrms.bussiness.constans.Messages;
import ctn.hrms.core.utilities.results.Result;
import ctn.hrms.core.utilities.results.SuccessResult;
import ctn.hrms.dataAccess.abstracts.TechnologyDao;
import ctn.hrms.entities.concretes.Technology;

@Service
public class TechnolodyManager implements TechnologyService{

	private TechnologyDao technolodyDao;
	
	@Autowired
	public TechnolodyManager(TechnologyDao technolodyDao) {
		super();
		this.technolodyDao = technolodyDao;
	}

	@Override
	public Result add(Technology technology) {
		this.technolodyDao.save(technology);
		return new SuccessResult(Messages.addedSuccess);
	}

}
