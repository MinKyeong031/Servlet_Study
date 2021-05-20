package kr.hs.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class register extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String[] model = {req.getParameter("id"), req.getParameter("pw"), req.getParameter("name"), req.getParameter("age")};
	
		for(int i = 0; i < model.length; i++) {
			System.out.println(model[i]);
		}
	
		req.setAttribute("model", model);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("member_result.jsp");
		dispatcher.forward(req, resp);
	}
}
