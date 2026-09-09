class Solution {
    public boolean isPalindrome(String s) {

        String clean = "";

        // Remove non-alphanumeric characters
        
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
// convert uppercase to lowercase
            if (Character.isLetterOrDigit(ch)) {
                clean = clean + Character.toLowerCase(ch);
            }
        }

        // Check palindrome
        int left = 0;
        int right = clean.length() - 1;

        while (left < right) {

            if (clean.charAt(left) != clean.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}