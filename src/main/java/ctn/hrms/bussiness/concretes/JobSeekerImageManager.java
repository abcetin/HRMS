package ctn.hrms.bussiness.concretes;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import ctn.hrms.bussiness.abstracts.JobSeekerImageService;
import ctn.hrms.bussiness.constans.Messages;
import ctn.hrms.core.adapters.imageHelper.cloudinary.CloudinaryService;
import ctn.hrms.core.utilities.results.DataResult;
import ctn.hrms.core.utilities.results.Result;
import ctn.hrms.core.utilities.results.SuccessDataResult;
import ctn.hrms.core.utilities.results.SuccessResult;
import ctn.hrms.dataAccess.abstracts.JobSeekerImageDao;
import ctn.hrms.entities.concretes.JobSeekerImage;


@Service
public class JobSeekerImageManager implements JobSeekerImageService {

	private JobSeekerImageDao imageDao;
	private CloudinaryService cloudinary;
	
	@Autowired
	public JobSeekerImageManager(JobSeekerImageDao imageDao, CloudinaryService cloudinary) {
		super();
		this.imageDao = imageDao;
		this.cloudinary = cloudinary;
	}

	@Override
	public Result add(JobSeekerImage image , MultipartFile imagePath) {
		Map<String,String> path=(Map<String,String>)this.cloudinary.add(imagePath).getData();
		System.out.println(path.get("url"));
		image.setImagePath(path.get("url"));
		this.imageDao.save(image);
		return new SuccessResult(Messages.addedSuccess);
	}

	@Override
	public DataResult<List<JobSeekerImage>> getAll() {
		return new SuccessDataResult<List<JobSeekerImage>>(this.imageDao.findAll());
	}
	
}
