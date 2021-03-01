package co.wordbe.lessons.maximumSliceProblem;

public class MaxDoubleSliceSum {

    public int solution(int[] A) {

        int[] xySum = new int[A.length];
        int[] yzSum = new int[A.length];

        for (int i=1; i<A.length - 2; i++) {
            xySum[i] = Math.max(xySum[i-1] + A[i], 0);
        }

        for (int i=A.length - 2; i>1; i--) {
            yzSum[i] = Math.max(yzSum[i+1] + A[i], 0);
        }

        int ans = xySum[0] + yzSum[2];
        for (int i=1; i<A.length-1; i++) {
            ans = Math.max(ans, xySum[i-1] + yzSum[i+1]);
        }

        return ans;
    }
}
