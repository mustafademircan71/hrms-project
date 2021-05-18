package campProject.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import campProject.hrms.business.abstracts.JobPostionService;
import campProject.hrms.entities.concretes.JobPosition;



@RestController
@RequestMapping("/api/jobpostions")
public class JobPostionController {
		
	private JobPostionService jobPostionService;
	
	@Autowired
	public JobPostionController(JobPostionService jobPostionService) {
		this.jobPostionService=jobPostionService;
	}
	
	@GetMapping("/getall")
	public List<JobPosition> getAll(){
		return this.jobPostionService.getAll();
	}
	
}
