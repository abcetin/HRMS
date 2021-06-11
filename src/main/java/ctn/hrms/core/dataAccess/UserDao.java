package ctn.hrms.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import ctn.hrms.core.entities.User;

public interface UserDao extends JpaRepository<User,Integer> {

}
