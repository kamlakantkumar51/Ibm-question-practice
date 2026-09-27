class Solution {
    public static String encode(String s) {
        // code here
        StringBuilder ans = new StringBuilder();
        
        int n = s.length();
        
        for(int i=0;i<n;i++){
            int count = 1;
            
            while(i+1 < n && s.charAt(i) == s.charAt(i+1)){
                count++;
                i++;
            }
            ans.append(s.charAt(i));
            ans.append(count);
        }
        return ans.toString();
    }
}
