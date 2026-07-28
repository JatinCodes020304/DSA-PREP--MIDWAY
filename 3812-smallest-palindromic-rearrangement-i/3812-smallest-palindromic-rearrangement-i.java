class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();
        int j=0;
        int  a[]=new int[26];
        char b[]=s.toCharArray();
        for(int i=0;i<n/2;i++){
            a[b[i]-'a']++;
        }
        for(int i=0;i<26;i++){
            while(a[i]>0){
                b[j]=(char)('a'+i);
                b[n-1-j]=(char)('a'+i);
                j++;
                a[i]--;
            }
        }
        return new String(b);
        // for (int i = 0; i < n >>
    }
}