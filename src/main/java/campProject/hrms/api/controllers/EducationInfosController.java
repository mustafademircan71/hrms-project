package campProject.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import campProject.hrms.business.abstracts.EducationInfoService;
import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.entities.concretes.EducationInfo;

@RestController
@RequestMapping("/api/educationInfo")
public class EducationInfosController {
		private EducationInfoService educationInfoService;
		
		@Autowired
		public EducationInfosController(EducationInfoService educationInfoService) {
			super();
			this.educationInfoService = educationInfoService;
		}
		
		@GetMapping("/getall")
		public DataResult<List<EducationInfo>> getAll(){
			return educationInfoService.getAll();
		}
		
		@PostMapping("/add")
		public Result add(@RequestBody EducationInfo educationInfo) {
			return this.educationInfoService.add(educationInfo);
		}
		
		@GetMapping("/getByCurriculumVitae_CvId")
		public DataResult<List<EducationInfo>> getByCurriculumVitae_CvId(int id){
			return this.educationInfoService.getByCurriculumVitae_CvId(id);
		}

}
