package co.wordbe.lessons.timeComplexity;

public class PermMissingElem {

    public int solution(int[] A) {
        boolean cache[] = new boolean[A.length + 2];

        for (int i=0; i<A.length; i++) {
            cache[A[i]] = true;
        }

        int ans = 0;
        for (int i=1; i<cache.length; i++) {
            if (!cache[i]) ans = i;
        }
        return ans;
    }
}
