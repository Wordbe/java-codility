package co.wordbe.lessons.timeComplexity;

public class TapeEquilibrium {

    public int solution(int[] A) {

        int[] psum = A.clone();
        for (int i=1; i<psum.length; i++) {
            psum[i] = psum[i-1] + psum[i];
        }

        int ans = Integer.MAX_VALUE;
        int diff;
        int totalSum = psum[psum.length - 1];
        for (int i=0; i<psum.length - 1; i++) {
            diff = Math.abs(psum[i] - (totalSum - psum[i]));
            if (diff < ans) ans = diff;
        }

        return ans;
    }
}
