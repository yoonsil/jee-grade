package com.grade.domains;

import java.io.Serializable;

public class StudentBean implements Serializable{
	private String name, ssn, number;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "StudentBean [name=" + name + ", ssn=" + ssn + ", number=" + number + "]";
	}

}
