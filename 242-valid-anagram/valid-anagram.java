class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> freq=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(char ch:s.toCharArray()){
            if(freq.containsKey(ch)){
                freq.put(ch,freq.get(ch)+1);
            }else{
                freq.put(ch,1);
            }
        }
        for(char ch:t.toCharArray()){
            if(!freq.containsKey(ch)){
                return false;
            }
            freq.put(ch,freq.get(ch)-1);
            if(freq.get(ch)==0){
                freq.remove(ch);
            }
        }
        
        return freq.isEmpty();
    }
}