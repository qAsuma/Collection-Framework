package Task4;
//Вводить с клавиатуры строки, пока пользователь не введёт строку 'end':
//
//1.       Создать список строк.
//
//2.       Ввести строки с клавиатуры и добавить их в список.
//
//3.       Вводить с клавиатуры строки, пока пользователь не введёт строку "end".  "end" не учитывать.
//
//4.       Вывести строки на экран, каждую с новой строки.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> arrayList = new ArrayList<>();
        System.out.println("Ввод :");

        while (true) {
            String s = reader.readLine();
            if (s.equals("end.")) {
                break;

            } else {
                arrayList.add(s);
            }

        }
        for (String l : arrayList)
            System.out.println(l);
        {

        }

    }
}
















