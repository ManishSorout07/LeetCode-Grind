class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length()!= t.length()){
            return false;
        }

        HashMap<Character, Character> ans = new HashMap<>();
        
         for(int i=0; i<s.length(); i++){
            char org = s.charAt(i);
            char rep = t.charAt(i);

        if(!ans.containsKey(org)){
           if(!ans.containsValue(rep)){
              ans.put(org,rep);
           }
           else{
            return false;
           }
        }
        else{
             char mapChar = ans.get(org);

             if(mapChar!=rep){
                return false;
             }
        }


         }
         return true;
    }
}