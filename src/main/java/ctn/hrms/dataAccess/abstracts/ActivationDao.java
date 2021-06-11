package ctn.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import ctn.hrms.entities.concretes.Activation;

public interface ActivationDao extends JpaRepository<Activation,Integer>  {

}
