class Solution {
    public boolean isSameAfterReversals(int num) {
        int r=0,rem=0,s=0,sum=0;
        int n=num;
        while(n!=0)
        {
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        int m=s;
        while(m!=0)
        {
            rem=m%10;
            sum=(sum*10)+rem;
            m=m/10;
        }
        if(sum==num)
        return(true);
        else 
        return(false);
        
    }
}
