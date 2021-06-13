package campProject.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import campProject.hrms.business.abstracts.EmployerService;
import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.entities.concretes.Employer;

@RestController
@RequestMapping("/api/employers")
@CrossOrigin
public class EmployersController {
		
	private EmployerService employerService;
	
	@Autowired
	public EmployersController(EmployerService employerService) {
		this.employerService=employerService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Employer>> gettAll(){
		return employerService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Employer employer) {
		return this.employerService.add(employer);
	}
}
