import java.sql.*;

public class JDBC3i {

	public static void main(String[] args) {
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcass","root","0000");  
			Statement stmt=con.createStatement(); 
			//boolean s = stmt.execute("create table MEETING(NameOfParticipant varchar(255),MeetingId int,ScheduleTime varchar(255),Email varchar(255), Mobile long)");
			boolean s = stmt.execute("insert into MEETING(NameOfParticipant,MeetingId,ScheduleTime,Email, Mobile) values('Priyansh',0004,'Tuesday','priyanshkamail@gmail.com',9876543214)");
			//ResultSet rs = stmt.executeQuery("select*from MEETING WHERE MeetingId = 1114");
			//while(rs.next())
			System.out.println(s);
				//System.out.println("Names with meetingId 1144 : " + rs.getString(1));  	
			con.close();  

		}catch(Exception e){ 
			System.out.println(e);
			}  
	}
}
