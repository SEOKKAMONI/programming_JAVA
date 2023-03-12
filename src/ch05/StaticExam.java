package ch05;

public class StaticExam {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.name = "choi";
        s2.name = "lee";
        s3.name = "kim";

        //s1.school = "daegu sw meister";
        //System.out.println(s2.school);

        s1.showInfo();
        //Student.group = "embedded";
        s2.showInfo();
        s3.showInfo();
    }
}
