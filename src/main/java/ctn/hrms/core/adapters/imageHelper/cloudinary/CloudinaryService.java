package ctn.hrms.core.adapters.imageHelper.cloudinary;

import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import ctn.hrms.core.utilities.results.DataResult;

public interface CloudinaryService {
		
	DataResult<Map<String, String>> add(MultipartFile imagePath);
}
