package kr.hs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class login extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter out = resp.getWriter();
		String id = req.getParameter("id");
		String password = req.getParameter("pass");
		String hobby[] = req.getParameterValues("hobby");
		out.print("<html> <head> <title> 로그인 </title></head><body>");
		out.print("<p>ID : "+id+"</p>");
		out.print("<p>PW : "+password+"</p>");
		out.print("<p>이름 : "+req.getParameter("name")+"</p>");
		out.print("<p>취미 : ");
		for(int i = 0; i < hobby.length; i++) {
			out.print(hobby[i]+"&nbsp;");
		}
		out.print("</p>");
		out.print("<p>성별 : "+req.getParameter("gender")+"</p>");
		out.print("<p>직업 : "+req.getParameter("job")+"</p>");
		out.print("<p>자기소개 : "+req.getParameter("txt")+"</p>");

		out.print("</body></html>");
		
	}	
}