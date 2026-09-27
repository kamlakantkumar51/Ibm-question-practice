class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
    
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int maxfromright = arr[n-1];
        ans.add(maxfromright);
        
        for(int i = n-2;i>=0;i--){
            if(arr[i] >= maxfromright){
                maxfromright = arr[i];
                ans.add(maxfromright);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
