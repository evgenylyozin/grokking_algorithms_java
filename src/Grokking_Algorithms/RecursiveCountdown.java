package Grokking_Algorithms;

public class RecursiveCountdown {
    public static void CountDown (int i) {
        if (i < 0) {
            return;
        }
        System.out.println(i);
        CountDown(i-1);
    }

    public static void main(String[] args) {
        CountDown(10);
    }
}
