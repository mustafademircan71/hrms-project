package campProject.hrms.core.adapters.concretes;


import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import campProject.hrms.core.adapters.abstracts.PhotoServiceAdapters;
import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.ErrorDataResult;
import campProject.hrms.core.utilities.results.SuccesDataResult;


@Service
public class PhotoManagerAdapters implements PhotoServiceAdapters {
	private Cloudinary  coludDinary;

	@Autowired
	public PhotoManagerAdapters() {
		super();
		this.coludDinary = new Cloudinary(ObjectUtils.asMap("cloud_name", "dlkz9szh8",
				"api_key", "386916385284692",
				"api_secret", "cQ_FXYzrPxBRbDvCZw5a4JdGSd0"));
	}

	@Override
	public DataResult<Map> imageUpload(MultipartFile imageUrl) {
		try {
			@SuppressWarnings("unchecked")
			Map<String, String> resultMap=(Map<String, String>) coludDinary.uploader().upload(imageUrl.getBytes(),ObjectUtils.emptyMap());
			return new SuccesDataResult<Map>(resultMap);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new ErrorDataResult<Map>();
	}

	
	


	

}
