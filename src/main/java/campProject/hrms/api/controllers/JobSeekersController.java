package campProject.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import campProject.hrms.business.abstracts.JobSeekerService;
import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.entities.concretes.JobSeeker;

@RestController
@RequestMapping("/api/jobseekers")
@CrossOrigin
public class JobSeekersController {
		private JobSeekerService jobSeekerService;

		public JobSeekersController(JobSeekerService jobSeekerService) {
			this.jobSeekerService = jobSeekerService;
		}
		
		@GetMapping("/getall")
		public DataResult<List<JobSeeker>> getAll(){
			return jobSeekerService.getAll();
		}
		
		@PostMapping("/add")
		public Result add(@RequestBody JobSeeker jobSeeker) {
			return this.jobSeekerService.add(jobSeeker);
		}
}
