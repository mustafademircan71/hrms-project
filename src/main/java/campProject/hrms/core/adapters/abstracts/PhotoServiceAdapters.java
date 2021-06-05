package campProject.hrms.core.adapters.abstracts;





import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import campProject.hrms.core.utilities.results.DataResult;

public interface PhotoServiceAdapters {
		DataResult<Map> imageUpload(MultipartFile imageUrl);
}
