class Solution {
    public int numberOfSubstrings(String s) {
        // int count =0;
        // int n = s.length();
        // for(int i=0;i<s.length();i++){
        //     int[]ans = new int[3];
        //     for(int j=i;j<s.length();j++){
        //         ans[s.charAt(j)-'a']=1;
        //         if(ans[0]+ans[1]+ans[2]==3){
        //             count = count + (n-j);
        //             break;
        //         }
        //     }
        // }
        // return count;

       int[] lastseen= {-1,-1,-1};
       int count =0;

       for(int i=0;i<s.length(); i++){
       lastseen[s.charAt(i)-'a']=i;

       if(lastseen[0]!=-1 && lastseen[1]!=-1 && lastseen[2]!=-1 ){
        int mini = Math.min(lastseen[0],Math.min(lastseen[1],lastseen[2]));
        count+= 1+mini;
       }

       }
    return count;
    }
}