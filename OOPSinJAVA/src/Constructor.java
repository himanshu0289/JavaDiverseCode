public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.percent = 98.8;
        s1.name = "Hima";
        s1.rno = 27;

        System.out.println(s1.name);
        System.out.println(s1.rno);
        System.out.println(s1.percent);
        System.out.println();
        Student s2 = new Student("San",26,91.0);
        System.out.println(s2.name);
        System.out.println(s2.rno);
        System.out.println(s2.percent);
//        s1.name = "Anshu";
//        s1.rno = 28;
//        System.out.println(s1.name);
//        System.out.println(s1.rno);
//        System.out.println(s1.CollegeName);
//        System.out.println(s2.CollegeName);
    }
}
