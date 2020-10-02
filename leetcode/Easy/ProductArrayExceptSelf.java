import java.util.Arrays;
public class ProductArrayExceptSelf {

    public static int[] twoSum(int[] nums) {
        int[] ans = new int[nums.length];
        // [24,12,8,6]
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            System.out.println("\n");
            System.out.println("Loop where i = " + i);
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    product = product * nums[j];
                    System.out.println("value of j: " + nums[j]);
                }
            }
            ans[i] = product;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        System.out.println(Arrays.toString(twoSum(nums)));
    }
}

