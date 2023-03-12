package ch04;

public class ClassExam {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.name = "choi";
        s2.name = "lee";
        s3.name = "kim";

        s1.showInfo();
        s2.showInfo();
        s3.showInfo();

        s1.eating();
    }
}
