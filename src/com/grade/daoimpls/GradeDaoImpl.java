package com.grade.daoimpls;

import com.grade.daos.GradeDao;
import com.grade.domains.GradeBean;
import com.grade.pool.Constants;

import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;


public class GradeDaoImpl implements GradeDao{
	
	public void insertGrade(GradeBean param) {
		try {
				File file = new File(Constants.FILE_PATH+"newGrade.txt");
				BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
				writer.write(String.format("영어:%s 국어:%s 수학:%s 사회:%s",
						param.getEng(),
						param.getKor(),
						param.getMath(),
						param.getSociety()));
				writer.newLine();
				writer.flush();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
