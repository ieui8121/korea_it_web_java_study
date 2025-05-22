package _21_Class.Student;

public class StudentMain {
    public static void main(String[] args) {

        Student student = new Student();

        student.name = "박수호";
        student.age = 18;
        student.email = "ieui8121@gmail.com";
        student.address = "부산광역시 ...";

        student.showInfo();

    }
}
