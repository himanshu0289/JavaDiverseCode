import java.util.Scanner;
public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter the principle : ");
          double p = sc.nextDouble();
        System.out.print("Enter the rate : ");
         double r = sc.nextDouble();
        System.out.print("Enter the time : ");
        double t = sc.nextDouble();
        System.out.println("Principle : " +p);
        System.out.println("Interest : " +r);
        System.out.println("Time duration :" +t);
        double si = (p*r*t)/100;
        System.out.println("Simple interest :" +si);
    }
}
