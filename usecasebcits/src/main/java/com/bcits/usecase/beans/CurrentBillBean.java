package com.bcits.usecase.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "current_bill")
public class CurrentBillBean implements Serializable {
    @Id
    @Column(name = "rr_number")
	private String rrNumber;
    @Column(name = "prev_reading")
	private double previousReading;
    @Column(name = "current_reading")
	private double currentReading;
    @Column(name = "total_units")
  	private int totalUnits;
    @Column(name = "bill_amount")
	private double billAmount;
    @Column(name = "issue_date")
    private Date issueDate;
    @Column(name = "due_date")
    private Date dueDate;
}
