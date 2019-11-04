package me.pramukh.leetcode.leetcode1051;

public class HeightChecker {
    public HeightChecker(){

    }
    public static void main(String[] args){
        HeightChecker hc = new HeightChecker();
        System.out.println(hc.heightChecker(new int[]{1,2,1,2,1,1,1,2,1}));
    }

    public int heightChecker(int[] heights) {
        int s = 0;
        for (int i = 1; i < heights.length - 1; i++) {
            if (!isInCorrectOrder(heights[i-1], heights[i], heights[i+1])){
                remove(heights, i);
                s++;
            }
        }
        return s;
    }
    //this function was taken from StackOverflow
    public int[] remove(int[] symbols, int c)
    {
        for (int i = 0; i < symbols.length; i++)
        {
            if (symbols[i] == c)
            {
                int[] copy = new int[symbols.length-1];
                System.arraycopy(symbols, 0, copy, 0, i);
                System.arraycopy(symbols, i+1, copy, i, symbols.length-i-1);
                return copy;
            }
        }
        return symbols;
    }

    public boolean isInCorrectOrder(int first, int second, int third){
        return first <= second && second <= third;
    }
}
