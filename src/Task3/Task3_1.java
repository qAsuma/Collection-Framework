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
import java.util.HashMap;
import java.util.Objects;

public class Task3_1 {
    private final String surname;
    private final String country;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task3_1 task3_1 = (Task3_1) o;
        return Objects.equals(country, task3_1.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country);
    }

    @Override
    public String toString() {
        return country + '\n' +
                surname + '\n';
    }

    public Task3_1(String surname, String country) {
        this.surname = surname;
        this.country = country;
    }

    public String getSurname() {
        return surname;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        Task3_1 first = new Task3_1("Ивановы", "Москва");
        Task3_1 second = new Task3_1("Петровы", "Киев");
        Task3_1 third = new Task3_1("Абрамовичи", "Лондон");


        Task3_1[] t = {first, second, third};


        for (Task3_1 temp : t) {
            System.out.println(temp);

        }


        System.out.println("Введите город:");
        String s = reader.readLine();


        HashMap<Task3_1, String> hashMap = new HashMap<>();
        hashMap.put(first, first.getSurname());
        hashMap.put(second, second.getSurname());
        hashMap.put(third, third.getSurname());


        Task3_1 find = new Task3_1("", s);
        System.out.println(hashMap.get(find));


    }
}
