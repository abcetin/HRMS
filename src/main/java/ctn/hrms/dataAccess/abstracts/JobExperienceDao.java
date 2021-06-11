package ctn.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import ctn.hrms.entities.concretes.JobExperience;

public interface JobExperienceDao extends JpaRepository<JobExperience, Integer> {

}
