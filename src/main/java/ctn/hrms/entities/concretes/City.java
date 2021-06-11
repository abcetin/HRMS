package ctn.hrms.entities.concretes;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AccessLevel;
import lombok.Getter;

@Getter
@Entity
@Table(name="cities")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","ads"})
public class City {
	
	
	@Id
	@Column(name = "city_id")
	private int cityId;
	
	
	@Column(name = "city")
	private String city;
	
	
	@Getter(value = AccessLevel.NONE)
	@OneToMany(mappedBy = "city")
	private List<Ad> ad;
	
}
