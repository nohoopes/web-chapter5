package webapp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/emailList")
public class TestServlet extends HttpServlet  { 
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String notice = "Post method was called";
		request.setAttribute("text",notice);
		request.getRequestDispatcher("/Post.jsp").forward(request, response);
		
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String notice = "Get method was called";
		request.setAttribute("text",notice);
		getServletContext().getRequestDispatcher("/Post.jsp").forward(request, response);
	}
     
}
