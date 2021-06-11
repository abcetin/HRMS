package ctn.hrms.bussiness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import ctn.hrms.bussiness.abstracts.SchoolService;
import ctn.hrms.bussiness.constans.Messages;
import ctn.hrms.core.utilities.results.DataResult;
import ctn.hrms.core.utilities.results.Result;
import ctn.hrms.core.utilities.results.SuccessDataResult;
import ctn.hrms.core.utilities.results.SuccessResult;
import ctn.hrms.dataAccess.abstracts.SchoolDao;
import ctn.hrms.entities.concretes.School;
import lombok.var;


@Service
public class SchoolManager implements SchoolService {

	private  SchoolDao schoolDao;
	
	@Autowired
	public SchoolManager(SchoolDao schoolDao) {
		super();
		this.schoolDao = schoolDao;
	}

	@Override
	public Result add(School school) {
		var result = school.getDateOfGraduate().isEmpty();
		if(result) {
			school.setDateOfGraduate("Devam Ediyor");
			this.schoolDao.save(school);
			return new SuccessResult(Messages.addedSuccess);
		}
		this.schoolDao.save(school);
		return new SuccessResult(Messages.addedSuccess);
	}

	@Override
	public DataResult<List<School>> getAllBySorted() {
		Sort sort = Sort.by(Sort.Direction.DESC, "dateOfGraduate");
		return new SuccessDataResult<List<School>>(this.schoolDao.findAll(sort));
	}

}
