package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.List;

import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.FileItem;

public class UploadServlet extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		boolean flag = ServletFileUpload.isMultipartContent(request);
		
		if(flag){
			DiskFileItemFactory dfif = new DiskFileItemFactory();
			ServletFileUpload sfu = new ServletFileUpload(dfif);


			ServletContext context = getServletContext();
			String basePath = context.getRealPath("/");
			try{
				List<FileItem> fileItems = sfu.parseRequest(request);
				
				for(FileItem fileItem : fileItems){
					String fileName = fileItem.getName();

					File file = new File(basePath,fileName);

					try{
						fileItem.write(file);
					}catch(Exception e){
						e.printStackTrace();
					}
				}
			}catch(FileUploadException e){
				e.printStackTrace();
			}
		}
	}
}