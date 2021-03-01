package co.wordbe.lessons.eucleadianAlgorithm;

public class ChocolatesByNumbers {
    public int solution(int N, int M) {
        int a = N;

        while (M != 0) {
            int R = a % M;
            a = M;
            M = R;
        }

        return N / a;
    }
}
