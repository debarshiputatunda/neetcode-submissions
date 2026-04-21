class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length / 2, c = matrix[0].length, visited = 0;

        while (row < matrix.length && row >= 0){
            if(visited == matrix.length * c) return false;
            if (target > matrix[row][c - 1]){
                row ++; 
                visited += c;
                continue;
            } else if (target < matrix[row][0]) {
                row --; 
                visited += c;
                continue;
            } else {
                int start = 0, end = c;
                while (start <= end){
                    int mid = start + (end - start) / 2;
                    if (matrix[row][mid] == target) return true;
                    if (matrix[row][mid] < target){
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
                return false;
            }
        }
        return false;
    }
}
