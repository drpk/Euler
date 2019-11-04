package me.pramukh.euler.eulerfive;

public class SmallestMultiple {

    public SmallestMultiple(){

    }

    public static void main(String[] args){
        SmallestMultiple sm = new SmallestMultiple();
        boolean divided = false;
        int i = 1;
        while(!divided) {
            if (sm.isDivisible(i, 20)){
                System.out.println(i);
                divided = true;
            }else{
                i++;
            }
        }
    }

    public boolean isDivisible(int i, int j){
        boolean divisible = true;
        for (int k = 2; k <= j; k++) {
            if(i%k != 0){
                divisible = false;
            }
        }
        return divisible;
    }
}
