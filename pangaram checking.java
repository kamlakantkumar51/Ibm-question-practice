class Solution {
    public static boolean checkPangram(String s) {
        
        
        boolean visited[] = new boolean[26];
        
        for(char ch:s.toLowerCase().toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                visited[ch-'a'] = true;
            }
        }
        
        for(boolean x:visited){
            if(!x) return false;
        }
        
        return true;
    }
}
