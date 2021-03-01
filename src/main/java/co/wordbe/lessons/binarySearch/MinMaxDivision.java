package co.wordbe.lessons.binarySearch;

public class MinMaxDivision {

    public int solution(int K, int M, int[] A) {

        int minSum = 0;
        int maxSum = 0;

        for (int i=0; i<A.length; i++) {
            minSum = Math.max(minSum, A[i]);
            maxSum += A[i];
        }

        int minLargeSum = maxSum;
        while (minSum <= maxSum) {
            int midSum = (minSum + maxSum) / 2;

            if (checkDivisible(midSum, K, A)) {
                minLargeSum = midSum;
                maxSum = midSum - 1;
            } else {
                minSum = midSum + 1;
            }
        }

        return minLargeSum;
    }

    public boolean checkDivisible(int midSum, int k, int[] a) {
        int blocks = k;
        int currBlockSum = 0;

        for (int i=0; i<a.length; i++) {
            currBlockSum += a[i];

            if (currBlockSum > midSum) {
                blocks--;
                currBlockSum = a[i];
            }
            if (blocks == 0) return false;
        }
        return true;
    }
}
