package ctn.hrms.bussiness.abstracts;

import ctn.hrms.core.utilities.results.Result;
import ctn.hrms.entities.concretes.Language;

public interface LanguageService {
	
	Result add(Language language);
}
