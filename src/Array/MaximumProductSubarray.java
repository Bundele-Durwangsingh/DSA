package Array;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int [] nums ={2,3,-2,4};
        System.out.println(maxProduct(nums));
    }
    public static int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        int start = 1;
        int end = 1;
        for(int i = 0; i<nums.length;i++){
            if(start==0){
                start =1;
            }
            if(end==0){
                end=1;
            }
            start= start * nums[i];
            end = end * nums[nums.length-i-1];
            max=Math.max(max,Math.max(start,end));
        }
        return max;
    }
}
