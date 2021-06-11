package ctn.hrms.bussiness.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import ctn.hrms.core.utilities.results.DataResult;
import ctn.hrms.core.utilities.results.Result;
import ctn.hrms.entities.concretes.JobSeekerImage;

public interface JobSeekerImageService {
	Result add(JobSeekerImage image , MultipartFile imagePath);
	DataResult<List<JobSeekerImage>> getAll();
}
