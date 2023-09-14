import java.util.Scanner;

public class tlinesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("Enter number of test case :");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter 1st num : ");
             a = sc.nextInt();
            System.out.print("Enter 2nd num : ");
             b = sc.nextInt();
            System.out.println("the sum is : " + (a+b));
        }
      }
}
