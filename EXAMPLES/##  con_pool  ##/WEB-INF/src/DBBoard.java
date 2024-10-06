import javax.naming.*;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class DBBoard {
	static DataSource dtsrc;

	static{
		try{
			dtsrc = (DataSource)((Context)(new InitialContext().lookup("java:comp/env"))).lookup("jdbc/app")
		}catch(NamingException ne){
			//Need to handle it. -------------------------- @ --------------------------
			ne.printStackTrace();
		}
	}	
	
	public static Connection getConnection(){		
		Connection con = null;
		
		try{	
			con = dtsrc.getConnection();
		}catch(SQLException es){
			//Need to handle it. -------------------------- @ --------------------------
			es.printStackTrace();
		}
		
		return con;
	}	
}