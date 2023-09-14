import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st num :");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.print("Before swapping : " + a +" " + b );
        int temp = a;
           a = b;
           b = temp;
        System.out.print("After swapping : " + a + " " + b);
    }
}
