package ctn.hrms.entities.concretes;



import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import ctn.hrms.core.entities.User;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;


@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)  
@NoArgsConstructor
@Entity
@Table(name = "employers")
@PrimaryKeyJoinColumn(name="user_id")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","ads"})
public class Employer extends User  {
	 
	
	@Column(name= "company_name")
	private String companyName;

	
	@Column(name= "web_site")
	private String webSite;

	
	@Column(name= "phone_number")
	private String phoneNumber; 
	
	//@Getter(value = AccessLevel.NONE) ve @Setter(value = AccessLevel.NONE) anatasyonları @Data anatasoyunu ile sağlanan 
	// getter setter sınıflarının oluşmasını engeller
	//@NonNull kullanılan verinin @AllArgsConstructor anatasyonunda null geçmesini sağlar
	
	@NonNull	
	@Getter(value = AccessLevel.NONE)
	@Setter(value = AccessLevel.NONE)
	@OneToMany(mappedBy = "employer") 
	private List<Ad> ad;


	
	
	 
}
