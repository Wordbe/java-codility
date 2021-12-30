package co.wordbe.lessons.prefixSums;

public class MinAvgTwoSlice {
    public int solution(int[] A) {
        double minAvg = (A[0] + A[1]) / 2d;
        int minIdx = 0;
        for (int i=2; i<A.length; i++) {
            double avg = (A[i - 2] + A[i - 1] + A[i]) / 3d;
            if (minAvg > avg) {
                minAvg = avg;
                minIdx = i - 2;
            }

            avg = (A[i -1] + A[i]) / 2d;
            if (minAvg > avg) {
                minAvg = avg;
                minIdx = i -1;
            }
        }

        return minIdx;
    }

    // 40%, O(N^2)
    public int solution1(int[] A) {

        int[] p = new int[A.length];
        p[0] = A[0];
        for (int i=1; i<A.length; i++) {
            p[i] = A[i] + p[i -1];
        }

        double minVal = Double.MAX_VALUE;
        int minIdx = 0;

        for (int j=1; j<A.length; j++) {
            double avgSlice = (double) p[j] / (j + 1);
            if (minVal > avgSlice) {
                minVal = avgSlice;
            }
        }

        for (int i=1; i<A.length; i++) {
            for (int j=i+1; j<A.length; j++) {
                double avgSlice = (double) (p[j] - p[i - 1]) / (j - i + 1);
                if (minVal > avgSlice) {
                    minVal = avgSlice;
                    minIdx = i;
                }
            }
        }

        return minIdx;
    }
}
