package com.seb.calculette.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.seb.calculette.bean.CalculBean;

@WebServlet("/CalculServlet")
public class CalculServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CalculServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/calcul.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int var1 = Integer.parseInt(request.getParameter("var1"));
		request.setAttribute("var1", var1);
		int var2 = Integer.parseInt(request.getParameter("var2"));
		request.setAttribute("var2", var2);
		
		String typeCalc = request.getParameter("typeCalc");
		
		CalculBean calcul = new CalculBean();
		int result = calcul.calculEquation(var1, var2, typeCalc);
		
		request.setAttribute("result", result);
		
		String signe = calcul.getSigne();
		request.setAttribute("signe", signe);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/calcul.jsp").forward(request, response);
	}
}


