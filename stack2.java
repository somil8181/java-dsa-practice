import java.util.*;
class  Stacksearch{
public static  void  main(String[]args){
    Stack<Integer> st = new Stack<>();
    st.push(10);
    st.push(20);
    st.push(30);
    st.push(40);
    st.push(50);

    if(st.contains(30)){
        System.out.print("Element Found");
    }else {
        System.out.println("Element not found");
    }
}
}
