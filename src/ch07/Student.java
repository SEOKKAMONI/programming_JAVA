package ch07;

//접근 제어자
//static 메소드
public class Student {
    private String name;
    private int grade;
    private static int count;

    public Student() {
        count++;
    }

    public Student(String name) {
        count++;
        this.name = name;
    }

    public Student(String name, int grade) {
        this(name);
        this.grade = grade;
    }

    public static int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
