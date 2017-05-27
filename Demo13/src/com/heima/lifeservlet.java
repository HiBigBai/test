package com.heima;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class lifeservlet
 */
public class lifeservlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().print(1);
		// resp.getWriter().write(1);
		// resp.getOutputStream().print(1);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

	/*
	 * public void init(ServletConfig config) throws ServletException {
	 * System.out.println("init"); }
	 * 
	 * @Override public void service(ServletRequest req, ServletResponse res)
	 * throws ServletException, IOException { System.out.println("service"); }
	 * 
	 * @Override public void destroy() { System.out.println("destroy"); }
	 */

}
