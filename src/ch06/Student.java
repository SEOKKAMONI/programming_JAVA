package ch06;

//생성자 오버로딩
//같은 이름의 생성자를 여러 개 정의함
//다형성 구현
//this와 this()
public class Student {
    String name;
    int grade;
    String group;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int grade) {
        this(name);
        this.grade = grade;
    }

    public void study() {
        System.out.println("공부하기");
    }
    public void eating() {
        System.out.println("밥먹기");
    }
    public void sleeping() {
        System.out.println("잠자기");
    }
    public void showInfo() {
        System.out.println("이름은 "+name+"입니다.");
    }
}
