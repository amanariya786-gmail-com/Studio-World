package reCode;

public class Student2 {
    int rollno;
    String studentName;
}
class NJewStudent3{
    public static void main(String[] args){
        Student2 obj1 = new Student2();
        Student2 obj2 = new Student2();
        obj1.rollno = 17142;
        obj1.studentName = "Aman";
        obj2.rollno = 17141;
        obj2.studentName = "Sonu";
        System.out.println(obj1.rollno+"/"+obj1.studentName+".");
        System.out.println(obj2.rollno+"/"+obj2.studentName+".");

    }
}
