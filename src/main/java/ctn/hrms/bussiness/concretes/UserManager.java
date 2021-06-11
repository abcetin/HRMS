package ctn.hrms.bussiness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ctn.hrms.bussiness.abstracts.UserService;
import ctn.hrms.bussiness.constans.Messages;
import ctn.hrms.core.dataAccess.UserDao;
import ctn.hrms.core.entities.User;
import ctn.hrms.core.utilities.results.DataResult;
import ctn.hrms.core.utilities.results.Result;
import ctn.hrms.core.utilities.results.SuccessDataResult;
import ctn.hrms.core.utilities.results.SuccessResult;


@Service
public class UserManager implements UserService {

	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>(this.userDao.findAll(),Messages.listed);
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult(Messages.addedSuccess);
	}

	@Override
	public Result delete(User user) {
		this.userDao.delete(user);
		return new SuccessResult(Messages.deleted);
	}
	
	

}
