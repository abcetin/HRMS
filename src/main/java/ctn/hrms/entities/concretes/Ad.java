package ctn.hrms.entities.concretes;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="ads")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Ad {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="detail")
	private String detail;
	
	@Column(name="min_salary")
	private String minSalary;
	
	
	@Column(name="max_salary")
	private String maxSalary;
	
	@Column(name="number_of_position_unit")
	private String numberOfPositionUnit;
	
	@Column(name="relase_date")
	private LocalDate relaseDate;
	
	@Column(name="last_date")
	private LocalDate lastDate;
	
	@Column(name = "activated")
	private boolean activated = false;
	
	
	//@ManyToOne anatasyonu ilişkisel tablolar arasında çoklu kullanılan verinin tekli tablodan çekilmesi için kullanılır
	//@JoinColumn anatasyonu ile tablonun hangi sütunu ile ilişkili olduğunu belirtirsin
	
	@ManyToOne()
	@JoinColumn(name = "employer_id")
	private Employer employer;
	
	@ManyToOne()
	@JoinColumn(name="job_position_id")
	private JobPosition jobPosition;
	
	@ManyToOne()
	@JoinColumn(name = "city_id")
	private City city;
}
