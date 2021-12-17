class SwitchTest
{
    
    static void Func(int n)
    {
        switch (n)
        {
            case 10:
                System.out.println(10);
                System.out.println("kjs");
                break;
            case 20:
                System.out.println(20);
                break;
            default:
                System.out.println("Wrong");
                break;
        }
    }
    public static void main(String[] args)
    {
        
        Func(10);
        /*for(int i=0; i<5;i++)
        {
            if(i<3)
            {
                System.out.println("Chhota: " + i);
                continue;
            }
            else
            {
                System.out.println("Bada: " + i);

            }    
        }*/



    }   
}