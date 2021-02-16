package Grokking_Algorithms;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QuickSOrt {
    public static List<Integer> QuickSort(List<Integer> list) {
        if (list.size() < 2) {
            return list;
        } else {
            int pivot = list.get(0);
            List<Integer> less = list.stream().skip(1).filter(x -> x <= pivot).collect(Collectors.toList());
            List<Integer> greater = list.stream().skip(1).filter(x -> x > pivot).collect(Collectors.toList());
            return Stream.of(
                    QuickSort(less).stream(),
                    Stream.of(pivot),
                    QuickSort(greater).stream())
                    .flatMap(Function.identity()).collect(Collectors.toList());
        }
    }

    public static void main(String[] args) {
        List<Integer> testList = new ArrayList<>(Arrays.asList(5,3,2,7,8,1,10));
        System.out.println(QuickSort(testList));
    }
}

