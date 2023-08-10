public class Palindromenumber {
    class Solution {
        public boolean isPalindrome(int x) {
            
            // If x % 10 = 0, the first digit of x also has to be 0 in order to be a palindrome
            //if x is less than 0 = not palindrome
            if (x < 0 || (x != 0 && x % 10 == 0))
                return false;
            //flip the number around
            int reverse = 0;
            while (x > reverse) {
                reverse = reverse * 10 + x % 10;
                x = x / 10;
            }
            // If x is equal to reversed number then it is a palindrome
            // If x has odd number of digits, dicard the middle digit before comparing 
            return (x == reverse || x == reverse / 10);
        }
    }
}
