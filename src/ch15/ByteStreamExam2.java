package ch15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

//bufferedinputstream를 통해 버퍼 단위로 입출력
//맥 강제종료 : cmd+d
//윈도우 강제종료 : ctrl+z
public class ByteStreamExam2 {
    public static void main(String[] args) {
        BufferedInputStream bi = new BufferedInputStream(System.in);
        BufferedOutputStream bo = new BufferedOutputStream(System.out);
        int a;

        try {

            while ((a = bi.read()) != -1) {
                bo.write(a);
            }
            bo.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
