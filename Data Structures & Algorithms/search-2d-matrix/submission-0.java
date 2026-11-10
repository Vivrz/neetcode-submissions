class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int col = matrix[0].length;
        int l = 0;
        int r = (rows * col) - 1;
        while(l <= r){
            int mid = l + (r-l)/2;
            if(matrix[mid/col][mid%col] == target){
                return true;
            }
            else if(matrix[mid/col][mid%col] > target){
                r = mid-1;
            }
            else{
                l = mid + 1;
            }
        }
        return false;
    }
}
