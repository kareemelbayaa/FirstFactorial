package com.company;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static int FirstFactorial(int num) {
        // code goes here
        int res = 1;

        for (int i = 1; i <= num; i++) {
            res = res * i;
        }
        return res;
    }

    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);
        System.out.print(FirstFactorial(s.nextInt()));
    }
}
