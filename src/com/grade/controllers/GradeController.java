package com.grade.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.grade.domains.GradeBean;
import com.grade.serviceimpls.GradeServiceImpl;
import com.grade.services.GradeService;

@WebServlet("/grade.do")
public class GradeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GradeBean param = new GradeBean();
		GradeService service = new GradeServiceImpl();
		String ssn = request.getParameter("ssn");
		String name = request.getParameter("name");
		String kor = request.getParameter("kor");
		String eng = request.getParameter("eng");
		String math = request.getParameter("math");
		String society = request.getParameter("society");
		param.setSsn(ssn);
		param.setEng(eng);
		param.setKor(kor);
		param.setMath(math);
		param.setName(name);
		param.setSociety(society);
		service.createGrade(param);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
