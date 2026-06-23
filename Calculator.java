//Given two numbers a and b. You need to perform basic mathematical operations on them. You will be provided an integer named as operator.

//If the operator equals to 1 add a and b, then print the result.
//If the operator equals to 2 subtract b from a, then print the result.
//If the operator equals to 3 multiply a and b, then print the result.
//If the operator equals to any other number, print "Invalid Input"(without quotes).

class Solution {
    public void calculate(int a, int b, int operator) {
       if(operator==1){
           System.out.print(a+b);
       }
       
       else if(operator==2){
           System.out.print(b-a);
       }
       
       else if(operator==3){
           System.out.print(a*b);
       }
       
       else{
           System.out.println("Invalid Input");
       }
        
    }
}
