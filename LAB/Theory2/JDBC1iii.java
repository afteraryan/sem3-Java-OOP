import java.sql.*
public class JDBCiii 
{
    public static void main(String[] args) 
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/d3","root","H5zwGFPW@1");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Meeting where Par_name='Divz';");
            while(rs.next())
            {
                {
                    System.out.println(rs.getString(1)+" "+rs.getInt(1));
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