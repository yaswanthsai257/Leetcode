class Solution {
    public int longestPalindrome(String str) {
        HashMap<Character,Integer> map=new LinkedHashMap<>();
       for(char ch:str.toCharArray()){
           map.put(ch,map.getOrDefault(ch,0)+1);
       }
       int res=0;
       boolean odd=false;

       for(Map.Entry<Character,Integer> c:map.entrySet()){
           if(c.getValue()%2==0){
               res+=c.getValue();
           }else{
               odd=true;
               res+=c.getValue()-1;
           }
       }
       if(odd){
           res++;
       }
        return res;
        
    }
}