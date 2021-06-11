package ctn.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ctn.hrms.bussiness.abstracts.TechnologyService;
import ctn.hrms.core.utilities.results.Result;
import ctn.hrms.entities.concretes.Technology;

@RestController
@RequestMapping("api/technologies/")
public class TechnologiesController {

	private TechnologyService technologyService;

	@Autowired
	public TechnologiesController(TechnologyService technologyService) {
		super();
		this.technologyService = technologyService;
	}
	
	@PostMapping("addTechnology")
	public Result add(Technology technology) {
		return this.technologyService.add(technology);
	}
	
}
