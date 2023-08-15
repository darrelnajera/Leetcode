public class Movezeroes {
    class Solution {
        public void moveZeroes(int[] nums) {
            int n = nums.length;
            if(n < 2) return;
            //indices for current and next number. position 0 is first 1 is next
            int current = 0;
            int next = 1;
            
            //while loop that stops at end of array
            while(next < n) {
                //if current number is not 0, move both left and to the right
                if(nums[current] != 0) {
                    current++;
                    next++;
                    //if next number is equal to 0, keep it on the right
                } else if(nums[next] == 0){
                    next++;
                    //develop temporary variable to swap numbers
                } else {
                    int temporary = nums[next];
                    nums[next] = nums [current];
                    nums[current] = temporary;
    
                }
            }
    
        }
    }
}
