class Solution {
    public boolean subArrayExists(int arr[]) {
        // code here
        
        Set<Integer> subset = new HashSet<>();
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            
            if(sum == 0 || subset.contains(sum)){
                return true;
            }
            
            subset.add(sum);
        }
        return false;
    }
}
