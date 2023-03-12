package ch12;

public class EqualExam {
    public static void main(String[] args) {
        String str1 = "busan";
        String str2 = "busan";
        String str3 = new String("meister");
        String str4 = new String("meister");

        if (str1 == str2) {
            System.out.println("주소가 같다.");
        } else {
            System.out.println("주소가 다르다");
        }

        if (str3 == str4) {
            System.out.println("주소가 같다.");
        } else {
            System.out.println("주소가 다르다.");
        }

        if (str1.equals(str2)) {
            System.out.println("내용이 같다.");
        } else {
            System.out.println("내용이 다르다.");
        }

        if (str3.equals(str4)) {
            System.out.println("내용이 같다.");
        } else {
            System.out.println("내용이 다르다.");
        }

        Student s1 = new Student(1, "choi");
        Student s2 = new Student(1, "choi");

        if (s1.equals(s2)) {
            System.out.println("같은 학생");
        } else {
            System.out.println("다른 학생");
        }
    }
}
