import java.util.*;
class Stacksum{
    public static void main(String[]args){
        Stack<Integer> st = new Stack<>();
        st.push(100);
        st.push(200);
        st.push(300);
        st.push(400);

        int sum  = 0;
        for(int x : st){
            sum = sum + x;
        }
        System.out.println("sum : "+sum);
    }
}
