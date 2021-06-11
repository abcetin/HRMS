package ctn.hrms.core.adapters.imageHelper.cloudinary;

import java.io.IOException;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import ctn.hrms.core.utilities.results.DataResult;
import ctn.hrms.core.utilities.results.ErrorDataResult;
import ctn.hrms.core.utilities.results.SuccessDataResult;



@Service
public class CloudinaryManager  implements CloudinaryService{

	private Cloudinary cloudinary;
	public CloudinaryManager() {
		this.cloudinary=new Cloudinary(ObjectUtils.asMap(
				"cloud_name", "dfr51bq4u",
				"api_key", "827997972234896",
				"api_secret", "tqgFsHueyjCMWn_PukCTdOeJWuY"));}

	@Override
	public DataResult<Map<String, String>> add(MultipartFile file) {
		try {
			@SuppressWarnings("unchecked")
			Map<String, String> cloudinaryUploader =  this.cloudinary.uploader().upload(file.getBytes(), ObjectUtils.emptyMap());
			return new SuccessDataResult<Map<String, String>>(cloudinaryUploader);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return new ErrorDataResult<Map<String, String>>();
	}

}
