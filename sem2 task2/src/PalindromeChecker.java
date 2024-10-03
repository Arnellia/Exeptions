public class PalindromeChecker {
    public static boolean isPalindrome(String input) {
        try {

String cleanedInput = input.replace(" ",
            "").toLowerCase();

            int length = cleanedInput.length();

            for (int i = 0; i < length / 2; i++) {
                if (cleanedInput.charAt(i) != cleanedInput.charAt(length - i - 1)) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {


            System.err.println("An error occurred.");
            return false;
        }
    }
}

