package com.grade.domains;

import java.io.Serializable;

public class StudentBean implements Serializable{
	private String name, ssn, yNumber;
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
		return yNumber;
	}
	public void setNumber(String yNumber) {
		this.yNumber = yNumber;
	}

	@Override
	public String toString() {
		return "StudentBean [name=" + name + ", ssn=" + ssn + ", yNumber=" + yNumber + "]";
	}

}
