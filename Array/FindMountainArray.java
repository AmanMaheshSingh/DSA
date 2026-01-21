// LeetCode 1095
// Find in Mountain Array

interface MountainArray {
    int get(int index);
    int length();
}

class MountainArrayImpl implements MountainArray {
    private int[] arr;

    MountainArrayImpl(int[] arr) {
        this.arr = arr;
    }

    public int get(int index) {
        return arr[index];
    }

    public int length() {
        return arr.length;
    }
}

public class FindMountainArray {

    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 7, 6, 4, 2};
        int target = 6;

        MountainArray mountainArr = new MountainArrayImpl(nums);

        System.out.println(findInMountainArray(target, mountainArr));
    }

    public static int findInMountainArray(int target, MountainArray mountainArr) {

        int peak = findPeak(mountainArr);

        int left = binarySearch(mountainArr, target, 0, peak, true);
        if (left != -1) return left;

        return binarySearch(
                mountainArr,
                target,
                peak + 1,
                mountainArr.length() - 1,
                false
        );
    }

    public static int findPeak(MountainArray arr) {
        int start = 0;
        int end = arr.length() - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr.get(mid) < arr.get(mid + 1)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    public static int binarySearch(
            MountainArray arr,
            int target,
            int start,
            int end,
            boolean isAsc
    ) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int value = arr.get(mid);

            if (value == target) return mid;

            if (isAsc) {
                if (target < value) end = mid - 1;
                else start = mid + 1;
            } else {
                if (target < value) start = mid + 1;
                else end = mid - 1;
            }
        }
        return -1;
    }
}
