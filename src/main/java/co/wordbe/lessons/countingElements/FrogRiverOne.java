package co.wordbe.lessons.countingElements;

import java.util.Arrays;

public class FrogRiverOne {

    public int solution(int X, int[] A) {
        int[] leaf = new int[X + 1];
        Arrays.fill(leaf, -1);

        for (int i=0; i<A.length; i++) {
            if (leaf[A[i]] == -1) leaf[A[i]] = i;
        }

//        int ans = Arrays.stream(leaf).max().getAsInt();
        int ans = Integer.MIN_VALUE;
        for (int i=1; i<leaf.length; i++) {
            if (ans < leaf[i]) ans = leaf[i];
        }
        for (int i=1; i<leaf.length; i++) {
            if (leaf[i] == -1) {
                ans = -1;
                break;
            }
        }

        return ans;
    }
}
