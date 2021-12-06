import java.sql.*;

public class JDBC2 
{
    public static void main(String[] args)
    {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcass","root","0000");
            Statement stmt = con.createStatement();
            int n = stmt.executeUpdate("create table Employee2(Name varchar(255), ID int, Email varchar(255), Number long)");
            String Data="INSERT INTO Employee2("
            + "Name, ID, Email, Number) VALUES" 
            + "('Aryan', 001, 'ar@gmail.com',9876543210), "
            + "('Arann', 002, 'arr@gmail.com',9876543211), "
            + "('Aryannn', 003, 'arrr@gmail.com',9876543212), "
            + "('Aryannnn', 004, 'arrrr@gmail.com',9876543213);";
            n = stmt.executeUpdate(Data);
            System.out.println("Number of rows updated: "+n);
            ResultSet rs = stmt.executeQuery("Select * from Employee2");
            while(rs.next())
            {
                System.out.print("Name: " + rs.getString("Name")  
                                +"\tID: " + rs.getInt("ID") 
                                +"\tE-mail: " + rs.getString("Email")  
                                +"\tNumber: " + rs.getLong("Number"));
                System.out.println();
            }
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }    
}
