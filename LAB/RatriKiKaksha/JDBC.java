import java.sql.*;
public class JDBC 
{
    public static void main (String args[])
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DBExam","root","0000");
            Statement stmt = con.createStatement();
            String CreateTable = "create table Employee(Name varchar(255), ID int)";
            int n= stmt.executeUpdate(CreateTable);
            System.out.println(n);
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
    
}
