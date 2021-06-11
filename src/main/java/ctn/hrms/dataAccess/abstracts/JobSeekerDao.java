package ctn.hrms.dataAccess.abstracts;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ctn.hrms.entities.concretes.JobSeeker;


@Repository
public interface JobSeekerDao extends JpaRepository<JobSeeker,Integer> {

	List<JobSeeker> findByNationalityId(String nationalitId);
	List<JobSeeker> findByEmail(String email);
	
	JobSeeker getJobSeekerById(int id);
}
