package ch15;

import java.io.IOException;

//바이트 단위 입력
public class ByteStreamExam1 {
    public static void main(String[] args) {
        byte[] b = new byte[1024];
        int len = 0;
        try {
            len = System.in.read(b);
            //byte출력시 사용하는 write함수, 아스키코드 입력 -> 문자 출력
            System.out.write(b, 0, len);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
