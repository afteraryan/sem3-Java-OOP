import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class JDBC1 
{

    public static void main(String[] args) 
    {
        try
        {  

            Class.forName("com.mysql.cj.jdbc.Driver");  

            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcass","root","000");  
            Statement stmt=con.createStatement();
           //ResultSet rs = stmt.executeQuery("select*from meeting");
            //ResultSetMetaData rsMetaData = rs.getMetaData();
            /*    System.out.println("List of column names in the current table: ");
                int count = rsMetaData.getColumnCount();
                for(int i = 1; i<=count; i++) {
                    System.out.println(rsMetaData.getColumnName(i));
                }
            */
            system.out.println(stmt);
            con.close();  

        }
        catch(Exception e)
        {
            System.out.println(e);
        }  
    }
}