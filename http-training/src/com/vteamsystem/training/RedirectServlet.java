package com.vteamsystem.training;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * HelloServlet 只提供 GET 方法.
 * @author harrison.yuan
 *
 */
public class RedirectServlet extends HttpServlet {
	
	private static final long serialVersionUID = 9523189506271408L;

	/**
     * Default constructor. 
     */
    public RedirectServlet() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
//		response.addHeader("Location", "redirect.html");
		
		// OR
		
		 response.sendRedirect("redirect.html");
	}
	
}
