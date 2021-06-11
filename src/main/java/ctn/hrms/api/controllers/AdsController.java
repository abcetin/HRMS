package ctn.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ctn.hrms.bussiness.abstracts.AdService;
import ctn.hrms.core.utilities.results.DataResult;
import ctn.hrms.core.utilities.results.Result;
import ctn.hrms.entities.concretes.Ad;

@RestController
@RequestMapping("/api/ads")
public class AdsController {
	
	private AdService adService;
	
	@Autowired
	public AdsController(AdService adService) {
		super();
		this.adService = adService;
	}

	@GetMapping("/getall")
	public DataResult<List<Ad>> getAll(){
		return this.adService.getAll();
	}
	
	@GetMapping("/getBySortedDate")
	public DataResult<List<Ad>> getBySortedDate(){
		return this.adService.getBySorted();
	}
	
	@GetMapping("/getByEmployerId")
	public DataResult<List<Ad>> getByEmployerId(@RequestParam int id){
		return this.adService.getByEmployerId(id);
	}
	
	@GetMapping("/changeActivity")
	public Result changeActivity(@RequestParam int id, @RequestParam boolean activity){
		return this.adService.changeActivity(id, activity);
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Ad ad) {
		return this.adService.add(ad);
	}

}
