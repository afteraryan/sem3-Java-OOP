public class CL_Calculator {
    void Calc(int x, String c, int y)
    {
        int Output;
        switch (c)
        {
            case "+":
                Output= x+y;
                System.out.println(x + c + y + "= "  + Output);
                break;
            case "-":
                Output= x-y;
                System.out.println(x + c + y + "= "  + Output);
                break;
            case "*":
                Output= x*y;
                System.out.println(x + c + y + "= "  + Output);
                break;
            case "/":
                Output= x/y;
                System.out.println(x + c + y + "= "  + Output);
                break;
            default:
                System.out.println("Wrong Input!");
                break;
        }
    }

    public static void main(String args[])
    {
        int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[2]);
        CL_Calculator obj = new CL_Calculator();
        obj.Calc(x, args[1], y);
    }
}
