import java.util.Arrays;

/**
 * Had to research ways for getting past length-1 in for loop since it wasnt
 * going through to the end of the for loop
 * Both i++ and ++i are i = i + 1.
 * In addition to changing the value of i, they also return the value of i:
 * i.e. returns value of i BEFORE adding one (i++) or AFTER adding one (++i).
 */
public class ContainsDuplicate {

    /**
     * Returns the same values
     */
    public static void loopExamples() {
        for (int i = 0; i < 5; i++) {
            System.out.println("i++: " + i);
        }
        for (int i = 0; i < 5; ++i) {
            System.out.println("++i: " + i);
        }
    }

    /**
     * A way to avoid the for (int i = 0; i < nums.length - 1; i++) error
     * Is by updating the value of i after you increments it ++i
     * @param nums
     * @return
     */
        public static boolean containsDuplicate ( int[] nums){
            boolean yesDuplicates = false;
            Arrays.sort(nums);
            for (int i = 0; i < nums.length - 1; ++i) {
                if (nums[i] == nums[i + 1]) {
                    yesDuplicates = true;
                }
            }
            return yesDuplicates;
        }

        public static void main (String[]args){
            int[] num = new int[]{2, 7, 11, 15, 2}; // true
            System.out.println(containsDuplicate(num));
            System.out.println("************");
            num = new int[]{0}; //false
            System.out.println(containsDuplicate(num));
            System.out.println("************");
            num = new int[]{1, 2, 3, 5, 6}; // false
            System.out.println(containsDuplicate(num));
            System.out.println("************");
            num = new int[]{-1, -2, -3}; // false
            System.out.println(containsDuplicate(num));
            System.out.println("************");
            num = new int[]{-1, -2, -1}; // true
            System.out.println(containsDuplicate(num));
            System.out.println("************");
            loopExamples();
        }
    }
