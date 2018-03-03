package difficulty.hard;

public class Longest_Increasing_Path_in_a_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Longest_Increasing_Path_in_a_Matrix s = new Longest_Increasing_Path_in_a_Matrix();
		s.longestIncreasingPath( new int[][] {
			
			{7,7,5},
			{2,4,6},
			{8,2,0}
			
			
			
		});
		
		
	}
	
    public int longestIncreasingPath(int[][] matrix) {

        int maxNum = 0;
        
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                
                maxNum = Math.max(maxCount(matrix,  i,  j, Integer.MIN_VALUE, 1), maxNum);
            }
        }
        
        return maxNum;
            
    }
    
    public int maxCount(int[][] matrix, int i,  int j, int num, int count){
        
        if(i < 0 || j < 0 | i >= matrix.length || j >= matrix[0].length){
            return count-1;
        }
        if(matrix[i][j] <= num) {
            return count-1;
        } 
        
        int leftCount = maxCount(matrix,  i,  j-1, matrix[i][j], count+1);
        int rightCount = maxCount(matrix,  i,  j+1, matrix[i][j], count +1);
        int topCount = maxCount(matrix,  i-1,  j, matrix[i][j], count +1);
        int botCount = maxCount(matrix,  i+1,  j, matrix[i][j], count + 1);

        return Math.max( Math.max(leftCount, rightCount), Math.max(topCount, botCount));
        
    }

}
