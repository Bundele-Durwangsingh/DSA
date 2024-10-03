package Array;
import java.util.Arrays;

public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = { -1, 1, 0, -3, 3 };
        System.out.println(productExceptSelf(nums));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        Arrays.fill(ans, 1);
        int elementleft = 1;
        for (int i = 0; i < nums.length; i++) {
            ans[i] *= elementleft;
            elementleft *= nums[i];
        }
        int elementright = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] *= elementright;
            elementright *= nums[i];
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
}
