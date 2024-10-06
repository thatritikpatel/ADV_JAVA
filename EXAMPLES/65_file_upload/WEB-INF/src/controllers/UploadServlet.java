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
		if(ServletFileUpload.isMultipartContent(request)){
			DiskFileItemFactory dfif = new DiskFileItemFactory();
			ServletFileUpload sfu = new ServletFileUpload(dfif);
			
			List<FileItem> fileItems = null;
			try{
				fileItems = sfu.parseRequest(request);

				FileItem fileItem = fileItems.get(0);

				//System.out.println(fileItem.getName());
				String realPath = getServletContext().getRealPath("/");
				System.out.println(realPath);

				File file = new File(realPath,fileItem.getName());

				try{
					fileItem.write(file);
				}catch(Exception e){
					e.printStackTrace();
				}
			}catch(FileUploadException e){
				e.printStackTrace();
			}
		}
		
		request.getRequestDispatcher("next.jsp").forward(request,response);
	}
}