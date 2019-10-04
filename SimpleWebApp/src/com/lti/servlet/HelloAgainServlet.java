package com.lti.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloAgainServlet
 */
//@WebServlet("/HelloAgainServlet")
public class HelloAgainServlet extends HttpServlet {
	
     
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			 response.getWriter().write("Kitni baar Helloo bole....");
			
			}
	
	}


