import java.util.*;
class Stacksize1{
public static void main(String[]args){
Stack<Integer> st = new Stack<>();

for(int i = 1; i<=5; i++){
    st.push(i);
}
st.pop();
st.pop();

System.out.println("Size:"+st.size());
}
}
