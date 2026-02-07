//LeetCode : 1854
//Maximum Population Year

public class MaximumPopulationYear {
    public static void main(String[] args) {
        int[][] logs = {
                {1993, 1999},
                {2000, 2010},
                {1995, 2005}
        };

        int result = maximumPopulation(logs);
        System.out.println("Maximum population year: " + result);
    }

    public static int maximumPopulation(int[][] logs) {
        int[] year = new int[2051];
        for(int[] log: logs){
            year[log[0]]++;
            year[log[1]]--;
        }
        int maxPop = 0 , cur = 0, ans = 0;
        for(int i = 1950; i<=2050; i++){
            cur+=year[i];
            if(cur > maxPop){
                maxPop=cur;
                ans=i;
            }
        }
        return ans;
    }
}
