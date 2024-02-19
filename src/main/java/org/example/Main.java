package org.example;

import java.util.Arrays;
import java.util.LinkedHashSet;
/*
Этот код использует LinkedHashSet, чтобы удалить дубликаты и сохранить порядок элементов,
а затем объединяет строки с помощью String.join().
 */

public class Main {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "orange", "apple", "grape", "banana"};

        String result = String.join(" ", new LinkedHashSet<>(Arrays.asList(strings)));

        System.out.println("Результат: " + result);
    }
}