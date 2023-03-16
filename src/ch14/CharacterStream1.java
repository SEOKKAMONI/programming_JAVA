package ch14;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class CharacterStream1 {
    public static void main(String[] args) {
        int i;
        Reader reader = new InputStreamReader(System.in);
        try {
            while ((i = reader.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
