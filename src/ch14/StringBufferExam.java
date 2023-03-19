package ch14;

//String클래스의 값은 불변함
//StringBuffer클래스의 값은 가변함. 동적
//hashCode()는 해싱한 값을 리턴
//해싱이란 해시함수를 사용하여 메모리 주소를 계산한 후 해당 기억장소에 접근
public class StringBufferExam {
    public static void main(String[] args) {
        String s1 = "busan";
        System.out.println(s1.hashCode());
        s1 = s1 + " software";
        System.out.println(s1);
        System.out.println(s1.hashCode());

        System.out.println("===============");

        StringBuffer sb1 = new StringBuffer("busan");
        System.out.println(sb1.hashCode());
        StringBuffer sb2 = new StringBuffer(" software");
        sb1.append(sb2);
        System.out.println("sb1 = " + sb1);
        System.out.println("sb2 = " + sb2);
        System.out.println(sb1.hashCode());

        System.out.println("===============");

        System.out.println(sb1.replace(0, 5, "BUSAN"));
        System.out.println(sb1.reverse());
        String s2 = sb1.reverse().toString();
        System.out.println(s2);
    }
}
