package me.pramukh.leetcode.leetcode771;

import java.util.ArrayList;

public class JewelsAndStones {

    public JewelsAndStones(){

    }

    public static void main(String[] args){
        JewelsAndStones js = new JewelsAndStones();
        System.out.println(js.numJewelsInStones("aA", "aAAAAB"));
    }
    public int numJewelsInStones(String J, String S) {
        int s = 0;
        ArrayList<Character> jewels = new ArrayList<>();
        for (int i = 0; i < J.length(); i++) {
            if (!jewels.contains(J.charAt(i))) {
                jewels.add(J.charAt(i));
            }
        }
            for (int j = 0; j < S.length(); j++) {
                if (jewels.contains(S.charAt(j))){
                  s++;
               }
            }

        return s;
    }


}
