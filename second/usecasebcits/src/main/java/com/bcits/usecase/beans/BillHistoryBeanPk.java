package com.bcits.usecase.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class BillHistoryBeanPk implements Serializable {
	@Column(name = "rr_number")
	private String rrNumber;
	@Column(name = "date_of_payment")
	private Date dateOfPayment;
}
