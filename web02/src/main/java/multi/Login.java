package multi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class Login extends HttpServlet {

	//HttpServlet에 있던 service()메서드는
	//get요청이면 doGet()호출(실행)하게 만들어져 있음.
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out= response.getWriter();
		String find = request.getParameter("find");
		out.print("get요청을 받음>> "+ find);
	}

//포스트요청	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
//		Cup cup = 박민서.물갖고와();
//		cup.물을마시다();
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		//서버가 한글처리하도록 설정해서 브라우저로 보내야함.
		//request?? response??
		//브라우저 --requset(받을때)--> 서버 
		//		<--response--
		response.setCharacterEncoding("text/html;charset=UTF-8");
		out.print("get요청을 받음>> "+ id+ ", " + pw);
		
		
		
	}

}