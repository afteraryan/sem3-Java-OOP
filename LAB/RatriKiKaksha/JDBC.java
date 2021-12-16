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
            //String CreateTable = "create table Employee(Name varchar(255), ID int)";
            //String InsertTable = "INSERT INTO Employee(Name, ID) VALUES ('Avi Thakur','6969')";
            String InsertTable = "INseRT INTO Employee(Name, ID) VALUES ('Manika','6969'), ('Maanik','6969')";
            int n= stmt.executeUpdate(InsertTable);
            System.out.println(n);
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
    
}
