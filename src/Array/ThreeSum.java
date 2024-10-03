package Array;
import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int [] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer =new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0 ; i <nums.length ; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int j = i+1;
            int k = nums.length -1;

            while(j<k){
                int output = nums[i]+nums[j]+nums[k];
                if(output>0){
                    k--;
                }else if(output<0){
                    j++;
                }else{
                    answer.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    while(nums[j]==nums[j-1] && j<k){
                        j++;
                    }
                }
            }
        }
        return answer;
    }
}
