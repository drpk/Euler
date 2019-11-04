package me.pramukh.euler.eulersix;

public class SumSquareDifference {

    public SumSquareDifference(){
    }

    public static void main(String[] args){
        SumSquareDifference sqd = new SumSquareDifference();
        System.out.println(sqd.getSquareSum(100) - sqd.getSumSquare(100));
    }

    public int getSumSquare(int lim){
        int sumSquare = 0;
        for (int i = 0; i <= lim; i++) {
            sumSquare += (i*i);

        }
        return sumSquare;

    }

    public int getSquareSum(int lim){
        int squareSum = 0;
        for (int i = 0; i <= lim; i++) {
            squareSum+=i;
        }
        return (squareSum*squareSum);
    }
}
