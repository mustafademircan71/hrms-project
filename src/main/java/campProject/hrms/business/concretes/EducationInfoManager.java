package campProject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import campProject.hrms.business.abstracts.EducationInfoService;
import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.core.utilities.results.SuccesDataResult;
import campProject.hrms.core.utilities.results.SuccessResult;
import campProject.hrms.dataAccess.abstracts.EducationInfoDao;
import campProject.hrms.entities.concretes.EducationInfo;

@Service
public class EducationInfoManager implements EducationInfoService {
	private EducationInfoDao educationInfoDao;
	
	@Autowired
	public EducationInfoManager(EducationInfoDao educationInfoDao) {
		super();
		this.educationInfoDao = educationInfoDao;
	}

	@Override
	public DataResult<List<EducationInfo>> getAll() {
		return new SuccesDataResult<List<EducationInfo>>(this.educationInfoDao.findAll(),"Data Listelendi");
	}

	@Override
	public Result add(EducationInfo educationInfo) {
		this.educationInfoDao.save(educationInfo);
		return new SuccessResult("Eğitim Bilgisi Eklendi");
	}

	@Override
	public DataResult<List<EducationInfo>> getByCurriculumVitae_CvId(int id) {
		return new SuccesDataResult<List<EducationInfo>>(this.educationInfoDao.getByCurriculumVitae_CvId(id));
	}

}
