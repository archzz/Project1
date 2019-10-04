package com.lti.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/TatkalBookingServlet")
public class TatkalBookingServlet extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		Calendar cal= Calendar.getInstance();
		int currentHour=cal.get(Calendar.HOUR_OF_DAY);

		ServletConfig sconf=getServletConfig();
		int startTime=Integer.parseInt(sconf.getInitParameter("startTime"));
		int endTime=Integer.parseInt(sconf.getInitParameter("endTime"));
		System.out.println(sconf.getServletName());
		
		//if(currentHour >=10 && currentHour <=12 )
		
		if(currentHour >=startTime && currentHour <=endTime )
			out.print("<h1>Continue with your booking</h1>");
		else
			out.print("<h2>Sorry.....Booking should be done in between" +startTime+ "and" +endTime+"</h2>");


	}


}


