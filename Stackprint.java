import java.util.*;
class Stackprint{
    public static void main(String[]args){
        Stack<Integer> st = new Stack<>();

        st.push(100);
        st.push(200);
        st.push(300);
        st.push(400);

        for(int  i = 0; i<st.size(); i++){

            System.out.println(st.get(i));
        }
    }
}
