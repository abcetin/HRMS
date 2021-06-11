package ctn.hrms.bussiness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import ctn.hrms.bussiness.abstracts.AdService;
import ctn.hrms.bussiness.constans.Messages;
import ctn.hrms.core.utilities.results.DataResult;
import ctn.hrms.core.utilities.results.ErrorDataResult;
import ctn.hrms.core.utilities.results.ErrorResult;
import ctn.hrms.core.utilities.results.Result;
import ctn.hrms.core.utilities.results.SuccessDataResult;
import ctn.hrms.core.utilities.results.SuccessResult;
import ctn.hrms.dataAccess.abstracts.AdDao;
import ctn.hrms.entities.concretes.Ad;
import lombok.var;

@Service
public class AdManager implements AdService {

	private AdDao adDao;
	
	@Autowired
	public AdManager(AdDao adDao) {
		super();
		this.adDao = adDao;
	}

	@Override
	public DataResult<List<Ad>> getAll() {
		return new SuccessDataResult<List<Ad>>(this.adDao.findAll(),Messages.listed);
	}

	@Override
	public DataResult<List<Ad>> getBySorted() {
		Sort sort = Sort.by(Sort.Direction.DESC,"relaseDate");
		return new SuccessDataResult<List<Ad>>(this.adDao.findAll(sort),Messages.listed);
				
	}

	@Override
	public DataResult<List<Ad>> getByEmployerId(int id) {
		var result = this.adDao.getByEmployerId(id);
		if(result.isEmpty()) {
			return new ErrorDataResult<List<Ad>>(Messages.notListed);
		}
		return new SuccessDataResult<List<Ad>>(this.adDao.getByEmployerId(id),Messages.listed);
	}

	@Override
	public Result add(Ad ad) {
		this.adDao.save(ad);
		return new SuccessResult(Messages.addedSuccess);
	}

	@Override
	public Result changeActivity(int id,  boolean activity) {
		var ad = this.adDao.findById(id);
		
		if(ad.isEmpty()) {
			return new ErrorResult(Messages.notFindAdvert);
		}
		ad.get().setActivated(activity);
		this.adDao.saveAndFlush(ad.get());
		return new SuccessResult(Messages.changeActivity);
	}

}
