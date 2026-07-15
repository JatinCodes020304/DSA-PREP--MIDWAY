class Solution {
    public int gcdOfOddEvenSums(int n) {
        int so=0;
        int se=0;
        for(int i=1;i<=2*n-1;i+=2)
        {
            so+=i;
        }
        for(int i=2;i<=2*n;i+=2)
        {
            se+=i;
        }
        while(se!=0){
            int t=se;
            se=so%se;
            so=t;
        }
        return so;
        
    }
     
    }
