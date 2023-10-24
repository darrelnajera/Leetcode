public class Lengthoflastword {
    class Solution {
        public int lengthOfLastWord(String s) {
            //store variable for the first letter of the last word
            int first = 0;
    
            //iterate through string in reverse
            for(int i = s.length()-1 ; i > 0; i--) {
                //while iterating, look for first non space char
                //if char is non space, assign to int first and break
                if(s.charAt(i)!= '' && s.charAt(i-1) == '') {
                    first = i;
    
                    break;
                }
            }
            //string that will be as a result of trimming the string starting at int first
            String temp = s.substring(first).trim();
            //return length of trimmed string(last word)
            return temp.length();
        }
    }
}
