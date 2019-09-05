package com.grade.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.grade.daoimpls.GradeDaoImpl;
import com.grade.daos.GradeDao;
import com.grade.domains.GradeBean;
import com.grade.domains.StudentBean;
import com.grade.pool.Constants;
import com.grade.serviceimpls.GradeServiceImpl;
import com.grade.services.GradeService;

@WebServlet("/grade.do")
public class GradeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		GradeBean grade = new GradeBean();
		GradeService service = new GradeServiceImpl();
		
		//------------------------------------------
		switch(request.getParameter("action")) {
		case "move":
			request.getRequestDispatcher
			(String.format(Constants.VIEW_PATH,
					"grade",request.getParameter("dest")))
			.forward(request, response);
			break;
		case "grade":
			String kor = request.getParameter("kor");
			String eng = request.getParameter("eng");
			String math = request.getParameter("math");
			String society = request.getParameter("society");
			grade.setEng(eng);
			grade.setKor(kor);
			grade.setMath(math);
			grade.setSociety(society);
			service.createGrade(grade);
			request.getRequestDispatcher(String.format("%s.jsp","index"))
			.forward(request, response);
			break;
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	//	doGet(request, response);
	}

}
