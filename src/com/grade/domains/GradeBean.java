package com.grade.domains;

import java.io.Serializable;

public class GradeBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private String kor,eng,math, society, name, ssn, number;

	public String getKor() {
		return kor;
	}

	public void setKor(String kor) {
		this.kor = kor;
	}

	public String getEng() {
		return eng;
	}

	public void setEng(String eng) {
		this.eng = eng;
	}

	public String getMath() {
		return math;
	}

	public void setMath(String math) {
		this.math = math;
	}

	public String getSociety() {
		return society;
	}

	public void setSociety(String society) {
		this.society = society;
	}

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
		return "성적표\n[kor=" + kor + "\neng=" + eng + "\nmath=" + math + "\nsociety=" + society + "\nname=" + name
				+ "\nssn=" + ssn + "\nnumber=" + number + "]";
	}
	
}
