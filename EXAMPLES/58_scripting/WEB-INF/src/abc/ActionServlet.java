package abc;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

import java.util.ArrayList;

public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		Student s1 = new Student("mohan",14,"ABC School");
		Student s2 = new Student("sohan",15,"MNO School");
		Student s3 = new Student("rohan",16,"XYZ School");
		Student s4 = new Student("tohan",17,"Global");

		ArrayList<Student> students = new ArrayList<Student>();

		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);

		request.setAttribute("students",students);
		
		request.getRequestDispatcher("abc.jsp").forward(request,response);
	}
}