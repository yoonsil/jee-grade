package com.grade.domains;

import java.io.Serializable;

public class GradeBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private String kor,eng,math, society;

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

	@Override
	public String toString() {
		return "GradeBean [kor=" + kor + ", eng=" + eng + ", math=" + math + ", society=" + society + "]";
	}
	
	
}
