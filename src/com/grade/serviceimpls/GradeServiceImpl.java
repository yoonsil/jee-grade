package com.grade.serviceimpls;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import com.grade.daoimpls.GradeDaoImpl;
import com.grade.daos.GradeDao;
import com.grade.domains.GradeBean;
import com.grade.services.GradeService;

public class GradeServiceImpl implements GradeService{

	private GradeDao dao;
	public GradeServiceImpl() {
		dao = new GradeDaoImpl();
	}
	
	public void createGrade(GradeBean param) {
	//	param.setNumber(createNumber(param));
		dao.insertGrade(param);
	}
	
	public String createNumber(GradeBean param) {
		Random ran = new Random();
		String year = new SimpleDateFormat("yyyy").format(new Date());
		int stNum = ran.nextInt(999)+1;
		
		return String.format("학번:%s-%s%03d",
				year,
		//		param.getSsn().substring(7,8),
				stNum);
	}
}
