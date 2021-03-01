package co.wordbe.lessons.sorting;

import java.util.Arrays;

public class Distinct {
    public int solution1(int[] A) {
        if (A.length == 0) return 0;

        Arrays.sort(A);
        int cur = A[0];
        int ans = 1;
        for (int i=1; i<A.length; i++) {
            if (cur != A[i]) {
                cur = A[i];
                ans++;
            }
        }

        return ans;
    }
}
