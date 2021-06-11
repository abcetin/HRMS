package ctn.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import ctn.hrms.bussiness.abstracts.JobSeekerImageService;
import ctn.hrms.core.utilities.results.DataResult;
import ctn.hrms.core.utilities.results.Result;
import ctn.hrms.entities.concretes.JobSeeker;
import ctn.hrms.entities.concretes.JobSeekerImage;

@RestController
@RequestMapping("api/jobSeekerImages/")
public class JobSeekerImagesContoroller {

	private JobSeekerImageService imageService;

	@Autowired
	public JobSeekerImagesContoroller(JobSeekerImageService imageService) {
		super();
		this.imageService = imageService;
	}
	
	
	@PostMapping("addImage")
	public Result add(@RequestParam int id, @RequestParam(value = "file") MultipartFile imagePath) {
		JobSeekerImage image = new JobSeekerImage();
		JobSeeker seeker = new JobSeeker();
		seeker.setId(id);
		image.setJobSeeker(seeker);
		return this.imageService.add(image,imagePath);
	}
	
	@GetMapping("getAll")
	public DataResult<List<JobSeekerImage>> getAll(){
		return this.imageService.getAll();
	}
}
