package ctn.hrms.bussiness.concretes;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import ctn.hrms.bussiness.abstracts.CurriculumVitaeService;
import ctn.hrms.core.utilities.results.DataResult;
import ctn.hrms.core.utilities.results.Result;
import ctn.hrms.core.utilities.results.SuccessDataResult;
import ctn.hrms.core.utilities.results.SuccessResult;
import ctn.hrms.dataAccess.abstracts.CurriculumVitaeDao;
import ctn.hrms.entities.concretes.CurriculumVitae;
import ctn.hrms.entities.dtos.CurriculumVitaeDto;
import ctn.hrms.entities.mappers.abstracts.CurriculumVitaeMapper;
import ctn.hrms.bussiness.constans.*;

@Service
public class CurriculumVitaeManager  implements CurriculumVitaeService{

	private CurriculumVitaeDao cvDao;
	private CurriculumVitaeMapper mapper;
	
	@Autowired
	public CurriculumVitaeManager(CurriculumVitaeDao cvDao,CurriculumVitaeMapper mapper) {
		super();
		this.cvDao = cvDao;
		this.mapper = mapper;
	}

	@Transactional
	@Override
	public DataResult<CurriculumVitaeDto> getCVDetail(int id) {
		return new SuccessDataResult<CurriculumVitaeDto>(this.mapper.curriculumVitaeDto(this.cvDao.getByJobSeeker_Id(id)));
		
	}

	@Override
	public DataResult<List<CurriculumVitae>> getall() {
		return new SuccessDataResult<List<CurriculumVitae>>(cvDao.findAll());
	}

	@Override
	public Result addCv(CurriculumVitae cv) {
		this.cvDao.save(cv);
		return new SuccessResult(Messages.addedSuccess);
	}

}
