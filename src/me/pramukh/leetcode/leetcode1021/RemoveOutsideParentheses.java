package me.pramukh.leetcode.leetcode1021;

public class RemoveOutsideParentheses {

    public RemoveOutsideParentheses(){

    }

    public static void main(String[] args){
        RemoveOutsideParentheses rm = new RemoveOutsideParentheses();
        System.out.println(rm.remove("((()))", '('));
    }

    public String remove(String s, char c){
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0;  i < s.length(); i++) {
            char a = sb.toString().charAt(i);
            if (a == c){
                sb.deleteCharAt(i);
            }
        }
        return sb.toString();
    }
}
