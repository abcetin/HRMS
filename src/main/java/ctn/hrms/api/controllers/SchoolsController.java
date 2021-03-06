package ctn.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ctn.hrms.bussiness.abstracts.SchoolService;
import ctn.hrms.core.utilities.results.DataResult;
import ctn.hrms.core.utilities.results.Result;
import ctn.hrms.entities.concretes.School;

@RestController
@RequestMapping("api/schools/")
public class SchoolsController {

	private SchoolService schoolService;

	@Autowired
	public SchoolsController(SchoolService schoolService) {
		super();
		this.schoolService = schoolService;
	}
	
	@PostMapping("addSchool")
	public Result add(@RequestBody School school) {
		return this.schoolService.add(school);
	}
	
	@GetMapping("getBySortGraduate")
	public DataResult<List<School>> getBySorted(){
		return this.schoolService.getAllBySorted();
	}
	
}
