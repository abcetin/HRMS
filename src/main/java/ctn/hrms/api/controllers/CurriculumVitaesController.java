package ctn.hrms.api.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ctn.hrms.bussiness.abstracts.CurriculumVitaeService;
import ctn.hrms.core.utilities.results.DataResult;
import ctn.hrms.core.utilities.results.Result;
import ctn.hrms.entities.concretes.CurriculumVitae;
import ctn.hrms.entities.dtos.CurriculumVitaeDto;

@RestController
@RequestMapping(value = "/api/cvs/")
public class CurriculumVitaesController {

	
	private CurriculumVitaeService cvService;

	@Autowired
	public CurriculumVitaesController(CurriculumVitaeService cvService) {
		super();
		this.cvService = cvService;
	}
	
	@GetMapping("getCVDetail")
	public DataResult<CurriculumVitaeDto> getCVDetail(@RequestParam int id){
		return this.cvService.getCVDetail(id);
	}
	
	@PostMapping("addCv")
	public Result addCv(@RequestBody CurriculumVitae cv) {
	  	return this.cvService.addCv(cv);
	}
}
