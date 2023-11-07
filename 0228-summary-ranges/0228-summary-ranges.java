class Solution {
    public List<String> summaryRanges(int[] nums) {
        if(nums.length == 0) return new ArrayList<String>();
        ArrayList<String> result = new ArrayList<>();

        for(int i = 0; i<nums.length; i++){
            int start = nums[i];

            while(i+1 < nums.length &&  nums[i] + 1 == nums[i+1]) i++;

            if(start != nums[i]){
                result.add(""+start+"->"+nums[i]);
            }
            else result.add("" + start);
        }

        return result;

        // String currStr = ""+nums[0];
        // int count = 0;
        // for(int i = 0; i<nums.length; i++){
        //     if(i == nums.length - 1){
        //         if(currStr.length() != 0 && count != 0){
        //             currStr += "->"+nums[i];
        //             result.add(currStr);
        //         }
        //         else {
        //             result.add(""+nums[i]);
        //         }
        //     }
        //     else if(nums[i] + 1 != nums[i+1]){
        //         if(count != 0){
        //             currStr += "->" + nums[i];
        //         }
        //         result.add(currStr);
        //         currStr = ""+nums[i+1];
        //         count = 0;  
        //     }
        //     else{
        //         count++;
        //     }
        // }
        // return result;
    }
}