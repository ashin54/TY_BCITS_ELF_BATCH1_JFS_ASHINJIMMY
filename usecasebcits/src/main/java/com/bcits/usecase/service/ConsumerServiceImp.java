package com.bcits.usecase.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcits.usecase.beans.ConsumerMasterBean;
import com.bcits.usecase.beans.CurrentBillBean;
import com.bcits.usecase.beans.PaymentDetailsBean;
import com.bcits.usecase.dao.CustomerDAO;

@Service
public class ConsumerServiceImp implements ConsumerService {

	
	@Autowired
	private CustomerDAO dao;

	@Override
	public boolean consumerSignUp(ConsumerMasterBean consumerBean, String confirmed) {
		if (consumerBean.getPassword().equals(confirmed)) {
			
			return dao.consumerSignUp(consumerBean); 
		}
		
		return false;
		
	}

	@Override
	public ConsumerMasterBean consumerLogin(String emailId, String password) {
		if(emailId.isEmpty() && password.isEmpty()) {
			return null;
		}
		return dao.consumerLogin(emailId, password);
	}
	
		


	@Override
	public boolean payment(PaymentDetailsBean paymentBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CurrentBillBean showCurrentBill(String rrNumber, Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CurrentBillBean> showBillHistory(String rrNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
