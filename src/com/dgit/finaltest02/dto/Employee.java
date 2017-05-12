package com.dgit.finaltest02.dto;

import java.sql.Date;

public class Employee {
	private int eno;
	private Title tcode;
	private String ename;
	private int salary;
	private Department dcode;
	private int gender;
	private Date joindate;

	public Employee(int eno) {
		this.eno = eno;
	}



	public Employee(int eno, Title tcode, String ename, int salary, Department dcode, int gender, Date joindate) {
		this.eno = eno;
		this.tcode = tcode;
		this.ename = ename;
		this.salary = salary;
		this.dcode = dcode;
		this.gender = gender;
		this.joindate = joindate;
	}



	public int getEno() {
		return eno;
	}



	public void setEno(int eno) {
		this.eno = eno;
	}



	public Title getTcode() {
		return tcode;
	}



	public void setTcode(Title tcode) {
		this.tcode = tcode;
	}



	public String getEname() {
		return ename;
	}



	public void setEname(String ename) {
		this.ename = ename;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public Department getDcode() {
		return dcode;
	}



	public void setDcode(Department dcode) {
		this.dcode = dcode;
	}



	public int getGender() {
		return gender;
	}



	public void setGender(int gender) {
		this.gender = gender;
	}



	public Date getJoindate() {
		return joindate;
	}



	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}



	@Override
	public String toString() {
		return String.format("Employee [eno=%s, tcode=%s, ename=%s, salary=%s, dcode=%s, gender=%s, joindate=%s]", eno,
				tcode, ename, salary, dcode, gender, joindate);
	}
	
	public String[] toArray(){
		return new String[]{eno+"", ename, tcode.getTname(), String.format("%,d", salary), dcode.getDname()};
	}
	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		return eno==e.eno?true:false;
	}
}
