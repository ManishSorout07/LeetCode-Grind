class Solution {
    public int longestPalindrome(String s) {
        
        int freq[] = new int[128];

        // for(int i=0; i<s.length(); i++){
        //     freq[s.charAt(i)]++;
        // }

        for(int ch: s.toCharArray()){
            freq[ch]++;
        }

        int res=0;
        for(int i=0; i<128;i++){
            int val=freq[i];
            res+=(val/2)*2;
            
            if(res%2==0 && val%2==1){
                res++;
            }
        }
        return res;
    }
}