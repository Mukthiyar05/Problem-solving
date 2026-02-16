class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();

       Map<Character,Integer> map = new HashMap<>();
       if(sa.length!=ta.length){
        return false;
       }

       for(char ch:sa){
        map.put(ch,map.getOrDefault(ch,0)+1);
       }

       for(char ch:ta){
        if(!map.containsKey(ch)){
            return false;
        }
        map.put(ch,map.get(ch)-1); 

        if(map.get(ch)==0){
            map.remove(ch);
        }

       }
        return map.isEmpty();
    }
}
