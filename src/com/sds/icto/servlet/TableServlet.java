package com.sds.icto.servlet;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TableServlet
 */
@WebServlet("/Table")
public class TableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TableServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	doPost(request, response);
    	
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String row = request.getParameter("r");
		String col = request.getParameter("c");
		
		int nRow;
		if (row != null) {
			nRow = Integer.parseInt(row);
		} else {
			nRow = 3;	
		}

		int nCol;
		if (col != null) {
			nCol = Integer.parseInt(col);
		} else {
			nCol = 3;
		}
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<table border='1px' cellspacing='0' cellpadding='10px'>");
		
		for (int i=0; i<nRow; i++){
			out.println("<tr>");
			for(int j=0; j<nCol; j++){
			out.println("<td>셀("+i+","+j+")</td>");
			}
			out.println("</tr>");
		}
				
		out.println("</table>");
	
	}

}
