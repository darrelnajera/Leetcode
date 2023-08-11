class Solution {
    public int[] plusOne(int[] digits) {
        //length of array
        int length = digits.length;
        //iterate from last index to first
        for(int i = n-1; i >= 0; i--) {
            //if number at index is less than 9, add 1 to the number
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            //for any 9 we see, turn into 0
            digits[0];
        }
        //create new array for our solution we will return
        //add 1 number to old array for new number
        int[] newNumber = new int[n+1];
        //in the case its all 9's, replace number at first index with number 1
        newNumber[0] = 1;
        return newNumber;
    }
}