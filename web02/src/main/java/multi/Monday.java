package multi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/monday.do")
public class Monday extends HttpServlet {
	String temp=""; //내가 못쓴것! 틀린것!!

	public void init(ServletConfig config) throws ServletException {
			temp = config.getInitParameter("temp");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.print("오늘은 월요일입니다" + "날씨는" + temp); //내가 하지 못한것.
			out.close(); //1번 이렇게 보냈을때 한글처리
			
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
