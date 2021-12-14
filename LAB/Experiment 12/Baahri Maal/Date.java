import java.io.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/First")
public class Second extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

    
    public Second(){}

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
    {
		  res.setContentType("text/html");

          PrintWriter print = res.getWriter();
        
          java.util.Date date = new java.util.Date();
          
          print.println("<h2>"+" Date & Time: " +date.toString()+"</h2>");

          print.close();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
		doGet(request, response);
	}

}
