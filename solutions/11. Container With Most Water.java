class Solution {
    
    public int maxArea(int[] height) {
       if(height.length <= 1) return 0;
        
        int i = 0, j = height.length-1, max = 0;
        
        while(i < j){
            int temp = 0;
            if(height[i] < height[j]){
                temp = (j-i)*height[i];
                max = Math.max(max, temp);
                i++;
            }
            else{
                temp = (j-i)*height[j];
                max = Math.max(max, temp);
                j--;
            }
        }
        return max;
    }
}
