public class Climbingstairs {
    class Solution {
        public int climbStairs(int n) {
            //return the number of amount of moves
            if (n == 0) {
                return 0;
            }
            if (n == 1) {
                return 1;
            }
            if (n == 2) {
                return 2;
            }
            //add the number of first move first second move together and return
            return climbStairs(n - 1) + climbStairs(n - 2);
        }
    }
}
