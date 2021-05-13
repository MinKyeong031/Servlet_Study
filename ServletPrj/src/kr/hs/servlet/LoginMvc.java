package kr.hs.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginMVC")
public class LoginMVC extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		
		if(id.equals("kim") && pw.equals("1111")) {
			req.setAttribute("id", id);
			req.setAttribute("pw", pw);
			RequestDispatcher dispatcher = req.getRequestDispatcher("login_mvc_result.jsp");
			dispatcher.forward(req, resp);	
		}		
	}	
}
