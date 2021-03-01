package co.wordbe.lessons.greedyAlgorithm;

import java.util.Arrays;

public class MaxNonoverlappingSegments {

    public int solution(int[] A) {
        int d[] = new int[A.length + 6];
        Arrays.fill(d, A[0]);

        for (int i=1; i<A.length; i++) {
            int maxD = Integer.MIN_VALUE;
            for (int j=0; j<6; j++) {
                if (maxD < d[i + j]) maxD = d[i + j];
            }

            d[i + 6] = maxD + A[i];
        }

        return d[d.length - 1];
    }
}
