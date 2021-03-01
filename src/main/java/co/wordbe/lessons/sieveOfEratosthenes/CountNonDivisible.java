package co.wordbe.lessons.sieveOfEratosthenes;

public class CountNonDivisible {

    public int[] solution(int[] A) {
        int[] cnt = new int[A.length * 2 + 1];
        int[] divisible = new int[A.length];
        int[] ans = new int[A.length];

        for (int i=0; i<A.length; i++) {
            cnt[A[i]]++;
        }

        for (int i=0; i<A.length; i++) {

            double sqrt = Math.sqrt(A[i]);
            for (int j=1; j<=sqrt; j++) {
                if (A[i] % j == 0) {
                    divisible[i] += cnt[j];
                    if (A[i] / j != j) {
                        divisible[i] += cnt[A[i] / j];
                    }
                }
            }
        }

        for (int i=0; i<A.length; i++) {
            ans[i] = A.length - divisible[i];
        }
        return ans;
    }
}
