package difficulty.medium;

public class Target_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Target_Sum s = new Target_Sum();
		s.findTargetSumWays(new int[] {1,1,1}, 3);
	}
	
    int count = 0;
    
    public int findTargetSumWays(int[] nums, int S) {
         findTargetSumWays(nums, S, 0, 0);
        return count;
    }
    
    public void findTargetSumWays(int[] nums, int S, int sum, int start) {
        if(S == sum && nums.length == start) {
            count++;
           
        } else if(start < nums.length){
        	findTargetSumWays(nums, S, sum-nums[start], start+1);
            findTargetSumWays(nums, S, sum+nums[start], start+1);
        } else {
        	
        }
     }
        

}
