package org.example;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++)
            System.out.println("i = " + i);

        Map<Integer, Object> map1 = new HashMap<Integer, Object>();
        map1.put(1, "77");
        map1.put(77, 23);
        System.out.println(map1.get(1));
        System.out.println(map1.get(77));

        System.out.println(map1);
    }
}
