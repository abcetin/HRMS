package ctn.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import ctn.hrms.entities.concretes.Technology;

public interface TechnologyDao extends JpaRepository<Technology, Integer> {

}
