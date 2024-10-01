public class SearchinRotatedSortedArray {
    public static void main(String[] args) {
        int [] nums={4,5,6,7,0,1,2};
        int target =0;
        System.out.println("output from linear search");
        System.out.println(linearSearch(nums, target));
        System.out.println("output from binary search");
        System.out.println(binarySearch(nums, target));
    }

    public static int linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] nums, int target) {
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        while (leftIndex <= rightIndex) {
            int mid = leftIndex + (rightIndex - leftIndex) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] >= nums[leftIndex]) {
                if (nums[leftIndex] <= target && target <= nums[mid]) {
                    rightIndex = mid - 1;
                } else {
                    leftIndex = mid + 1;
                }

            } else {
                if (nums[mid] <= target && target <= nums[rightIndex]) {
                    leftIndex = mid + 1;
                } else {
                    rightIndex = mid - 1;
                }
            }

        }

        return -1;
    }
}
