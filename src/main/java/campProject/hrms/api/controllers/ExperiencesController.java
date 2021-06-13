package campProject.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import campProject.hrms.business.abstracts.ExperienceService;
import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.entities.concretes.Experience;

@RestController
@RequestMapping("/api/experience")
public class ExperiencesController {
		private ExperienceService experinceService;
		
		@Autowired
		public ExperiencesController(ExperienceService experinceService) {
			super();
			this.experinceService = experinceService;
		}
		
		@GetMapping("/getByCurriculumVitaeId")
		public  DataResult<List<Experience>> getByCurriculumVitaeId(int id){
			return this.experinceService.getByCurriculumVitaeId(id);
		}
		
		@GetMapping("/getall")
		public DataResult<List<Experience>> getAll(){
			return this.experinceService.getAll();
		}
		
		@PostMapping("/add")
		public Result add(@RequestBody Experience experience) {
			return this.experinceService.add(experience);
		}
}
