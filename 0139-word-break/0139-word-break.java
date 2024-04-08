class Solution {
    public boolean wordBreak(String str, List<String> wordDict) {
         Set<String> word = new HashSet<>(wordDict);
        int n=str.length();
        boolean[] dp = new boolean[n+1];
        dp[0]=true;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                if(dp[j]&&word.contains(str.substring(j,i))){
                 dp[i]=true; 
                 break;
                }
            }
        }
        return dp[n];  
    }
}