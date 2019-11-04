package me.pramukh.leetcode.leetcode9;

import org.jetbrains.annotations.Contract;

public class PalindromeNumber {

    PalindromeNumber(){

    }
    public static void main(String[] args){
        PalindromeNumber pn = new PalindromeNumber();
        System.out.println(pn.isPalindrome(121));
    }

    public boolean isPalindrome(int x){
        String s = new StringBuilder(String.valueOf(x)).reverse().toString();
        String y = String.valueOf(x);
        return s.equals(y);
    }
}
