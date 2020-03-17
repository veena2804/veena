package cookie;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
 private static final long serialVersionUID = 1L;
      
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
 /**
  * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
  */
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  // TODO Auto-generated method stub
  //response.getWriter().append("Served at: ").append(request.getContextPath());
 
 }
 /**
  * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
  */
 
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  // TODO Auto-generated method stub
  response.setContentType("text/html");
  PrintWriter pw=response.getWriter();
     String name=request.getParameter("uname");
     String password=request.getParameter("upassword");
     if(password.equals("admin123"))
     {
      pw.print("you are logged in");
      pw.print("<br>Welcome,"+name);
     
      Cookie c=new Cookie("name",name);
      response.addCookie(c);
     
     }
     else
     {
      pw.print("sorry try again");
      request.getRequestDispatcher("cookielogin.html").include(request, response);
     }
  doGet(request, response);
 }
}
