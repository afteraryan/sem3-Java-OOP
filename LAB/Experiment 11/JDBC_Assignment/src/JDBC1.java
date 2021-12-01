import java.sql.*;

public class JDBC1 
{
    public static void main(String[] args)
    {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcass","root","0000");
            Statement stmt = con.createStatement();
            int n = stmt.executeUpdate("create table Employee(Name varchar(255), ID int, Email varchar(255), Number long)");
            String Data="INSERT INTO Employee("
            + "Name, ID, Email, Number) VALUES "
            + "('Aryan', 001, 'ar@gmail.com',9876543210), "
            + "('Arann', 002, 'arr@gmail.com',9876543210), "
            + "('Aryannn', 003, 'arrr@gmail.com',9876543210), "
            + "('Aryannnn', 004, 'arrrr@gmail.com',9876543210);";
            n = stmt.executeUpdate(Data);
            System.out.println("Number of rows updated: "+n);
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }    
}
