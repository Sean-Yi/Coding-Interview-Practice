package difficulty.medium;

import java.util.Arrays;

public class MinimumNumberofArrowstoBurstBalloons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] points = new int[][] {
			
			//{1,2},{3,4},{5,6},{7,8}
			//{10,16},{2,8},{1,6},{7,12}
			{3,9},{7,12},{3,8},{6,8},{9,10},{2,9},{0,9},{3,9},{0,6},{2,8}
			//{9,12},{1,10},{4,11},{8,12},{3,9},{6,9},{6,7}
		};
		
		MinimumNumberofArrowstoBurstBalloons s = new MinimumNumberofArrowstoBurstBalloons();
		s.findMinArrowShots(points);

	}
    public int findMinArrowShots(int[][] points) {
    	if(points.length == 0) return 0;
        Arrays.sort(points, (p1, p2) -> (p1[0] != p2[0]) ? p1[0] - p2[0] : p1[1] - p2[1] );
        int count = 1;
        int end = points[0][1];
        
        for(int i = 1; i < points.length; i++) {
            //not conflect
            if(points[i][0] > end) {
                count++;
                end = points[i][1];
            } else {
            	end = Math.min(end, points[i][1]);
            }
            
        }
        
        return count;
    }

}
