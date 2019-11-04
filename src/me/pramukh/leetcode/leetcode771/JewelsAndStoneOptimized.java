package me.pramukh.leetcode.leetcode771;

public class JewelsAndStoneOptimized {
    public JewelsAndStoneOptimized(){
    }
    public static void main(String[] args){
        JewelsAndStoneOptimized js = new JewelsAndStoneOptimized();
        System.out.println(js.numJewelsInStones("aAA", "AAAAaBB"));
    }
    public int numJewelsInStones(String J, String S){
        int s = 0;
        for (int i = 0; i < S.length(); i++) {
            if (J.contains(S.charAt(i)+"")){
                s++;
            }
        }
        return s;
    }
}
