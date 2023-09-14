import java.util.Scanner;

public class printSepration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your full name , roll nu. and inerest subject : ");
        String fname = sc.next();
        String lname = sc.next();
        int roll_nu = sc.nextInt();
        String sub = sc.next();
        System.out.println("Name : " + fname + " " + lname);
        System.out.println("Roll Num : " +roll_nu);
        System.out.println("Interested Subject : " +sub);
        System.out.println("Thank You! for using ---@himanshu0289");

        }

}
