package ctn.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ctn.hrms.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer,Integer>  {
		List<Employer> getByEmailContains(String email);
		List<Employer> getByEmail(String email);
}
