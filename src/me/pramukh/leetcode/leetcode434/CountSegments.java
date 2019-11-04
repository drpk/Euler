package me.pramukh.leetcode.leetcode434;

public class CountSegments {
    /*
    * Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.

Please note that the string does not contain any non-printable characters.


    * */
    public CountSegments(){

    }
    public static void main(String[] args){

    }
    public int countSegments(String s) {
        int j = 1;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                j++;
            }
        }
        return j;
    }
}
