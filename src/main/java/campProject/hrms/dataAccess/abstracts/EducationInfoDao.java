package campProject.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import campProject.hrms.entities.concretes.EducationInfo;

public interface EducationInfoDao extends JpaRepository<EducationInfo, Integer> {
		List<EducationInfo> getByCurriculumVitae_CvId(int id);
}
