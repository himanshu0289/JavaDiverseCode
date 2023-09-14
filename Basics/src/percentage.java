import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 subject's marks : ");
        int mrk1 = sc.nextInt();
        int mrk2 = sc.nextInt();
        int mrk3 = sc.nextInt();
        int total = mrk1 + mrk2 + mrk3;
        int percent = total/3;
        System.out.println("The total mark is : "+total);
        System.out.println("Percentage : "+percent);
        System.out.println("Thank you! for using ---@himanshu0289");
    }
}
