//LeetCode : 574
//Reach a Number

public class ReachANumber {
    static void main(String[] args) {
        int target = 2;
        System.out.println(reachNumber(target));
    }

    public static int reachNumber(int target) {
        target = Math.abs(target);
        int sum = 0,steps = 0;
        while(sum<target || (sum-target)%2!=0){
           steps++;
           sum+=steps;
        }
        return steps;
    }
}
