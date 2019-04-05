<<<<<<< HEAD
package com.example.detailService;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.detailServiceDAO.SubmitDAO;
import com.example.model.RiskDetail;

@Service
public class SubmitServiceImpl implements SubmitService {

	
	
	@Autowired
	SubmitDAO submitDao;
	
	@Override
	public RiskDetail submit(RiskDetail riskDetail) {
		// TODO Auto-generated method stub
		
		return submitDao.save(riskDetail);
	}

}
=======
package com.example.detailService;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.detailServiceDAO.SubmitDAO;
import com.example.model.RiskDetail;

@Service
public class SubmitServiceImpl implements SubmitService {

	
	
	@Autowired
	SubmitDAO submitDao;
	
	@Override
	public RiskDetail submit(RiskDetail riskDetail) {
		// TODO Auto-generated method stub
		
		return submitDao.save(riskDetail);
	}

}
>>>>>>> 2b539345beb71df941bff0412249f6e319152358
