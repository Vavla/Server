package com.example.demo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface UserRepository extends JpaRepository<SignFormat, Integer>{
	
//	@Query(value="SELECT m FROM MainInfo m where m.email = ?1")
//	public List<MainInfo> findByEmail(String email);
    
	@Query(value="SELECT l FROM SignFormat l where l.login = ?1 and l.password = ?2")
	public List<SignFormat> findUser(String login,String password);
}

