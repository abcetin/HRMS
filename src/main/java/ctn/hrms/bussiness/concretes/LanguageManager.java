package ctn.hrms.bussiness.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ctn.hrms.bussiness.abstracts.LanguageService;
import ctn.hrms.bussiness.constans.Messages;
import ctn.hrms.core.utilities.results.Result;
import ctn.hrms.core.utilities.results.SuccessResult;
import ctn.hrms.dataAccess.abstracts.LanguageDao;
import ctn.hrms.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {

	private LanguageDao languageDao;
	
	@Autowired
	public LanguageManager(LanguageDao languageDao) {
		super();
		this.languageDao = languageDao;
	}

	@Override
	public Result add(Language language) {
		this.languageDao.save(language);
		return new SuccessResult(Messages.addedSuccess);
	}

}
