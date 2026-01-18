//LeetCode : 1351
//Count Negative Numbers in a Sorted Matrix

public class countNegative {
    public static void main (String[] args){
        int[][] grid = new int[][] {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int count = countNegatives(grid);
        System.out.println("The amount of Negative Integers in the Array is : "+count);
    }

    public static int countNegatives(int[][] grid){
        int count = 0;
        int cols = grid[0].length;
        for(int[] rows : grid){
            int start = 0,end = cols - 1;
            while (start<=end){
                int mid = start + (end - start) / 2;
                if(rows[mid]<0){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
            count += cols - start;
        }
        return count;
    }
}
