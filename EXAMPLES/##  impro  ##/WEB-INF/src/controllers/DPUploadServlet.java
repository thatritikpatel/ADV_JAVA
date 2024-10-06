package controllers;

import javax.servlet.http.*;
import javax.servlet.*;

import java.io.*;
import java.util.*;

import models.Institute;
import utils.Utility;

import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.FileItem;

public class DPUploadServlet extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		HttpSession session = request.getSession();
		
		Institute institute = (Institute)session.getAttribute("institute");

		String nextPage = "login.jsp";
		
		
		if(ServletFileUpload.isMultipartContent(request)){
			DiskFileItemFactory dfif = new DiskFileItemFactory();

			ServletFileUpload sfu = new ServletFileUpload(dfif);

			try{
				List<FileItem> list = sfu.parseRequest(request);

				Iterator<FileItem> itr = list.iterator();
				while(itr.hasNext()){
					FileItem fi = itr.next();

					if(fi.isFormField()){
						request.setAttribute("iam",Integer.parseInt(fi.getString()));
					}else{
						if(institute!=null){
							String uploadFolderPath = getServletContext().getRealPath("/WEB-INF/uploads/"+institute.getEmail());
							
							String str = fi.getName();

							String ext = str.substring(str.lastIndexOf("."));
							String finalName = Utility.getVfCode()+ext;

							File file = new File(uploadFolderPath,finalName);

							fi.write(file);

							Institute.saveDp(finalName,institute.getEmail());
							institute.setInstDp(finalName);

							nextPage = "institute_profile.jsp";
						}
					}
				}
			}catch(FileUploadException e){
				e.printStackTrace();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
				

		request.getRequestDispatcher(nextPage).forward(request,response);
	}
}