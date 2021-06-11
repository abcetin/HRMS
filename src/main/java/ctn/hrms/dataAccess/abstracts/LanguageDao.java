package ctn.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import ctn.hrms.entities.concretes.Language;

public interface LanguageDao extends JpaRepository<Language,Integer>{

}
