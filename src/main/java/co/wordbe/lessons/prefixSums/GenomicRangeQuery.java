package co.wordbe.lessons.prefixSums;

public class GenomicRangeQuery {
    public int[] solution(String S, int[] P, int[] Q) {
        int[] acgt = new int[4];
        int[][] acgtArray = new int[S.length()][acgt.length];
        int[] ans = new int[P.length];

        for (int i=0; i<S.length(); i++) {
            if (S.charAt(i) == 'A') {
                acgt[0]++;
            } else if (S.charAt(i) == 'C') {
                acgt[1]++;
            } else if (S.charAt(i) == 'G') {
                acgt[2]++;
            } else if (S.charAt(i) == 'T') {
                acgt[3]++;
            }
            acgtArray[i] = acgt.clone();
        }

        for (int i=0; i<P.length; i++) {

            for (int j=0; j<acgt.length; j++) {
                int qk = acgtArray[Q[i]][j];
                int pk = P[i] == 0 ? 0 : acgtArray[P[i] - 1][j];

                if (qk - pk > 0) {
                    ans[i] = j + 1;
                    break;
                }
            }
        }
        return ans;
    }
}
