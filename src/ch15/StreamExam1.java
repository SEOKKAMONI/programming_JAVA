package ch15;

//키보드 입력, 한 글자 입력->한 바이트 출력
public class StreamExam1 {
    public static void main(String[] args) {
        int a;
        try {
            a = System.in.read();
            System.out.println((char) a);

//            while ((a = System.in.read()) != -1) {
//                System.out.print((char) a);
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
