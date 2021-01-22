class Solution {
    
    int[] numbers;
    
    // private void swap(int left, int right){
    //     int temp = numbers[left];
    //     numbers[left] = numbers[right];
    //     numbers[right] = temp;
    // }
    
    private int partition(int left, int right){
        
        int x = numbers[right], storeIndex = left;
    
        for(int i = left; i<=right; i++){
            if(numbers[i] < x){
                int temp = numbers[i];
                numbers[i] = numbers[storeIndex];
                numbers[storeIndex] = temp;
                storeIndex++;
            }
        }
        
        int temp = numbers[right];
        numbers[right] = numbers[storeIndex];
        numbers[storeIndex] = temp;
        
        return storeIndex;
    }
    
    private void quickSelect(int left, int right, int position){
        if(left == right) return;
        
        int pivotPos = partition(left, right);
        
        if(pivotPos == position) return;
        else if(pivotPos < position) quickSelect(pivotPos+1, right, position);
        else quickSelect(left, pivotPos-1, position);
        
    }
    
    public int findKthLargest(int[] nums, int k) {
        numbers = nums;
        
        int n = nums.length;
