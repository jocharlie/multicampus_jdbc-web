<%@page import="multi.MemberDAO3"%>
<%@page import="multi.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//클라이언트가 입력한 No를 서버에서 받아주기(자바로!)
    	//Car car = new Car();
    	//HttpServletRequest request = new HttpServletRequest();
    	//car.run(); //부품은 소문자로!!!
    	String id = request.getParameter("id"); //no=100 주소 받을때는 어떻게 해야하나?
		//String 변수를 만들어주어야한다.
		//JSP안에 만들어진 변수는 서버의 RAM에 저장되는 지역변수!
		
		//가방을 만들어서 값들을 넣고!
	//jsp에서 자동 Import - 해당클래스 클릭한 다음 컨트롤 + 쉬프트 + m


	//가방이 필요하지 않음!!!!!!!
	
	
	//dao에게 가방을 전달하자.!
	MemberDAO3 dao = new MemberDAO3();
	dao.delete(id);
		
		
		
		
		
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
당신이 탈퇴를 원하는 아이디는  <%= id %>
</body>
</html>