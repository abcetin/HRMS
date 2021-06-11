package ctn.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ctn.hrms.entities.concretes.Ad;

public interface AdDao extends JpaRepository<Ad	, Integer> {
		List<Ad> getByEmployerId(int id);
		
}
