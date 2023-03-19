package ch15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//버퍼 단위 입출력
public class CharacterStream2 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String a = br.readLine();
            System.out.println(a);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
