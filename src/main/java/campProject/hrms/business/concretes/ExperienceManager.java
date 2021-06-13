package campProject.hrms.business.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import campProject.hrms.business.abstracts.ExperienceService;
import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.core.utilities.results.SuccesDataResult;
import campProject.hrms.core.utilities.results.SuccessResult;
import campProject.hrms.dataAccess.abstracts.ExperienceDao;
import campProject.hrms.entities.concretes.CurriculumVitae;
import campProject.hrms.entities.concretes.Experience;

@Service
public class ExperienceManager implements ExperienceService {
	
	private ExperienceDao experienceDao; 
	
	@Autowired
	public ExperienceManager(ExperienceDao experienceDao) {
		super();
		this.experienceDao = experienceDao;
	}

	@Override
	public DataResult<List<Experience>> getAll() {
		return new SuccesDataResult<List<Experience>>(this.experienceDao.findAll(),"Data Listelendi");
	}

	@Override
	public Result add(Experience experience) {
		this.experienceDao.save(experience);
		return new SuccessResult("İş Deneyimi Kaydedildi");
	}

	@Override
	public DataResult<List<Experience>> getByCurriculumVitaeId(int id) {
		return new SuccesDataResult<List<Experience>>(this.experienceDao.getByCurriculumVitae_CvId(id));
		
	}

	
	

	
}
