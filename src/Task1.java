import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//Используя коллекцию удвойте слово:
//
//1.       Введите с клавиатуры 5 слов в список строк.
//
//2.       Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
//
//3.       Используя цикл for выведите результат на экран, каждое значение с новой строки.
public class Task1 {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 5 слов :");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }

        doubleValues((ArrayList) list);

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }


    }

    public static void doubleValues(ArrayList list) {
        for (int i = 0; i < 10; i = i + 2) {
            list.add(i, list.get(i));
        }

    }
}











