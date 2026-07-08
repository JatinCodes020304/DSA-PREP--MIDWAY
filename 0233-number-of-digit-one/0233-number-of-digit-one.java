class Solution {
    public int countDigitOne(int n) {
        int a=0;
        for(long i=1;i<=n;i*=10){
            final long d=i*10;
            final int q=(int)(n/d);
            final int r=(int)(n%d);
            if(q>0){
                a+=q*i; }
            if(r>=i){
                a+=Math.min(r-i+1,i);
            }
        }
        return  a;
    }
}