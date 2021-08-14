import java.util.*;  

public class Largestof3 {
    void threeNumbers(int a, int b, int c){
        int temp;
        if(a>=b)
            temp=a;
        else
            temp=b;
        if(temp>=c)
            System.out.println("Largest Number: "+temp);
        else
        System.out.println("Largest Number: "+c);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");  
        int a= sc.nextInt();  
        System.out.print("Enter second number: ");  
        int b= sc.nextInt();  
        System.out.print("Enter third number: ");  
        int c= sc.nextInt(); 
        Largestof3 obj = new Largestof3();
        obj.threeNumbers(a,b,c);
        sc.close();
    }
}
