package ch01;

//메모리 영역 설명 (판서)
public class ArrayExam3 {
    public static void main(String[] args) {
        int a[];
        int b[];
        int[] c = {31, 32, 33};

        a = new int[4];
        b = new int[]{21, 22, 23, 24};
        c = b;

        System.out.println(a.length + " " + b.length + " " + c.length);
    }
}
