package ch01;

//참조 자료형 배열
public class ArrayExam2 {
    public static void main(String[] args) {
        String[] str = new String[3];
        str[0] = "Hello";
        str[1] = "JAVA";
        str[2] = "World";
        for (String s : str) {
            System.out.println(s);
        }
    }
}
