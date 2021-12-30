package co.wordbe.lessons.sorting;

import java.util.Arrays;
import java.util.Collections;

public class MaxProductOfThree {
    public int solution(int[] A) {
        Integer[] arr = new Integer[A.length];
        for (int i=0; i<A.length; i++) {
            arr[i] = A[i];
        }

        Arrays.sort(arr, Collections.reverseOrder());

        int first = arr[0];
        int second = arr[1];
        int third = arr[2];

        int last = arr[arr.length -1];
        int secondLast = arr[arr.length -2];

        int answer = 0;

        if (first < 0 && second < 0 && third < 0) {
            answer = first * second * third;
        } else if (first > 0 && second < 0 && third < 0 ||
                   first > 0 && second > 0 && third < 0) {
            answer = first * secondLast * last;
        } else if (first > 0 && second > 0 && third > 0) {
            int a = second * third;
            int b = secondLast * last;
            if (a > b) {
                answer = first * a;
            } else {
                answer = first * b;
            }
        }

        return answer;
    }
}
