

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/add")
public class add extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		
		if(name.equals("AJI") && pass.equals("123")) {
			HttpSession session = request.getSession();
			response.sendRedirect("welcome.jsp");
			
		}
		else
		{
			response.sendRedirect("1.jsp");
		}
		
	
	}

}
