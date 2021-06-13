package campProject.hrms.api.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;



import campProject.hrms.business.abstracts.CurriculumVitaeService;
import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.ErrorDataResult;
import campProject.hrms.entities.concretes.CurriculumVitae;

@RestController
@RequestMapping("/api/curriculumVitae")
public class CurriculumVitaesController {
		private CurriculumVitaeService curriculumVitaeService;

		@Autowired
		public CurriculumVitaesController(CurriculumVitaeService curriculumVitaeService) {
			super();
			this.curriculumVitaeService = curriculumVitaeService;
		}
		
		@PostMapping("/add")
		public ResponseEntity<?> add(@Valid @RequestBody CurriculumVitae curriculumVitae){
			return ResponseEntity.ok(curriculumVitaeService.add(curriculumVitae));
		}
		
		@GetMapping("/getall")
		public DataResult<List<CurriculumVitae>> getAll(){
			return this.curriculumVitaeService.getAll();
		}
		
		
		
		
		@ExceptionHandler(MethodArgumentNotValidException.class)
		@ResponseStatus(HttpStatus.BAD_REQUEST)
		public ErrorDataResult<Object> handleValidationException(MethodArgumentNotValidException exceptions){
			Map<String, String> validationErrors=new HashMap<String,String>();
			for(FieldError fieldError: exceptions.getBindingResult().getFieldErrors()) {
				validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());
			}
			
			ErrorDataResult<Object> errors=new ErrorDataResult<Object>(validationErrors,"Doğrulama Hataları");
			return errors;
		}
		
}
