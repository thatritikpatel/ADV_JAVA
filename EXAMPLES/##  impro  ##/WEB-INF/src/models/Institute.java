package models;

import java.sql.*;

public class Institute{
	
    private Integer instituteId;
    private String instituteName;
    private String address;
    private City city;
    private Status status;
    private String email;
    private String contact;
    private String password;
    private String aboutUs;
	private String vfCode;
	private String instDp;


	//##########################################################
	public static void saveDp(String finalName,String email){
		
		Connection con = null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/impro?user=root&password=1234");

			String query = "update institutes set inst_dp=? where email=?";

			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(2,email);
			ps.setString(1,finalName);

			ps.executeUpdate();

		}catch(SQLException|ClassNotFoundException e){
			e.printStackTrace();
		}finally{
			try{con.close();}catch(SQLException e){	e.printStackTrace();	}
		}
	}
	
	
	public boolean loginInstitute(){
		boolean flag = false;
		
		Connection con = null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/impro?user=root&password=1234");

			String query = "select institute_id,institute_name,address,contact,about_us,inst_dp,c.city_id,c.city from institutes as i inner join cities as c where email=? and password=? and status_id=1 and i.city_id=c.city_id";

			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1,email);
			ps.setString(2,password);

			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				instituteId = rs.getInt(1);
				instituteName = rs.getString(2);
				address = rs.getString(3);
				contact = rs.getString(4);
				aboutUs = rs.getString(5);
				instDp = rs.getString(6);
				city = new City(rs.getInt(7),rs.getString(8));

				password = null;

				flag = true;
			}

		}catch(SQLException|ClassNotFoundException e){
			e.printStackTrace();
		}finally{
			try{con.close();}catch(SQLException e){	e.printStackTrace();	}
		}

		return flag;
	}
	
	public static boolean activateAccount(String email,String vfCode){
		boolean flag = false;
		
		Connection con = null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/impro?user=root&password=1234");

			String query = "update institutes set status_id=1 where email=? and vfcode=? and status_id=2";

			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1,email);
			ps.setString(2,vfCode);

			int res = ps.executeUpdate();

			if(res==1){
				flag = true;
			}
		}catch(SQLException|ClassNotFoundException e){
			e.printStackTrace();
		}finally{
			try{con.close();}catch(SQLException e){	e.printStackTrace();	}
		}

		return flag;
	}


	public boolean signupInstitute(){
		boolean flag = false;
		Connection con = null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/impro?user=root&password=1234");

			String query = "insert into institutes (institute_name,email,password,address,city_id,vfcode) value (?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1,instituteName);
			ps.setString(2,email);
			ps.setString(3,password);
			ps.setString(4,address);
			ps.setInt(5,city.getCityId());
			ps.setString(6,vfCode);

			int res = ps.executeUpdate();
			if(res==1){
				flag = true;
			}

		}catch(ClassNotFoundException|SQLException e){
			e.printStackTrace();
		}finally{
			try{con.close();}catch(SQLException e){e.printStackTrace();}
		}

		return flag;
	}
	
	public static boolean checkDuplicateEmail(String email){
		boolean flag = false;
		Connection con = null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/impro?user=root&password=1234");

			String query = "select * from institutes where email=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1,email);

			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				flag = true;
			}

		}catch(ClassNotFoundException|SQLException e){
			e.printStackTrace();
		}finally{
			try{con.close();}catch(SQLException e){e.printStackTrace();}
		}

		return flag;
	}
	
	//##########################################################

    public Integer getInstituteId() {
        return instituteId;
    }

    public void setInstituteId(Integer instituteId) {
        this.instituteId = instituteId;
    }

	//___________________________________________________

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }
	
	//____________________________________________________

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

	//____________________________________________________

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

	//_____________________________________________________

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

	//_____________________________________________________

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

	//_____________________________________________________

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

	//_____________________________________________________

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

	//_____________________________________________________

    public String getAboutUs() {
        return aboutUs;
    }

    public void setAboutUs(String aboutUs) {
        this.aboutUs = aboutUs;
    }

	public void setVfCode(String vfCode){
		this.vfCode = vfCode;
	}

	public String getVfCode(){
		return vfCode;
	}

	public void setInstDp(String instDp){
		this.instDp = instDp;
	}

	public String getInstDp(){
		return instDp;
	}
}