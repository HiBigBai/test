package com.heima;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo
 */
public class Demo extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setHeader("content-type", "text/html;charset = utf-8");
		try {
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			Serivce ser = new Serivce();
			int count = ser.finduername(username, password);
			if (count > 0) {
				response.getWriter().println("success");
			} else {
				response.getWriter().print("error");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
