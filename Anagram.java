import java.util.*;

class Anagram {
    public static boolean areAnagrams(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }


public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number:");
    String s1 =sc.nextLine();
    System.out.println("Enter the second number:");
    String s2 = sc.nextLine();

    if(areAnagrams(s1, s2)){
        System.out.println("Anagram");
    }else{
            System.out.println("Not anagram");
        }
sc.close();
    }
}


