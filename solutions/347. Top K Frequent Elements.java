class Solution {
    HashMap<Integer, Integer> map;
    int[] unique;
    
    private void swap(int left, int right){
        int temp = unique[left];
        unique[left] = unique[right];
        unique[right] = temp;
    }
    
    private int partition(int left, int right, int pivotIndex){
        int pivotFrequency = map.get(unique[pivotIndex]);
        
        swap(pivotIndex, right);
        int storeIndex = left;
        
        for(int i = left; i<=right; i++){
            if(map.get(unique[i]) < pivotFrequency){
                swap(storeIndex, i);
                storeIndex++;
            }
        }
        
        swap(storeIndex, right);
        
        return storeIndex;
    }
    
    private void quickSelect(int left, int right, int k_smallest){
        if(left == right) return;
        Random random_num = new Random();
        int pivotIndex = left + random_num.nextInt(right - left);
        
        pivotIndex = partition(left, right,pivotIndex);
        
        if(pivotIndex == k_smallest) return;
        else if(pivotIndex < k_smallest) quickSelect(pivotIndex + 1, right, k_smallest);
        else quickSelect(left, pivotIndex-1, k_smallest);
    }
    
    public int[] topKFrequent(int[] nums, int k) {
        map = new HashMap<>();
        
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        int n = map.size();
        unique = new int[n];
        int index = 0;
        for(int i : map.keySet()){
            unique[index] = i;
            index++;
        }
        //System.out.println(Arrays.toString(unique));
        quickSelect(0, n-1, n-k);
        
        return Arrays.copyOfRange(unique, n-k, n);
    }
}
