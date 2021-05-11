package kr.hs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/protocol")
public class Protocol extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter out = res.getWriter();
		out.print("<html><head><title>요청방식과 프로토콜</title></head><body>");
		out.print("<h1>request URI : " + req.getRequestURI() + "</h1>");
		out.print("<h1>Server name : " + req.getServerName() + "</h1>");
		out.print("<h1>Server Port : " + req.getServerPort() + "</h1>");
		out.print("<h1>client addr : " + req.getRemoteAddr() + "</h1>");
		out.print("<h1>client Host : " + req.getRemoteHost() + "</h1>");
		out.print("<h1>client Port : " + req.getRemotePort() + "</h1></body></html>");
	}
}
