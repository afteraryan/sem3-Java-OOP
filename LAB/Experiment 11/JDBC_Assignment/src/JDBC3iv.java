import java.sql.*;

public class JDBC3iv {

	public static void main(String[] args) {
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  

			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcass","root","0000");  
			Statement stmt=con.createStatement(); 
			ResultSet rs = stmt.executeQuery("select*from MEETING WHERE ScheduleTime = 'Tuesday';");
			while(rs.next())
				System.out.println("Participants attending Tuesday meetings: " + rs.getString(1));  	
			con.close();  

		}catch(Exception e){ 
			System.out.println(e);
			}  
	}
}