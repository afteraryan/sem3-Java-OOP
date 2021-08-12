import java.util.*;  
public class Fibonacci {
    void Series(int n){
        int temp1=0, temp2=1, c;
        for(int i=0;i<n;i++){
            System.out.print(temp1 + "  ");
            c = temp1;
            temp1 +=temp2;
            temp2 = c;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        Fibonacci obj = new Fibonacci();
        obj.Series(n);
        sc.close();
    }
}
