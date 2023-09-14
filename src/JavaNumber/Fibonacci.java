package JavaNumber;
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you want till that term : ");
        int nth = sc.nextInt();
        int n1=0,n2=1;
        int n3;
        System.out.print(n1 + " " +n2);
        for (int i=0;i<nth-1;i++){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
