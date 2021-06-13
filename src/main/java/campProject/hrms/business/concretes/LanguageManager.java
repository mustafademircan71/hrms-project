package campProject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import campProject.hrms.business.abstracts.LanguageService;
import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.core.utilities.results.SuccesDataResult;
import campProject.hrms.core.utilities.results.SuccessResult;
import campProject.hrms.dataAccess.abstracts.LanguageDao;

import campProject.hrms.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {
	private LanguageDao languageDao;
	
	@Autowired
	public LanguageManager(LanguageDao languageDao) {
		super();
		this.languageDao = languageDao;
	}

	@Override
	public DataResult<List<Language>> getAll() {
		return new SuccesDataResult<List<Language>>(this.languageDao.findAll(),"Data Listelendi");
	}

	@Override
	public Result add(Language language) {
		this.languageDao.save(language);
		return new SuccessResult("Dil Bilgisi Eklendi");
	}

	@Override
	public DataResult<List<Language>> getByCurriculumVitae_CvId(int id) {
		return new SuccesDataResult<List<Language>>(this.languageDao.getByCurriculumVitae_CvId(id),"Data Listelendi");
	}

}
