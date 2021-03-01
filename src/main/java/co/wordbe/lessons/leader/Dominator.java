package co.wordbe.lessons.leader;

import java.util.Arrays;

public class Dominator {
    // 50%
    public int solution(int[] A) {
        if (A.length == 0) return -1;
        if (A.length == 1) return 0;

        int[] sortedA = A.clone();
        Arrays.sort(sortedA);

        int half = A.length / 2;
        int cnt = 1;
        Long dominator = Long.MAX_VALUE;
        for (int i=1; i<sortedA.length; i++) {
            if (sortedA[i-1] == sortedA[i]) cnt++;
            else cnt = 1;

            if (cnt > half) {
                dominator = Long.valueOf(sortedA[i]);
                break;
            }

            System.out.println("cnt: " + cnt + " | dominator: " + dominator);
        }
        System.out.println(dominator);

        for (int i=0; i<A.length; i++) {
            if (Long.valueOf(A[i]) == dominator) return i;
        }

        return -1;
    }
}
