package ctn.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ctn.hrms.bussiness.abstracts.JobPositionService;
import ctn.hrms.core.utilities.results.DataResult;
import ctn.hrms.core.utilities.results.Result;
import ctn.hrms.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/jobPositions")
public class JobPositionsController {

	private JobPositionService jobPositionServce;
	
	@Autowired
	public JobPositionsController(JobPositionService jobPositionServce) {
		super();
		this.jobPositionServce = jobPositionServce;
	}

	@GetMapping("/getall")
	public DataResult<List<JobPosition>> getAll(){
		 return this.jobPositionServce.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobPosition jobPosition){
		  return this.jobPositionServce.add(jobPosition);
	}
}
