class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n/2; j++){
                if(j != n-1-j){
                    System.out.println(image[i][j] + " " + image[i][n-1-j]);
                    int temp = image[i][j];
                    image[i][j] = image[i][n-1 - j];
                    image[i][n-1-j] = temp;
                }

            }

            for(int j=0; j<n; j++) image[i][j] = (image[i][j] +1)%2;
            System.out.println(Arrays.toString(image[i]));
        }
        return image;
    }
}