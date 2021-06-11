package ctn.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ctn.hrms.bussiness.abstracts.JobExperienceService;
import ctn.hrms.core.utilities.results.DataResult;
import ctn.hrms.core.utilities.results.Result;
import ctn.hrms.entities.concretes.JobExperience;

@RestController
@RequestMapping("api/jobExperiences")
public class JobExperiencesController {

	private JobExperienceService experienceService;

	@Autowired
	public JobExperiencesController(JobExperienceService experienceService) {
		super();
		this.experienceService = experienceService;
	}
	
	@PostMapping("/addJobExperience")
	public Result add(@RequestBody JobExperience experience) {
		return this.experienceService.add(experience);
	}
	
	
	@GetMapping("/getBySortedLeaveDate")
	public DataResult<List<JobExperience>> getBySorted(){
		return this.experienceService.getBySorted();
	}
}
