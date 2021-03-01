package co.wordbe.lessons.prefixSums;

public class CountDiv {

    public int solution(int A, int B, int K) {

        if (A%K == 0) return B/K - A/K + 1;
        return B/K - A/K;
    }
}
