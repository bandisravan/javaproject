<<<<<<< HEAD
package com.example.detailService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.detailServiceDAO.BreachDAO;
import com.example.detailServiceDAO.DataDAO;
import com.example.model.Breach;
import com.example.model.Franchicee;

@Service
public class DataServiceImpl implements DataService {

	@Autowired
	DataDAO dao;
	
	@Autowired
	BreachDAO breach;
	
	
	@Override
	public Map<String, List> getData() {
		// TODO Auto-generated method stub
		
		List<Franchicee> list= dao.findAll();
		List <Breach> listB=breach.findAll();
		Map map=new HashMap<>();
		
		map.put("franchise",list);
		map.put("breach", listB);
		return map ;
		
	}

}
=======
package com.example.detailService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.detailServiceDAO.BreachDAO;
import com.example.detailServiceDAO.DataDAO;
import com.example.model.Breach;
import com.example.model.Franchicee;

@Service
public class DataServiceImpl implements DataService {

	@Autowired
	DataDAO dao;
	
	@Autowired
	BreachDAO breach;
	
	
	@Override
	public Map<String, List> getData() {
		// TODO Auto-generated method stub
		
		List<Franchicee> list= dao.findAll();
		List <Breach> listB=breach.findAll();
		Map map=new HashMap<>();
		
		map.put("franchise",list);
		map.put("breach", listB);
		return map ;
		
	}

}
>>>>>>> 2b539345beb71df941bff0412249f6e319152358
