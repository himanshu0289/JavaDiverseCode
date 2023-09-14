import java.util.Scanner;

public class swap2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("Enter 1st Num : ");
        a = sc.nextInt();
        System.out.print("Enter 2nd Num : ");
        b = sc.nextInt();
        System.out.print("Before swapping : " + a + " " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.print("After Swapping : " + a + " " + b);

    }
}
