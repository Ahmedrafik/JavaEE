package com.iocean.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class loginActionServlet
 */
@WebServlet("/loginActionServlet")
public class loginActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginActionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String pass= request.getParameter("pass");
		HttpSession session = request.getSession();
		if(login.equals("myuser") && pass.equals("mypassword")){
			session.setAttribute("authetification", true);
			this.getServletContext().getRequestDispatcher("/helloWorld.jsp").forward(request, response);
		}
		else{
			session.setAttribute("authetification", false);
			this.getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
			
		}
		
	}

}
