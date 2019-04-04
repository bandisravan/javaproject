package com.example.detailServiceDAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Breach;
import com.example.model.Franchicee;

@Repository
public interface DataDAO extends JpaRepository<Franchicee,Long> {

	
	
}
