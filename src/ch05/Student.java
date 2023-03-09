package ch05;

//static과 final 사용
//static은 공간을 미리 확보함
//final은 초기화 후 변경할 수 없음
public class Student {
    String name;
    static String group = "SW";
    static String school = "busan sw meister";
    //final static String school = "busan sw meister";

    public void showInfo() {
        System.out.println("이름은 "+name+"이고, 소속 학과는 " + group + "입니다.");
    }
}
