
public class Main {


    public static class Student{
        String name;
        int rno;
        double percent;
    }
    public static class Car{
        String name;
        int price;
        String type;
    }
    public static void change(Car c) {
        c.name = "Thar";
    }
    public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student();
    Car c1 = new Car();
    s1.name = "himanshu";
    s2.name = "Harsh";
    s2.rno = 26;

    s1.rno = 27;
    s1.percent = 97.2;

    c1.name = "Alto";
    c1.price = 4200000;
        System.out.println("---1st student -------");
        System.out.println(s1.rno);
        System.out.println(s1.name);
        System.out.println(s1.percent);
        System.out.println("----2nd student---" );
        System.out.println(s2.rno);
        System.out.println(s2.name);
        System.out.println(s2.percent);
        System.out.println("*****  About_CAR  *********" );
        System.out.println(c1.price);
        System.out.println(c1.name);
        System.out.println(c1.type);
        change(c1);
        System.out.println("Changed value---");
        System.out.println("Changed name car : " + c1.name);



     }
}