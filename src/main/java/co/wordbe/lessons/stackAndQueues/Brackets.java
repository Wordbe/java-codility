package co.wordbe.lessons.stackAndQueues;

import java.util.Stack;

public class Brackets {

    public int solution(String S) {

        if (S.length() == 0) return 1;

        Stack<Character> stack = new Stack<>();
        for (int i=0; i<S.length(); i++) {
            Character c = S.charAt(i);
            if (c == ')') {
                if (stack.isEmpty()) return 0;
                Character pop = stack.pop();
                if (pop != '(') return 0;
            } else if (c == ']') {
                if (stack.isEmpty()) return 0;
                Character pop = stack.pop();
                if (pop != '[') return 0;
            } else if (c == '}') {
                if (stack.isEmpty()) return 0;
                Character pop = stack.pop();
                if (pop != '{') return 0;
            } else {
                stack.push(c);
            }
        }
        if (stack.isEmpty()) return 1;
        return 0;
    }
}
