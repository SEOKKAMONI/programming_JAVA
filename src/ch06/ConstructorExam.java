package ch06;

public class ConstructorExam {
    public static void main(String[] args) {
        Student s1 = new Student("choi");
        Student s2 = new Student("kim", 2);
        Student s3 = new Student("lee", 3);
        Student s4 = new Student();

        s1.showInfo();
        s2.showInfo();
        s3.showInfo();
        s4.showInfo();
    }
}
