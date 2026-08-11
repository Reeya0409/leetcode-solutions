class Solution {
    public int fib(int n) {
        int [] arr=new int [n+1];
        Arrays.fill(arr,-1);
        return fibonacci(n,arr);    
    }
    static int fibonacci(int n, int arr[]){
        if(n<=1){
            return n;
        }
        if(arr[n]==-1){
            arr[n]=fibonacci(n-1,arr)+fibonacci(n-2,arr);
        }
        return arr[n];
    }
}