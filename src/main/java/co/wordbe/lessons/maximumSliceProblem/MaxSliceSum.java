package co.wordbe.lessons.maximumSliceProblem;

public class MaxSliceSum {

    public int solution(int[] A) {

        int partSum = 0;
        int maxSum = -1000000;
        for (int i=0; i<A.length; i++) {
            maxSum = Math.max(maxSum, partSum + A[i]);
            partSum = Math.max(partSum + A[i], 0);
        }

        return maxSum;
    }
}
