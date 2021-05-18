package campProject.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import campProject.hrms.entities.concretes.JobPosition;


public interface JobPostionDao extends JpaRepository<JobPosition, Integer> {

}
