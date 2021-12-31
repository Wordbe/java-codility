package co.wordbe.lessons.sorting;

import java.util.Arrays;
import java.util.Collections;

public class Triangle {
    public int solution(int[] A) {
        Integer[] arr = Arrays.stream(A).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i=0; i<arr.length - 2; i++) {
            if (arr[i] < arr[i + 1] + arr[i + 2]) {
                return 1;
            }
        }
        return 0;
    }
}
