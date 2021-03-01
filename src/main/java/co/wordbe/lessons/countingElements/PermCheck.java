package co.wordbe.lessons.countingElements;

import java.util.Arrays;

public class PermCheck {

    // 힙영역 256MB 정도로 가정 (RAM 16GB 기준)
    // int형(4B=32bit) 64,000,000 정도 배열 채울 수 있다.
    public static int solution(int[] A) {

        int maxVal = Integer.MIN_VALUE;
        for (int i=0; i<A.length; i++) {
            if (maxVal < A[i]) maxVal = A[i];
        }
        if (A.length != maxVal) return 0;

        Arrays.sort(A);
        for (int i=1; i<A.length; i++) {
            if (A[i-1] == A[i] || A[i] - A[i-1] > 1) return 0;
        }

        return 1;
    }
}
