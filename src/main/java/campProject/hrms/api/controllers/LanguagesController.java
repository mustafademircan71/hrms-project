package campProject.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import campProject.hrms.business.abstracts.LanguageService;
import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.entities.concretes.Language;

@RestController
@RequestMapping("/api/language")
public class LanguagesController {
		private LanguageService languageService;
		
		@Autowired
		public LanguagesController(LanguageService languageService) {
			super();
			this.languageService = languageService;
		}
		
		@GetMapping("/getall")
		public DataResult<List<Language>> getAll(){
			return this.languageService.getAll();
		}
		@PostMapping("/add")
		public Result add(@RequestBody Language language) {
			return this.languageService.add(language);
		}
		@GetMapping("/getByCurriculumVitae_CvId")
		public DataResult<List<Language>> getByCurriculumVitae_CvId(int id){
			return this.languageService.getByCurriculumVitae_CvId(id);
		}
}
