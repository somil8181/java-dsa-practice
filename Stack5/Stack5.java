import java.util.*;
class Stack2{
    public static void main(String[]args){
    Stack<Integer> st = new Stack<>();

    for(int i= 0; i<=5; i++){
        st.push(i);
    }
    System.out.println("Add:" + st.peek());
    System.out.println("Remove:" +  st.pop());
    System.out.println("Stack:" +  st);

    }
}
