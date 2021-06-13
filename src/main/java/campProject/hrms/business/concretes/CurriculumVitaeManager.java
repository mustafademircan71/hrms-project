package campProject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import campProject.hrms.business.abstracts.CurriculumVitaeService;
import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.core.utilities.results.SuccesDataResult;
import campProject.hrms.core.utilities.results.SuccessResult;
import campProject.hrms.dataAccess.abstracts.CurriculumVitaeDao;
import campProject.hrms.entities.concretes.CurriculumVitae;


@Service
public class CurriculumVitaeManager implements CurriculumVitaeService {
	private CurriculumVitaeDao curriculumVitaeDao;
	
	@Autowired
	public CurriculumVitaeManager(CurriculumVitaeDao curriculumVitaeDao) {
		super();
		this.curriculumVitaeDao = curriculumVitaeDao;
	}

	@Override
	public DataResult<List<CurriculumVitae>> getAll() {
		
		return new SuccesDataResult<List<CurriculumVitae>>
		(this.curriculumVitaeDao.findAll(),"Data Listelendi"); 
	}

	@Override
	public Result add(CurriculumVitae curriculumVitae) {
		
		this.curriculumVitaeDao.save(curriculumVitae);
		return new SuccessResult("Kullanıcı Eklendi");
	}

	@Override
	public DataResult<CurriculumVitae> getById(int id) {
		return new SuccesDataResult<CurriculumVitae>(this.curriculumVitaeDao.getByCvId(id),"Data Listelendi");
	}

	

	

	

}
