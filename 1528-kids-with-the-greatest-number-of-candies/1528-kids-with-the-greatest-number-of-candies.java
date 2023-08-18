class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandy = -1, length = candies.length;
        ArrayList<Boolean> arr = new ArrayList<Boolean>(candies.length);

        for(int i = 0; i<length; i++){
            if(candies[i] > maxCandy) maxCandy = candies[i];
        }

        for(int i = 0; i<length; i++){
            if(candies[i]+extraCandies >= maxCandy) arr.add(true);
            else arr.add(false);
        }

        return arr;
    }
}