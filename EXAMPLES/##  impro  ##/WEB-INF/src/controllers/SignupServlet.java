package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import models.*;
import utils.*;

public class SignupServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		HttpSession session = request.getSession();
		
		String nextPage = "signup.jsp";
		
		//########### Request Parameters ###############
		String userName = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String repassword = request.getParameter("repassword");
		String address = request.getParameter("address");
		String cityName = request.getParameter("city_id");
		int ctid = Integer.parseInt(request.getParameter("ctid"));
		int iam = Integer.parseInt(request.getParameter("iam"));
		//########### Request Parameters ###############

		//########### Parameter-Validation ###############
		//########### Parameter-Validation End ###############
		

		Institute institute = new Institute();
		
		institute.setInstituteName(userName);
		institute.setEmail(email);
		institute.setPassword(password);
		institute.setAddress(address);
		institute.setCity(new City(ctid));
		String vfcode = Utility.getVfCode();
		institute.setVfCode(vfcode);

		if(institute.signupInstitute()){
			nextPage = "login.jsp";

			//########### Folder Creation For Pics ###############
			String uploadFolderPath = getServletContext().getRealPath("/WEB-INF/uploads");
			File file2 = new File(uploadFolderPath,email);

			file2.mkdir();

			if(iam==0){
				File file3 = new File(file2,"institute_pics");
				file3.mkdir();
			}
			//########### Folder Creation For Pics ###############

			//########## Email Sending Code ###############
			File file = new File(getServletContext().getRealPath("/extras/activation_link.txt"));
			String msg = "";
			BufferedReader br = new BufferedReader(new FileReader(file));
			String tmp = null;
			while((tmp = br.readLine())!=null){
				msg+=tmp;
			}

			String[] arr = msg.split("<tmp>");
			msg = arr[0]+userName+arr[1]+email+arr[2]+vfcode+arr[3]+iam+arr[4];

			EmailSender.sendEmail(email,msg);
			//########### Email Sending Code End ############
		}

		request.getRequestDispatcher(nextPage).forward(request,response);
	}
}