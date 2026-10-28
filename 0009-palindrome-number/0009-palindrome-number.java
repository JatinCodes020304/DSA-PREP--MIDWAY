class Solution {
    public boolean isPalindrome(int x) {
        String s= Integer.toString(x);
        String a=new StringBuilder(s).reverse().toString();
        if(s.equals(a)){
            return true;
        }
        else {
            return false;
        }
    }
}