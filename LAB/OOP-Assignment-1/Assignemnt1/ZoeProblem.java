import java.util.Scanner;
public class ZoeProblem 
{
    static final double MinWage = 100;
    static final int HourMax = 60;
    static double basePay = 0;  
    static int hoursWorked = 0;
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        for (int i=1; i<=3; i++, System.out.println())
        {
           System.out.println("Employee " + i+":");
           System.out.println("Enter Base Pay:");
           basePay = sc.nextDouble();
           System.out.println("Enter Hours Worked:");
           hoursWorked = sc.nextInt();
           salaryCalculation(); 
       }
       sc.close();
   }
    public static void salaryCalculation()
    {
        double TotalSal = 0;
        int extrahour=0;
        if ((basePay < MinWage) || (hoursWorked > HourMax))
            System.out.println("Error!!");
        else 
        {   
            if (hoursWorked > 40)
            {
                extrahour= hoursWorked-40;
                TotalSal = basePay * 40 + 1.5*basePay*(hoursWorked - 40);
            }
            else 
            {
                TotalSal = basePay * hoursWorked;
            }
            System.out.println("Salary: " + TotalSal);
        }
    }

    }