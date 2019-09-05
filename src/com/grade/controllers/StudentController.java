package com.grade.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.grade.pool.Constants;
import com.grade.daoimpls.GradeDaoImpl;
import com.grade.daoimpls.StudentDaoImpl;
import com.grade.daos.GradeDao;
import com.grade.daos.StudentDao;
import com.grade.domains.StudentBean;

@WebServlet("/student.do")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		StudentBean student = new StudentBean();
		StudentDao dao = new StudentDaoImpl();
		switch(request.getParameter("action")) {
		case "move":
			request.getRequestDispatcher
			(String.format(
					Constants.VIEW_PATH,
					"student",
					request.getParameter("dest")))
			.forward(request, response);
			break;
		case "register":
			String name = request.getParameter("name");
			String ssn = request.getParameter("ssn");
			student.setSsn(ssn);
			student.setName(name);
			dao.insertStudent(student);
			request.getRequestDispatcher(String.format
					(Constants.VIEW_PATH, "student","login")).
			forward(request, response);;
			break;
		case "login":
			String id= request.getParameter("id");
			String pass= request.getParameter("pass");
			request.getRequestDispatcher(String.format
					(Constants.VIEW_PATH, "grade","grade")).
			forward(request, response);;
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
