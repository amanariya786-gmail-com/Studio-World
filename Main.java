class student {
    int rollno;
    String studentName;
}

public class Main {
    public static void main(String[] args) {
        student obj1 = new student();
        obj1.rollno = 1;
        obj1.studentName = "Rahul";
        System.out.println(obj1.rollno);
        System.out.println(obj1.studentName);

        student obj2 = new student();
        obj2.rollno = 2;
        obj2.studentName = "Aman";
        System.out.println(obj2.rollno);
        System.out.println(obj2.studentName);

    }

}
