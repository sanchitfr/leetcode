class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int counter = m+n-1;
        m--;
        n--;
        while(m >=0 && n >= 0){
            if(nums1[m] > nums2[n]){
                nums1[counter] = nums1[m];
                counter--;
                m--;
            }
            else{
                nums1[counter] = nums2[n];
                n--;
                counter--;
            }
        }
        while(m >= 0){
            nums1[counter] = nums1[m];
            m--;
            counter--;
        }
        while(n >= 0){
            nums1[counter] = nums2[n];
            n--;
            counter--;
        }
    }
}
