package ctn.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import ctn.hrms.entities.concretes.SystemPersonel;

public interface SystemPersonelDao extends JpaRepository<SystemPersonel, Integer> {

}
