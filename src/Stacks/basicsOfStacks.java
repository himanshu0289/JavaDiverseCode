package Stacks;

import java.util.Stack;

public class basicsOfStacks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(23);
        st.push(90);
        st.push(5);
        st.push(34);
        System.out.println(st.peek()); //34
        System.out.println(st); // [1 23 90 5 34]
//        st.pop(); // delete upper layer
        System.out.println();

    }
}
