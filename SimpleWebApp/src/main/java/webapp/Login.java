package webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class Login extends HttpServlet{

private UserValidationService service = new UserValidationService();
	
		@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws IOException, ServletException {
			request.getRequestDispatcher("/WEB-INF/Login.jsp").forward(request, response);
		}

		@Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws IOException, ServletException {
			String name = request.getParameter("name");
			String password = request.getParameter("password");

			boolean isValidUser = service.validateUser(name, password);

			if (isValidUser) {
				request.setAttribute("name", name);
				request.getRequestDispatcher("/WEB-INF/Welcome.jsp").forward(request, response);
			} else {
				request.setAttribute("errorMessage", "Invalid Credentials!!");
				request.getRequestDispatcher("/WEB-INF/Login.jsp").forward(request, response);
			}
		}

}