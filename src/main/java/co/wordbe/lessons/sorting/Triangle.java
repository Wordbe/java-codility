package co.wordbe.lessons.sorting;

import java.util.Arrays;

public class Triangle {
    public int solution(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i < A.length - 2; i++) {
            long P = A[i];
            long Q = A[i + 1];
            long R = A[i + 2];
            if (P + Q > R) return 1;
        }
        return 0;
    }

    // 변환로직이 있어서 약간의 타임아웃이 난다.
//    public int solution(int[] A) {
//        Long[] arr = Arrays.stream(A)
//                .mapToLong(i -> i)
//                .boxed()
//                .toArray(Long[]::new);
//        Arrays.sort(arr, Collections.reverseOrder());
//        for (int i=0; i<arr.length - 2; i++) {
//            if (arr[i] < arr[i + 1] + arr[i + 2]) {
//                return 1;
//            }
//        }
//        return 0;
//    }
}
