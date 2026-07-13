class Solution {
    public int longestPalindrome(String s) {
        int count=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        boolean odd = false;
        for(char ch:map.keySet()){
            if(map.get(ch)%2==0){
                count =count+map.get(ch);
            }else{
                count=count+map.get(ch)-1;
                odd=true;
            }
        }
        if(odd==true){
            count++;
        }
        return count;
    }
}