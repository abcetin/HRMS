package ctn.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import ctn.hrms.entities.concretes.JobSeekerImage;

public interface JobSeekerImageDao extends JpaRepository<JobSeekerImage,Integer> {

}
