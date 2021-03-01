package co.wordbe.lessons.maximumSliceProblem;

public class MaxProfit {
    public int solution(int[] A) {

        int minVal = 200000;
        int profit = 0;
        int maxProfit = 0;
        for (int i=1; i<A.length; i++) {
            minVal = Math.min(minVal, A[i-1]);
            profit = Math.max(A[i] - minVal, 0);
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
}
