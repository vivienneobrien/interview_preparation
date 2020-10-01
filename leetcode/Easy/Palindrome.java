public class Palindrome {

    /**
     * Breakdown:
     * Step 1. If number is negative return false
     * Step 2. If number is equal to the reverse of that number return true
     * Step 3. If not return false
     * @param number
     * @return
     */
    public static boolean isPalendrome(int number) {
        boolean ans = false;
        if (number < 0) {
            ans = false;
        } else if (number == reversedNumber(number)) {
            ans = true;
        } else {
            ans = false;
        }
        return ans;
    }

    /**
     * Breakdown:
     * Step 1. While number is not 0
     * Step 2. Get last number by getting the remainder
     * Step 3. Multiple it by 10
     * Step 4. Add the remainder
     * Step 5. Divide the number by 10 to get rid of the last digit from number
     * @param number
     * @return
     */
    public static int reversedNumber(int number) {
        int reversed = 0;
        int remainder;
        while (number > 0) { // while number is not negative
            remainder = (number % 10); // 9
            System.out.println("Loop:");
            System.out.println("Remainder: " + remainder);
            System.out.println("Remainder * 10: " + reversed*10);
            reversed = (reversed * 10) + remainder;
            System.out.println("Reversed*10 + Remainder: " + reversed);
            number = number / 10;
            System.out.println("After dividing number by 10 it becomes: " + number);
            System.out.println("\n");
        }
        reversed = reversed + number;
        return reversed;
    }


    public static void main(String[] args) {
        int num = 6996;
        System.out.println("\n**************\n");
        System.out.println("To understand reversedNumber function when num = 6996:");
        System.out.println(reversedNumber(num)); // true
        System.out.println("\n**************\n");

        num = 6996;
        System.out.println("\nPalindrome Use Case Tests: Normal Case, Single Number, Negative Numbers & Not Balanced Numbers\n");
        System.out.println("When num = 6996: "); // true
        System.out.println("When num = 6996, the answer = " + isPalendrome(num)); // true
        System.out.println("\n**************\n");
        num = 1;
        System.out.println("When num = 1: ");
        System.out.println("When num = 1, the answer = " + isPalendrome(num)); // false
        System.out.println("\n**************\n");
        num = -6996;
        System.out.println("When num = -6996: ");
        System.out.println("When num = -6996, the answer = " + isPalendrome(num)); // false
        System.out.println("\n**************\n");
        num = 699;
        System.out.println("When num = 699: ");
        System.out.println("When num = 699, the answer = " + isPalendrome(num)); // false
        System.out.println("\n**************\n");
    }
}

