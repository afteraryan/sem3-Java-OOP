import java.sql.*;

public class JDBC2 
{
    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/DBExam","root","0000");  
			Statement stmt=con.createStatement(); 
            //String Bablu = "create table Meeting(NameOfParticipant varchar(255), MeetingID int, ScheduledTime varchar(255),Email varchar(255), Mobile long)";
            //String Bablu = "Insert into meeting(NameOfParticipant, MeetingID, ScheduledTime,Email, Mobile) VALUE ('Manika','6969', 'Tuesday','alfalf','9998899'), ('Shinchan','1144','Monday','dasdas','23232')";
            String Bablu = "Select *from Meeting where ScheduledTime = 'Tuesday'";
            ResultSet rs = stmt.executeQuery(Bablu);
            while(rs.next())
            {
                System.out.println("“Participants attending Tuesday meetings: "+ rs.getString("NameOfParticipant")+ rs.getFloat("Mobile"));
            }
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }    
}
