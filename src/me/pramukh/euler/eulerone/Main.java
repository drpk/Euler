package me.pramukh.euler.eulerone;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       int x=0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            if(!list.contains(i)) {
                if (i % 3 == 0 || i % 5 == 0) {
                    list.add(i);
                }
            }
        }
        for (Integer integer : list) {
            x = x + integer;
        }
        System.out.println(x);
    }
}
