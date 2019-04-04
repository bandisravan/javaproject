package com.example.detailServiceDAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Breach;
import com.example.model.Franchicee;

public interface BreachDAO extends JpaRepository<Breach,Long>{

}
