package co.wordbe;

import co.wordbe.lessons.sorting.MaxProductOfThree;

public class App {
    public static void main( String[] args ) {
        MaxProductOfThree maxProductOfThree = new MaxProductOfThree();
        int answer = maxProductOfThree.solution(new int[]{-3, 1, 2, -2, 5, 6});
        System.out.println("answer = " + answer);
    }

//    public static int solution(int[] A) {
//
//        Map<Integer, Boolean> mapA = new HashMap<>();
//
//        int ans = 0;
//        for (int i=0; i<A.length; i++) {
//            if (A[i] != 0) {
//                if (mapA.containsKey(-A[i])) {
//                    ans = Math.max(Math.abs(A[i]), ans);
//                }
//                mapA.put(A[i], true);
//            }
//        }
//        return ans;
//    }
//
//    public static int[] solution1(String [] S) {
//        int M = S[0].length();
//        int[] ans = new int[3];
//        boolean isFoundPair = false;
//
//        for (int i=0; i<S.length; i++) {
//            for (int j=i + 1; j<S.length; j++) {
//
//                for (int k=0; k<M; k++) {
//                    if (S[i].charAt(k) == S[j].charAt(k)) {
//                        ans[0] = i;
//                        ans[1] = j;
//                        ans[2] = k;
//                        isFoundPair = true;
//                        break;
//                    }
//                }
//
//                if (isFoundPair) break;
//            }
//            if (isFoundPair) break;
//        }
//
//        if (!isFoundPair) {
//            return new int[]{};
//        }
//        return ans;
//    }
}
