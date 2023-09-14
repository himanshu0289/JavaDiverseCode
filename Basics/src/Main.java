import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st num : ");
        a = sc.nextInt();
        System.out.print("Enter 2nd Num : ");
        b = sc.nextInt();
        System.out.println("Sum : " + (a+b));
    }
}