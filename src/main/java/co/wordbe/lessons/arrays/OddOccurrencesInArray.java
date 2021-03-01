package co.wordbe.lessons.arrays;

import java.util.Arrays;

public class OddOccurrencesInArray {

    public int solution(int[] A) {
        Arrays.sort(A);

        for (int i=0; i<A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("");

        int cur = A[0];
        int cnt = 1;
        int ans = A[A.length - 1];

        System.out.println("cur: " + cur + " | cnt: " + cnt);
        for (int i=1; i<A.length; i++) {
            if (cur == A[i]) cnt++;
            else {
                if (cnt % 2 == 1) {
                    ans = cur;
                    break;
                }
                cur = A[i];
                cnt = 1;
            }
            System.out.println("cur: " + cur + " | cnt: " + cnt);
        }

        return ans;
    }
}
