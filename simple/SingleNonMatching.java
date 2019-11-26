import java.util.stream.*;
/*
Given a list of integers where each number is duplicated except for one.
Find that number. Solution should be O(N) in time complexity.

Usage: javac SingleNonMatching.java
       java SingleNonMatching 3 2 1 3 2
*/
public class SingleNonMatching {
    public static int process(String[] v) {
        int[] arr = Stream.of(v).mapToInt(Integer::parseInt).toArray();
        int s = arr[0];
        for (int i = 1; i < arr.length; i++) {
            s ^= arr[i];
        }
        return s;
    }
    public static void main(String args[]) {
        int result = process(args);
        System.out.println(result);
    }
}

