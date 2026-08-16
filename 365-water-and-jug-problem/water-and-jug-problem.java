class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
        return (target <= x+y && target % gcd(x,y)==0);
    }
    static int gcd(int x,int y){
        return y==0?x:gcd(y,x%y);
    }
}