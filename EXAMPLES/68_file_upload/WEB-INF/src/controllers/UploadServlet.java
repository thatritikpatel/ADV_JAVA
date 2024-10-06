package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.List;

import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;

public class UploadServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		//String userName = request.getParameter("uname"); //NOT OK
		//String email = request.getParameter("email"); //NOT OK
			
		//System.out.println(userName+" ~!~~~~~~~~~"+email);
		if(ServletFileUpload.isMultipartContent(request)){
			DiskFileItemFactory dfif = new DiskFileItemFactory();
			ServletFileUpload sfu = new ServletFileUpload(dfif);
			
			try{
				List<FileItem> fileItems = sfu.parseRequest(request);
				
				String realPath = getServletContext().getRealPath("/");

				for(FileItem fileItem : fileItems){
					if(fileItem.isFormField()){
						String fieldName = fileItem.getFieldName();
						if(fieldName.equals("uname")){
							System.out.println(fileItem.getString()+" ~~~##################~~~~");
						}else if(fieldName.equals("email")){
							System.out.println(fileItem.getString()+" ~~~$$$$$$$$$$$$$$$~~~~");
						}						
					}else{
						String fileName = fileItem.getName();
						File file = new File(realPath,fileName);
						try{
							fileItem.write(file);
						}catch(Exception e){
							e.printStackTrace();
						}
					}
				}				
			}catch(FileUploadException e){
				e.printStackTrace();
			}
		}
		
		request.getRequestDispatcher("next.jsp").forward(request,response);
	}
}