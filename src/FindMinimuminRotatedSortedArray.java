import java.util.Arrays;

public class FindMinimuminRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = { 11, 13, 15, 17 };
        System.out.println("Answer from linear search : " + findMinLinear(nums));
        System.out.println("Answer from binary search : " + findMinBinary(nums));
        System.out.println("Answer from Sorting and search : " + findMinSorted(nums));
    }

    public static int findMinLinear(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }

    public static int findMinBinary(int[] nums) {
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        while (leftIndex < rightIndex) {
            int midIndex = leftIndex + (rightIndex - leftIndex) / 2;
            if (nums[midIndex] < nums[rightIndex]) {
                rightIndex = midIndex;
            } else {
                leftIndex = midIndex + 1;
            }
        }
        return nums[leftIndex];
    }

    public static int findMinSorted(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }
}
