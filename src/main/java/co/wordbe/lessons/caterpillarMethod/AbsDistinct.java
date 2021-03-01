package co.wordbe.lessons.caterpillarMethod;

import java.util.HashSet;

public class AbsDistinct {
    public int solution(int[] A) {

        HashSet<Integer> basket = new HashSet<>();

        for (int i=0; i<A.length; i++) {
            int absVal = Math.abs(A[i]);
            if (!basket.contains(absVal)) {
                basket.add(absVal);
            }
        }

        return basket.size();
    }
}
