package com.vteamsystem.training;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormActionServlet extends HttpServlet {
	
	private static final long serialVersionUID = -4262343542570496712L;

	/**
     * Default constructor. 
     */
    public FormActionServlet() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletOutputStream sos = response.getOutputStream();
		try {
			sos.write("Get Done.".getBytes("UTF-8"));
		} finally {
			try {
				sos.close();
			} catch (Throwable t) {
				t.printStackTrace();
			}
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletOutputStream sos = response.getOutputStream();
		try {
			sos.write("Post Done.".getBytes("UTF-8"));
		} finally {
			try {
				sos.close();
			} catch (Throwable t) {
				t.printStackTrace();
			}
			
		}
	}

}
