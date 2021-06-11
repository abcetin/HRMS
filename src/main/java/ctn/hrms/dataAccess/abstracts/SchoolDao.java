package ctn.hrms.dataAccess.abstracts;



import org.springframework.data.jpa.repository.JpaRepository;

import ctn.hrms.entities.concretes.School;

public interface SchoolDao extends JpaRepository<School, Integer> {


}
