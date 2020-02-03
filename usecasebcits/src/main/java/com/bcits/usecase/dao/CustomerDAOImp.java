package com.bcits.usecase.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.bcits.usecase.beans.ConsumerMasterBean;
import com.bcits.usecase.beans.CurrentBillBean;
import com.bcits.usecase.beans.PaymentDetailsBean;

@Repository
public class CustomerDAOImp implements CustomerDAO {
	
	@PersistenceUnit
	EntityManagerFactory factory ;
	
	@Override
	public boolean consumerSignUp(ConsumerMasterBean consumerBean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		boolean isAdded = false;
		
		try {
			transaction.begin();
			manager.persist(consumerBean);
			transaction.commit();
			isAdded = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return isAdded;
	}//end of consumerSignUp method

	@Override
	public ConsumerMasterBean consumerLogin(String emailId, String password) {
		EntityManager manager = factory.createEntityManager();
	System.out.println(emailId +password);
		Query query = manager.createQuery(" from ConsumerMasterBean where emailId= :email ");
		query.setParameter("email",emailId);
		ConsumerMasterBean InfoBean = (ConsumerMasterBean) query.getSingleResult();
		if(InfoBean != null && InfoBean.getPassword().equals(password)) {
			return InfoBean;
		}
		return null;
		
	}//end of consumerLogin  method

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