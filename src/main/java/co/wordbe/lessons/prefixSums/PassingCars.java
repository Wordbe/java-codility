package co.wordbe.lessons.prefixSums;

public class PassingCars {
    public int solution(int[] A) {

        int oneCnt = 0;
        int ans = 0;
        for (int i=A.length-1; i>=0; i--) {
            if (A[i] == 0) {
                ans += oneCnt;
            } else if (A[i] == 1) {
                oneCnt++;
            }

            if (ans > 1000000000) return -1;
        }
        return ans;
    }
}
