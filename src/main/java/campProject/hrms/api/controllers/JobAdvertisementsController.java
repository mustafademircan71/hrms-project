package campProject.hrms.api.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import campProject.hrms.business.abstracts.JobAdvertisementService;
import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/jobAdvertisement")
public class JobAdvertisementsController {
		
	private JobAdvertisementService jobAdvertisementService;
	
	@Autowired
	public JobAdvertisementsController(JobAdvertisementService jobAdvertisementService) {
		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<JobAdvertisement>> getAll(){
			return this.jobAdvertisementService.getAll();
			
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
		return this.jobAdvertisementService.add(jobAdvertisement);
	}
	@GetMapping("/getAllIsActive")
	public DataResult<List<JobAdvertisement>> getAllIsActive(){
		return this.jobAdvertisementService.getAllIsActive();
	}
	@GetMapping("/getAllDateAsc")
	public DataResult<List<JobAdvertisement>> getAllDateAsc(){
		return this.jobAdvertisementService.getAllDate();
	}
	@GetMapping("/getAllEmployers")
	public DataResult<List<JobAdvertisement>> getAllEmployers(int UserId){
		return this.jobAdvertisementService.getByEmployer_Id(UserId);
	}
	
	@GetMapping("/getById")
	public DataResult<JobAdvertisement> getById(int id) {
		return this.jobAdvertisementService.getById(id);
	}
	@PostMapping("/isActiveUpdate")
	public Result isActiveUpdate(@RequestParam int id, boolean isActive) {
		return this.jobAdvertisementService.IsActiveUpdate(id, isActive);
	}
	
}
