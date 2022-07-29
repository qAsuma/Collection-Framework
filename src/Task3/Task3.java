package Task3;
//Программа определяет, какая семья (фамилия) живёт в городе:
//Пример ввода:
//·         Москва
//·         Ивановы
//
//·         Киев
//·         Петровы
//
//·         Лондон
//·         Абрамовичи
//
//·         Лондон
//Пример вывода:
//·         Абрамовичи
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> arrayList = new ArrayList<>();

        for (int i = 0; i <= 5; i++) {
            arrayList.add(reader.readLine());
            System.out.println("Ввод: [" + i + "]");
        }
        String s = reader.readLine();
        if (s.equals(arrayList.get(0))) {
            System.out.println(arrayList.get(1));
        } else if (s.equals(arrayList.get(2))) {
            System.out.println(arrayList.get(3));
        } else if (s.equals(arrayList.get(4))) {
            System.out.println(arrayList.get(5));


        }


    }
}



