package ctn.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ctn.hrms.bussiness.abstracts.JobSeekerService;
import ctn.hrms.core.utilities.results.DataResult;
import ctn.hrms.core.utilities.results.Result;
import ctn.hrms.entities.concretes.JobSeeker;
import ctn.hrms.entities.dtos.JobSeekerDto;

@RestController
@RequestMapping("/api/jobseekers")
public class JobSeekersController {
	
	private JobSeekerService jobSeekerService;

	@Autowired
	public JobSeekersController(JobSeekerService jobSeekerService) {
		super();
		this.jobSeekerService = jobSeekerService;
	}
	
	@PostMapping("addjobseeker")
	public Result add(@RequestBody JobSeeker jobSeeker) {
		return this.jobSeekerService.add(jobSeeker);
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobSeeker>> getAll(){
		 return this.jobSeekerService.getAll();
	}
	
	@GetMapping("/getJobSeekerDetail")
	public DataResult<JobSeekerDto> getJobSeekerDetail(@RequestParam int id){
		return this.jobSeekerService.getJobSeekerByIdDetail(id);
	}
	

}
