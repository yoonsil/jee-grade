package com.grade.pool;

import java.io.File;

public class Constants {
	public static final String FILE_PATH = 
			String.format
			("C:%sUsers%s"
					+ "thisi%s"
					+ "eclipse_jee%s"
					+ "jee-grade%sWebContent%s"
					+ "resources%stxt%s"
			,File.separator
			,File.separator
			,File.separator
			,File.separator
			,File.separator
			,File.separator
			,File.separator
			,File.separator);
	public static final String VIEW_PATH= "WEB-INF/views/%s/%s.jsp";
}
