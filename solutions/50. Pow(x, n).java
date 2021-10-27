class Solution {
    
    // private double helper(double x, int n){
    //     if(n == 0) return 1;
    //     double ans = 1;
    //     while(n != 0){
    //         if(n%2 == 0){
    //             x = x*x;
    //             n = n/2;
    //         }
    //         else{
    //             ans = ans*x;                
    //             n--;
    //         }
    //     }
    //     return ans;
    // }
    
    public double myPow(double x, int n) {
        if(n==0)
            return 1;
        double fm1=myPow(x,n/2);
        double ans=fm1*fm1;
        if(n<0){
            x=1/x;
        }
        if(n%2!=0){
            ans=ans*x;
        }
        return  ans;   
    }
}
