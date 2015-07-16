package lab29_2;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.jni.User;

/**
 * Servlet implementation class FutureValueCalculator
 */
@WebServlet("/displayResults")
public class FutureValueCalculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FutureValueCalculator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
			int investInt = Integer.parseInt(request.getParameter("investment"));
			int yearsInt =Integer.parseInt(request.getParameter("years"));
		 
			
			
			//response.getWriter().append("You invested " + fv); 
			FutureValueBean bean = new FutureValueBean(investInt, yearsInt); 
			double valueDo = bean.returnFutureValue(); 
			//String value = String.valueOf(valueDo); 
			NumberFormat number = NumberFormat.getNumberInstance();
			number.setMaximumFractionDigits(2);
			String value = number.format(valueDo); 
			//request.setAttribute("bean", bean);
			request.setAttribute("value", value);
			getServletContext().getRequestDispatcher("/Results.jsp").forward(request, response); 
			
			
		}
		
	}

	
