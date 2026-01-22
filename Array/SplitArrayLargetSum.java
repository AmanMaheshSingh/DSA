//LeetCode : 410
//Split Array Largest Sum

public class SplitArrayLargetSum {

    public static void main(String[] args) {
        int[] nums = {7, 2, 5, 10, 8};
        int m = 2;

        int ans = splitArray(nums, m);
        System.out.println(ans);
    }

    public static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        for (int num : nums) {
            start = Math.max(start, num);
            end += num;
        }

        while (start < end) {
            int mid = start + (end - start) / 2;

            int pieces = 1;
            int sum = 0;

            for (int num : nums) {
                if (sum + num > mid) {
                    pieces++;
                    sum = num;
                } else {
                    sum += num;
                }
            }

            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }
}

