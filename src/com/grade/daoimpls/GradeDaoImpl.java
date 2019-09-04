package com.grade.daoimpls;

import com.grade.daos.GradeDao;
import com.grade.domains.GradeBean;
import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;


public class GradeDaoImpl implements GradeDao{
	public static final String FILE_PATH = String.format("C:%sUsers%sthisi%sjee2%sjee-grade%sWebContent%sresources%stxt%s"
			,File.separator
			,File.separator
			,File.separator
			,File.separator
			,File.separator
			,File.separator
			,File.separator
			,File.separator);
	@Override
	public void insertGrade(GradeBean param) {
		try {
				File file = new File(FILE_PATH+"grade.txt");
				BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
				BufferedReader reader = new BufferedReader(new FileReader(file));
				writer.write(String.format("%s %s %s %s %s %s",
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
