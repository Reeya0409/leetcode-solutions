// class Solution {
//     public int fib(int n) {
//         int [] arr=new int [n+1];
//         Arrays.fill(arr,-1);
//         return fibonacci(n,arr);    
//     }
//     static int fibonacci(int n, int arr[]){
//         if(n<=1){
//             return n;
//         }
//         if(arr[n]==-1){
//             arr[n]=fibonacci(n-1,arr)+fibonacci(n-2,arr);
//         }
//         return arr[n];
//     }
// }

// Bottom-Up DP / Tabulation
class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for (int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}