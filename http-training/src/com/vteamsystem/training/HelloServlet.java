package com.vteamsystem.training;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * HelloServlet 只提供 GET 方法.
 * @author harrison.yuan
 *
 */
public class HelloServlet extends HttpServlet {
	
	private static final long serialVersionUID = -1741316713458491781L;

	/**
     * Default constructor. 
     */
    public HelloServlet() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		ServletOutputStream sos = null;
		try {
			sos = response.getOutputStream();
			System.out.println(request.getServletContext().getMajorVersion() + "  " + request.getServletContext().getMinorVersion());
			sos.write("hello, world.".getBytes("UTF-8"));
		} finally {
			try {
				if (null != sos ) {
					sos.close();
				}
			} catch (Throwable t) {
				t.printStackTrace();
			}
			
		}
	}
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
//	}

}
