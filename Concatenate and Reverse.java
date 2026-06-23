class Solution {
    static String conRevstr(String s1, String s2) {
      String rev = s1 + s2;
      StringBuilder  sb = new  StringBuilder(rev);
      sb.reverse();
      return sb.toString();
    }
}
