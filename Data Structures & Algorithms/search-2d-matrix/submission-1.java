class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Treating 2D matrix as the flattened sorted array :
        // int rows = matrix.length;
        // int col = matrix[0].length;
        // int l = 0;
        // int r = (rows * col) - 1;
        // while(l <= r){
        //     int mid = l + (r-l)/2;
        //     if(matrix[mid/col][mid%col] == target){
        //         return true;
        //     }
        //     else if(matrix[mid/col][mid%col] > target){
        //         r = mid-1;
        //     }
        //     else{
        //         l = mid + 1;
        //     }
        // }
        // return false;

        // using the staircase search :

        int r = 0;
        int c = matrix[0].length-1;
        int rows = matrix.length;
        int col = matrix[0].length;
        while(r < rows && c >= 0 ){
            int curr = matrix[r][c];
            if(curr == target){
                return true;
            }
            else if(curr < target){
                r++;
            }
            else{
                c--;
            }
        }
        return false;
    }
}
