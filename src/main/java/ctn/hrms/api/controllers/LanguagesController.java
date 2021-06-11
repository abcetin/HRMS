package ctn.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ctn.hrms.bussiness.abstracts.LanguageService;
import ctn.hrms.core.utilities.results.Result;
import ctn.hrms.entities.concretes.Language;

@RestController
@RequestMapping("api/languages/")
public class LanguagesController {

	private LanguageService languageService;

	@Autowired
	public LanguagesController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}
	
	@PostMapping("addLanguage")
	public Result add(Language language) {
		return this.languageService.add(language);
	}
	
	
}
