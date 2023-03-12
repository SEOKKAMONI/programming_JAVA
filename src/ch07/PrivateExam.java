package ch07;

public class PrivateExam {
    public static void main(String[] args) {
        Student kim = new Student("최병준");
        kim.setGrade(2);
        Student hong = new Student("홍길동", 3);
        System.out.println("학생의 이름은 " + kim.getName() + "이고, " + kim.getGrade() + "학년 입니다.");
        System.out.println("학생의 이름은 " + hong.getName() + "이고, " + hong.getGrade() + "학년 입니다.");

        System.out.println("생성된 학생 객체 수는 " + Student.getCount() + "입니다.");
    }
}
