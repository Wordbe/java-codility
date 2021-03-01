package co.wordbe.lessons.primeAndCompositeNumbers;

public class CountFactors {

    public int solution(int N) {
        double sqrt = Math.sqrt(N);

        int ans = 0;
        for (int i=1; i<=sqrt; i++){
            if (i == sqrt) {
                ans++;
                break;
            }
            if (N % i == 0) ans += 2;
        }
        return ans;
    }
}
