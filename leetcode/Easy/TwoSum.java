import java.util.Arrays;

public class TwoSum {

    // New answer
    public static int[] twoSum(int[] nums, int targetNumber) {
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            System.out.println("\n");
            System.out.println("Loop where i = " + i);
            for (int j = 1; j < nums.length; j++) {
                if (i != j) {
                    System.out.println("j: " + j);
                    sum = nums[i] + nums[j];
                    if (sum == targetNumber) {
                        System.out.println("Found Target");
                        if (i > j) {
                            ans[0] = j;
                            ans[1] = i;
                        } else {
                            ans[0] = i;
                            ans[1] = j;
                        }
                    } else {
                        System.out.println("Not Found Target");
                    }
                }
            }
        }
        return ans;
    }

    // Old Solution
    public static int[] twoSumSolution(int[] nums, int target) {
        int[] ans = {0,0};
        for(int i =0; i<nums.length; i++){
            int potential= 0;
            potential = i; // 1
            System.out.println(potential);
            // target = 5
            // [6,3,1,2,21]
            for (int j=potential;j<nums.length-1;j++){
                if(nums[potential]+nums[j+1] == target){
                    ans[0] = potential;
                    ans[1] = j + 1;
                }
            }
        }  return ans;
    }

    public static void main(String[] args) {
        int[] ans = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] ansTwo = new int[]{0, 8, 9, 30};
        int targetTwo = 17;
        System.out.println("New Solution: ");
        System.out.println(Arrays.toString(twoSum(ansTwo, targetTwo)));
        System.out.println("*****************");
        System.out.println("Old Solution: ");
        System.out.println(Arrays.toString(twoSumSolution(ansTwo, targetTwo)));
    }
}
