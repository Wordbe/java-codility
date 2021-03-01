package co.wordbe.lessons.countingElements;

public class MaxCounters {
    public int[] solution(int N, int[] A) {
        int[] ans = new int[N];

        int curMax = 0;
        int maxCounterMax = 0;

        for (int i=0; i<A.length; i++) {
            if (A[i] == N + 1) maxCounterMax = curMax;
            else {
                int increaseTarget = A[i] - 1;
                if (ans[increaseTarget] < maxCounterMax) {
                    ans[increaseTarget] = maxCounterMax + 1;
                } else {
                    ans[increaseTarget]++;
                }

                if (curMax < ans[increaseTarget]) curMax = ans[increaseTarget];
            }
        }

        for (int i=0; i<N; i++) {
            if (ans[i] < maxCounterMax) ans[i] = maxCounterMax;
        }
        return ans;
    }
}
