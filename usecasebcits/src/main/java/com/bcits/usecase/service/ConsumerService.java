package com.bcits.usecase.service;

import java.util.Date;
import java.util.List;

import com.bcits.usecase.beans.ConsumerMasterBean;
import com.bcits.usecase.beans.CurrentBillBean;
import com.bcits.usecase.beans.PaymentDetailsBean;

public interface ConsumerService {
	public boolean consumerSignUp(ConsumerMasterBean consumerBean,String  confirmed);
	public ConsumerMasterBean consumerLogin(String emailId, String password);
	public boolean payment(PaymentDetailsBean paymentBean);
	public CurrentBillBean showCurrentBill(String rrNumber,Date date);
	public List<CurrentBillBean> showBillHistory(String rrNumber);
}
