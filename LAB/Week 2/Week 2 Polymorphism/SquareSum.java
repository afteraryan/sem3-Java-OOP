import java.util.*;  

public class SquareSum {
    void Square(int [] arr){
        int sum=0;
        System.out.print("---------------------------------\n");
        for(int i=0; i<arr.length;i++){
            sum += arr[i]*arr[i];
        }
        System.out.print("Sum: " + sum);
    }

    public static void main(String[] args){
        
        int[] arr;
        arr = new int[10];
        int c;
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<arr.length;i++){
            c = i+1;
            System.out.print("Enter Number " + c + " : ");
            
            arr[i] = sc.nextInt();
        }
        sc.close();
        SquareSum obj = new SquareSum();
        obj.Square(arr);

    }
}
