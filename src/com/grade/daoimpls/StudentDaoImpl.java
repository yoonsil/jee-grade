package com.grade.daoimpls;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import com.grade.daos.StudentDao;
import com.grade.domains.StudentBean;
import com.grade.pool.Constants;

public class StudentDaoImpl implements StudentDao{

	public void insertStudent(StudentBean param) {
			try {
					File file = new File(Constants.FILE_PATH+"StudentInfo.txt");
					BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
					writer.write(String.format("이름:%s 주민번호:%s 학번:%s",
							param.getName(),
							param.getSsn(),
							param.getNumber()));
					writer.newLine();
					writer.flush();
			} catch(Exception e) {
				e.printStackTrace();
			}
	}

}
