package Grokking_Algorithms;

import java.util.Hashtable;

public class HashTables {
    public static void main(String[] args) {
        Hashtable<String,Integer> testHash = new Hashtable<>();
        testHash.put("Апельсины",90);
        testHash.put("Мандарины",190);
        testHash.put("Батон",25);
        testHash.put("Кофе",390);
        System.out.println(testHash);
        System.out.println(testHash.get("Апельсины"));
    }
}
