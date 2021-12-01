import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class JDBC1ii {
    public static void main(String[] args) 
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/d3","root","H5zwGFPW@1");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Meeting where MID=1144;");
            System.out.println("Names of participants in meeting 1144\n");
            while(rs.next())
            {
                {
                    System.out.println(rs.getString(1));
                }
            }
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}