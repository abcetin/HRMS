package ctn.hrms.bussiness.abstracts;

import java.util.List;

import ctn.hrms.core.utilities.results.DataResult;
import ctn.hrms.core.utilities.results.Result;
import ctn.hrms.entities.concretes.Ad;

public interface AdService {

	Result add(Ad ad);
	Result changeActivity(int id,  boolean activity);
	DataResult<List<Ad>>  getAll();
	DataResult<List<Ad>>  getBySorted();
	DataResult<List<Ad>> getByEmployerId(int id);
}
