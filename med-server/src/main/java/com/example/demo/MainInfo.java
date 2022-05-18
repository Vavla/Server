package com.example.demo;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="maininfo")
public class MainInfo {
  
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer id;
	
	public String fullName;
	public Date DB;
	public String region;
	public String locality;
	public String adress;
	public Integer SNILS;
	public Integer OMS;
	public Boolean IsDoctor;
	public Integer number;
	public String email;
	
	
}
