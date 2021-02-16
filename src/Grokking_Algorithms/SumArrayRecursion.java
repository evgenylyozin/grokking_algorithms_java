package Grokking_Algorithms;

import java.util.*;

public class SumArrayRecursion {
    public static int SumArray(List<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }
        int theValue = list.get(0);
        list.remove(0);
        return theValue + SumArray(list);
    }

    public static void main(String[] args) {
        List<Integer> testList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(SumArray(testList));
    }
}
