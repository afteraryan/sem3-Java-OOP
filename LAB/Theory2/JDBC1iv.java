import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class JDBCiv 
{
    public static void main(String[] args) 
    {
        try
        { 
            int c = 0;
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/d3","root","H5zwGFPW@1");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Meeting where MID=1105;");
            while(rs.next())
            {
                System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getString(3));
                c++;
            }
            System.out.println(c);
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}