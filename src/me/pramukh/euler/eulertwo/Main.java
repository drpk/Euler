package me.pramukh.euler.eulertwo;

import java.util.ArrayList;

public class Main {
    Main(){

    }
    ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args){
        Main main = new Main();
        System.out.println(main.getFibonacciNumbers());
    }


    int getFibonacciNumbers() {
        int sum = 0;
        int x = 1;
        int y = 2;
        while (x < 4000000) {
            if (x % 2 == 0)
                sum += x;
            int z = x + y;
            x = y;
            y = z;
        }
        return sum;
    }
}
