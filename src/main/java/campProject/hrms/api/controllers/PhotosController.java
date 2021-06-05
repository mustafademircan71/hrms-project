package campProject.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


import campProject.hrms.business.abstracts.PhotoService;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.dataAccess.abstracts.JobSeekerDao;
import campProject.hrms.entities.concretes.CurriculumVitae;
import campProject.hrms.entities.concretes.JobSeeker;
import campProject.hrms.entities.concretes.Photo;

@RestController
@RequestMapping("api/photos")
public class PhotosController {
		private PhotoService photoService;
		
	
		
		@Autowired
		public PhotosController(PhotoService photoService) {
			super();
		
			this.photoService = photoService;
		
		}
		
		@PostMapping("/add")
		public Result add(@RequestParam MultipartFile image,@RequestParam int id) {
			CurriculumVitae curriculumVitae=new CurriculumVitae();
			Photo photo=new Photo();
			curriculumVitae.setId(id);
			photo.setCurriculumVitae(curriculumVitae);
			return this.photoService.add(photo, image);
			
		
		}
}
