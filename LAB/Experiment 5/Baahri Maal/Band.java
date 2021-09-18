import java.io.*;
import java.util.Scanner;
class stack {
    static int ch;
    int element, maxsize, top;
    int[] st;
    public stack() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Stack size? ");
        maxsize = sc.nextInt();
        st = new int[maxsize];
        top = -1;
        System.out.println("-----------------------------------");
    }
    public void push(int element) {
        if(top ==maxsize-1) {
            System.out.println("\nOverflow!!\n");
        } else {
            try {
                st[++top] = element;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
        }
    }
    public int pop() {
        if (top == -1) {
            System.out.println("\nUnderFlow!!\n");
            return (-1);
        }
        else {
            System.out.print("\nPopped: " +(st[top--]));
            return 0;
        }
    }

    public void display(int[] st, int max_size) {
        int i;
        System.out.print("\nStack Elements: ");
        for (i = 0; i <= max_size; i++)
            System.out.print(st[i] + "\t");
        System.out.print("\n");
        new Band();
    }
}
 class Band {
    static int ch;

    public static void main(String[] args) {
        stack obj = new stack();
        while (true) {
            System.out.println("\n1) PUSH\n2) POP\n3) Display\n4) EXIT");
            System.out.print("Enter option: ");
            Scanner integer = new Scanner(System.in);
            ch = integer.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter Element: ");
                    obj.element = integer.nextInt();
                    obj.push(obj.element);
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.display(obj.st, obj.top);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Wrong option!");
            }
        }
        
    }
}
