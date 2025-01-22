class LTcode001 {
    public boolean isPalindrome(int x) {
        // A negative number cannot be a palindrome
        // Also, numbers ending with 0 but not equal to 0 cannot be palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        // Revert half of the number and compare with the other half
        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // If the number is a palindrome, the original number (x) should be equal to the reversed half
        // For odd-length numbers, we can ignore the middle digit by revertedNumber / 10
        return x == revertedNumber || x == revertedNumber / 10;
    }

    public static void main(String[] args) {
        LTcode001 solution = new LTcode001();
        int x = 121;

        // Test the isPalindrome method
        boolean result = solution.isPalindrome(x);
        System.out.println("Is " + x + " a palindrome? " + result);
    }
}
