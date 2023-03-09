package ch04;

//객체 생성을 위한 클래스 정의
//클래스는 속성(필드)과 메서드를 가진다.
public class Student {
    String name;
    int num;
    String group;

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
