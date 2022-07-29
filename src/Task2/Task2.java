package Task2;
//Минимальное из N чисел(использовать LinkedList):
//
//1.       Ввести с клавиатуры число N.
//
//2.       Считать N целых чисел и заполнить ими список - метод getIntegerList.
//
//3.       Найти минимальное число среди элементов списка - метод getMinimum.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Task2 {
    public static void main(String[] args) throws IOException {
        LinkedList<Integer> link = new LinkedList<>();

        getIntegerList(link);

        getMinimum(link);

    }

    public static void getIntegerList(LinkedList<Integer> link) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 5 чисел :");
        for (int i = 0; i < 5; i++) {
            link.add(Integer.valueOf(reader.readLine()));
        }
    }

    public static void getMinimum(LinkedList link) {
//        PriorityQueue<LinkedList> priorityQueue = new PriorityQueue<>();
//        priorityQueue.addAll(link);
//        System.out.println("минимальное число среди элементов списка:  " + priorityQueue.peek());

        //(Верхній спосіб також шукає найменше число)


        int min = (int) Collections.min(link);
        System.out.println("минимальное число среди элементов списка:  " + min);


    }

}






