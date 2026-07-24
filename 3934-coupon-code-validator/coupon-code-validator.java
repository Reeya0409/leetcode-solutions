class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        Map<String, Integer> order = new HashMap<>();
        order.put("electronics", 0);
        order.put("grocery", 1);
        order.put("pharmacy", 2);
        order.put("restaurant", 3);
        List<String[]> list= new ArrayList<>();
        for(int i=0;i<isActive.length;i++){
            if(!isActive[i] || !order.containsKey(businessLine[i]) || code[i].isEmpty()){
                    continue;
            }
            boolean valid=true;
            for(char ch:code[i].toCharArray()){
                if(!Character.isLetterOrDigit(ch) && ch != '_'){
                    valid=false;
                    break;
                }
            }
            if(valid){
                list.add(new String[]{businessLine[i],code[i]});
            }
        }
        Collections.sort(list, (a, b) -> {
            int cmp = Integer.compare(order.get(a[0]), order.get(b[0]));
            if (cmp != 0) {
                return cmp;
            }
            return a[1].compareTo(b[1]);
        });
        List<String> ans = new ArrayList<>();
        for (String[] coupon : list) {
            ans.add(coupon[1]);
        }
        return ans;
    }
}