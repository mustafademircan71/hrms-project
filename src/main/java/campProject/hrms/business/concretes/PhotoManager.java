package campProject.hrms.business.concretes;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import campProject.hrms.business.abstracts.PhotoService;
import campProject.hrms.core.adapters.abstracts.PhotoServiceAdapters;
import campProject.hrms.core.utilities.results.Result;

import campProject.hrms.core.utilities.results.SuccessResult;
import campProject.hrms.dataAccess.abstracts.PhotoDao;
import campProject.hrms.entities.concretes.Photo;

@Service
public class PhotoManager implements PhotoService {
	
	private PhotoDao photoDao;
	private PhotoServiceAdapters photoServiceAdapters;
	
	@Autowired
	public PhotoManager(PhotoDao photoDao, PhotoServiceAdapters photoServiceAdapters) {
		super();
		this.photoDao = photoDao;
		this.photoServiceAdapters = photoServiceAdapters;

	}

	@Override
	public Result add(Photo photo, MultipartFile image) {
		Map<String,String> uploadPhoto=this.photoServiceAdapters.imageUpload(image).getData();
		photo.setImageUrl(uploadPhoto.get("url"));
		this.photoDao.save(photo);
		return new SuccessResult("Fotoğraf Eklendi");
	}


	
	

	
	
}
