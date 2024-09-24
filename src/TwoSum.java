import java.util.HashMap;
import java.util.Map;
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        System.out.println(twoSum(nums, target));//For burte force
        System.out.println(twoSumoptimal(nums, target));//For optimal
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println(i + "," + j);
                }
            }
        }
        return nums;
    }

    public static int[] twoSumoptimal(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0 ;i<nums.length;i++){
            int x= target -nums[i];
            if(map.containsKey(x)){
                return new int []{map.get(x),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}
