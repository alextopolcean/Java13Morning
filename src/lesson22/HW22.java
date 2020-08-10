package lesson22;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class HW22 {
    public static void main(String[] args) throws IOException {

        StringReader reader = new StringReader("АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ");
        System.out.println(decode(reader, -3));
    }

    public static String decode(StringReader reader, int key) throws IOException {
        if (reader==null) return "";
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(reader);

        String string = bufferedReader.readLine();


        for (char c: string.toCharArray()
        ) {
            sb.append((char)(c+key));
        }

        return sb.toString();
    }
}
