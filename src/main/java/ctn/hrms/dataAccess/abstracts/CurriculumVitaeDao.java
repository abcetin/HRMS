package ctn.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import ctn.hrms.entities.concretes.CurriculumVitae;

public interface CurriculumVitaeDao extends JpaRepository<CurriculumVitae, Integer> {
	
 CurriculumVitae getByJobSeeker_Id(int id);

}
