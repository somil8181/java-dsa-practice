import java.util.*;
class Stackevenodd{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(15);
        st.push(13);
        st.push(17);
        st.push(200);
        st.push(700);
        st.push(500);
        int even = 0;
        int odd = 0;
        for(int x : st){
            if(x%2==0){
                even++;
            }else{

                odd++;
            }
        }
        System.out.println("Even:" + even);
        System.out.println("odd:"+odd);
    }
}
