package com.example.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.detailService.DataService;
import com.example.detailService.SubmitService;
import com.example.model.Breach;
import com.example.model.Franchicee;
import com.example.model.RiskDetail;

import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class DPBController extends SpringBootServletInitializer{
	
	
	@Autowired
	DataService dataService;
	
	@Autowired
	SubmitService submitService;
	
	
	@RequestMapping(value="/getData",method=RequestMethod.GET)
	public Map getData() {
		Map franchise=dataService.getData();
		
		return franchise;
	}
	
	@RequestMapping(value="/submit",method=RequestMethod.POST,consumes="application/json")
	public RiskDetail submit(@RequestBody RiskDetail riskDetail) {
		return submitService.submit(riskDetail);
	}
	
}
