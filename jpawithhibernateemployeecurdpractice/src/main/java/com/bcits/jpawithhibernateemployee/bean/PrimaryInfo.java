package com.bcits.jpawithhibernateemployee.bean;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_primary_info")
public class PrimaryInfo implements Serializable {
	@Id
	@Column
	private int emp_id;
	@Column
	private String emp_name;
	@Column
	private long emp_mobileno;
	@Column
	private String official_mailid;
	@Column
	private Date date_of_birth;
	@Column
	private Date date_of_Join;
	@Column
	private String designation;
	@Column
	private String blood_group;
	@Column
	private double salary;
	@Column
	private int dept_id;
	@Column
	private String manager_id;

	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public long getEmp_mobileno() {
		return emp_mobileno;
	}
	public void setEmp_mobileno(long emp_mobileno) {
		this.emp_mobileno = emp_mobileno;
	}
	public String getOfficial_mailid() {
		return official_mailid;
	}
	public void setOfficial_mailid(String official_mailid) {
		this.official_mailid = official_mailid;
	}
	public Date getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public Date getDate_of_Join() {
		return date_of_Join;
	}
	public void setDate_of_Join(Date date_of_Join) {
		this.date_of_Join = date_of_Join;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getBlood_group() {
		return blood_group;
	}
	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public String getManager_id() {
		return manager_id;
	}
	public void setManager_id(String manager_id) {
		this.manager_id = manager_id;
	}
}
