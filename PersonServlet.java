package study;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PersonServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter( "name" );
		int age = Integer.parseInt(req.getParameter( "age" ));
		String gender = req.getParameter( "gender" );
		resp.setContentType(  "text/html; charset = utf-8 ");
		PrintWriter out = resp.getWriter();
		 
		out.println("<html>");
		out.println(	"<head>");
		out.println(		"<title> Servlet </title>");
		out.println(	"</head>");
		out.println(	"<body>");
		out.println(		"<h2> Servlet 폼데이터 처리 </h2>");
		out.println(		"당신의 이름은" + name + "이고<br>");
		out.println(		"나이는" +  age + "살이고<br>");
		out.println(		"성별은" +(gender.equals("1") ? "남자" : "여자" ) + "입니다<br>");
		out.println(	"</body>");
		out.println("</html");
	
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet( req,  resp );
	}
	
}
