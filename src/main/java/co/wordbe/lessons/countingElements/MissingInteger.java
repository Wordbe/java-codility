package co.wordbe.lessons.countingElements;

import java.util.Arrays;

public class MissingInteger {

    public int solution(int[] A) {
        Arrays.sort(A);
        int ans = A[A.length - 1] + 1;
        if (ans <= 0) ans = 1;
        if (A[0] > 1) return 1;

        for (int i=1; i<A.length; i++) {
            if (A[i-1] >= 0) {
                if (A[i] - A[i-1] > 1) {
                    ans = A[i - 1] + 1;
                    break;
                }
            } else if (A[i] > 1) {
                ans = 1;
                break;
            }
        }

        return ans;
    }
}
