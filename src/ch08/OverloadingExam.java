package ch08;

public class OverloadingExam {
    public static void main(String[] args) {
        Add a = new Add();
        System.out.println(a.sum("소프트웨어", "마이스터고"));
        System.out.println(a.sum(10, 20));
    }
}
