public class OppDiffFile {

    public static void main(String[] args) {
        callStudent s1 = new callStudent();
        s1.name = "himanshu";
//        s1.rno = 27;
        s1.percent = 97.8;
        System.out.println(s1.name);
//        System.out.println(s1.rno);  //show error due to private contains object
        System.out.println(s1.percent);
        System.out.println(s1.getRno());
        s1.setRno(76);
        System.out.println(s1.getRno());


    }
}
