package campProject.hrms.business.abstracts;

import org.springframework.web.multipart.MultipartFile;

import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.entities.concretes.Photo;

public interface PhotoService {
		Result add(Photo photo,MultipartFile image);
}
