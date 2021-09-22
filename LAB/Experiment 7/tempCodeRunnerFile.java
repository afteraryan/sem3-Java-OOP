class UserException extends Exception
{
    public UserException(String s)
    {
        super(s);
    }
}
  
public class CustomException
{
    public static boolean isNumeric(String str)
    {
        return str != null && str.matches("[-+]?\\d*\\.?\\d+");
    }

    public static void main(String args[])
    {
        
        try
        {
            if(!isNumeric(args[0])||!isNumeric(args[1]))
            {
                throw new UserException("Non-Numeric Entry!");
                
            }    
            else
            {
                int a = Integer.parseInt(args[0]);
                int b = Integer.parseInt(args[1]);
                System.out.println("Modulus of " + a + " and " + b + ": " + (a%b));
                
            }
        }
        catch (UserException e)
        {
            System.out.println("Excepion Caught!");
            System.out.println(e.getMessage() + "\n");
        }
    }
}